package com.example.learning.others;

import android.util.Log;

import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_quiz;
import com.example.learning.Models.RetrofitClient;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuizDataProvider {
    private static final Map<String, Map<String, String[]>> quizData = new HashMap<>();

    // Method to set quiz data for a specific course
    public static void setQuizData(String courseName, Map<String, String[]> data) {
        quizData.put(courseName, data);
    }

    // Method to get quiz data for a specific course
    public static Map<String, String[]> getQuizDataForCourse(String courseName) {
        return quizData.get(courseName);
    }

    // Method to fetch quiz data from the server and set it to QuizDataProvider
    public static void fetchQuizData(String courseName) {
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_quiz> call = apiInterface.get_quiz("get_quiz", courseName);
        call.enqueue(new Callback<Get_quiz>() {
            @Override
            public void onResponse(Call<Get_quiz> call, Response<Get_quiz> response) {
                if (response.isSuccessful()) {
                    Get_quiz getQuiz = response.body();
                    if (getQuiz != null && getQuiz.getGetQuiz() != null) {
                        List<Get_quiz.GetQuiz> allQuestions = getQuiz.getGetQuiz();
                        // Shuffle the list to randomize the order of questions
                        Collections.shuffle(allQuestions);
                        // Select the first 20 questions
                        List<Get_quiz.GetQuiz> randomQuestions = allQuestions.subList(0, Math.min(20, allQuestions.size()));
                        // Set the fetched quiz data to QuizDataProvider
                        setQuizData(courseName, convertToMap(randomQuestions));
                    }
                } else {
                    Log.e("QuizDataProvider", "Failed to fetch quiz data for course: " + courseName);
                }
            }

            @Override
            public void onFailure(Call<Get_quiz> call, Throwable t) {
                Log.e("QuizDataProvider", "Failed to fetch quiz data for course: " + courseName, t);
            }
        });
    }

    // Helper method to convert List<Get_quiz.GetQuiz> to Map<String, String[]>
    private static Map<String, String[]> convertToMap(List<Get_quiz.GetQuiz> questions) {
        Map<String, String[]> quizData = new HashMap<>();
        for (Get_quiz.GetQuiz question : questions) {
            String questionText = question.getQuestion();
            String[] options = new String[]{question.getA(), question.getB(), question.getC(),
                    question.getD(), question.getAnswer()};
            quizData.put(questionText, options);
        }
        return quizData;
    }
}
