package com.example.learning.activities;

import static androidx.fragment.app.FragmentManager.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learning.Models.ApiInterface;
import com.example.learning.Models.Get_quiz;
import com.example.learning.Models.RetrofitClient;
import com.example.learning.R;
import com.example.learning.others.CustomLoadingDialog;
import com.example.learning.others.QuizDataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TakeQuizActivity extends AppCompatActivity {

    TextView quiz_question;
    TextView quiz_option1, quiz_option2, quiz_option3, quiz_option4;
    TextView quiz_current_question, quiz_total_question;
    TextView activity_name;
    ImageView back_icon;
    Map<String, String[]> currentQuizData;
    private int currentQuestionIndex = 0;
    private int correct_answer = 0;
    private int wrong_answer = 0;
    TextView quiz_correct_answer, quiz_wrong_answer;
    Button next_question;
    Boolean optionClicked = false;
    String course_name, course_id;
    private CustomLoadingDialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_quiz);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        loadingDialog = new CustomLoadingDialog(this);
        activity_name = findViewById(R.id.activity_name);
        back_icon = findViewById(R.id.back_icon);
        back_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        course_name = intent.getStringExtra("course_name");
        course_id = intent.getStringExtra("course_id");
        activity_name.setText(course_name);

        quiz_question = findViewById(R.id.quiz_question);
        quiz_option1 = findViewById(R.id.quiz_option1);
        quiz_option2 = findViewById(R.id.quiz_option2);
        quiz_option3 = findViewById(R.id.quiz_option3);
        quiz_option4 = findViewById(R.id.quiz_option4);
        quiz_current_question = findViewById(R.id.quiz_current_question);
        quiz_total_question = findViewById(R.id.quiz_total_question);
        quiz_correct_answer = findViewById(R.id.quiz_correct_answer);
        quiz_wrong_answer = findViewById(R.id.quiz_wrong_answer);
        next_question = findViewById(R.id.next_question);
        fetchQuizData();
        updateQuestion(currentQuestionIndex);

        quiz_option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionClicked = true;
                String questionKey = (String) currentQuizData.keySet().toArray()[currentQuestionIndex];
                String[] questionAndOptions = currentQuizData.get(questionKey);
                String correctAnswer = questionAndOptions[questionAndOptions.length - 1];

                String lastIndexValue = questionAndOptions[questionAndOptions.length - 1];
                String selectedOptionText = quiz_option1.getText().toString();

                if (lastIndexValue.equals(selectedOptionText)) {
                    quiz_option1.setBackgroundResource(R.drawable.quiz_correct_option);
                    correct_answer++;
                    quiz_correct_answer.setText(String.valueOf(correct_answer));
                    setAnimation(quiz_option1);
                } else {
                    quiz_option1.setBackgroundResource(R.drawable.quiz_wrong_option);
                    wrong_answer++;
                    quiz_wrong_answer.setText(String.valueOf(wrong_answer));
                    setAnimation(quiz_option1);
                }
                disable234option();
            }
        });

        quiz_option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionClicked = true;
                String questionKey = (String) currentQuizData.keySet().toArray()[currentQuestionIndex];
                String[] questionAndOptions = currentQuizData.get(questionKey);
                String correctAnswer = questionAndOptions[questionAndOptions.length - 1];

                String lastIndexValue = questionAndOptions[questionAndOptions.length - 1];
                String selectedOptionText = quiz_option2.getText().toString();

                if (lastIndexValue.equals(selectedOptionText)) {
                    quiz_option2.setBackgroundResource(R.drawable.quiz_correct_option);
                    correct_answer++;
                    quiz_correct_answer.setText(String.valueOf(correct_answer));
                    setAnimation(quiz_option2);
                } else {
                    quiz_option2.setBackgroundResource(R.drawable.quiz_wrong_option);
                    wrong_answer++;
                    quiz_wrong_answer.setText(String.valueOf(wrong_answer));
                    setAnimation(quiz_option2);
                }

                disable134option();
            }
        });

        quiz_option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionClicked = true;
                String questionKey = (String) currentQuizData.keySet().toArray()[currentQuestionIndex];
                String[] questionAndOptions = currentQuizData.get(questionKey);
                String correctAnswer = questionAndOptions[questionAndOptions.length - 1];

                String lastIndexValue = questionAndOptions[questionAndOptions.length - 1];
                String selectedOptionText = quiz_option3.getText().toString();

                if (lastIndexValue.equals(selectedOptionText)) {
                    quiz_option3.setBackgroundResource(R.drawable.quiz_correct_option);
                    correct_answer++;
                    quiz_correct_answer.setText(String.valueOf(correct_answer));
                    setAnimation(quiz_option3);
                } else {
                    quiz_option3.setBackgroundResource(R.drawable.quiz_wrong_option);
                    wrong_answer++;
                    quiz_wrong_answer.setText(String.valueOf(wrong_answer));
                    setAnimation(quiz_option3);
                }

                disable124option();
            }
        });

        quiz_option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                optionClicked = true;
                String questionKey = (String) currentQuizData.keySet().toArray()[currentQuestionIndex];
                String[] questionAndOptions = currentQuizData.get(questionKey);
                String correctAnswer = questionAndOptions[questionAndOptions.length - 1];

                String lastIndexValue = questionAndOptions[questionAndOptions.length - 1];
                String selectedOptionText = quiz_option4.getText().toString();

                if (lastIndexValue.equals(selectedOptionText)) {
                    quiz_option4.setBackgroundResource(R.drawable.quiz_correct_option);
                    correct_answer++;
                    quiz_correct_answer.setText(String.valueOf(correct_answer));
                    setAnimation(quiz_option4);
                } else {
                    quiz_option4.setBackgroundResource(R.drawable.quiz_wrong_option);
                    wrong_answer++;
                    quiz_wrong_answer.setText(String.valueOf(wrong_answer));
                    setAnimation(quiz_option4);
                }
                disable123option();
            }
        });
    }

    private void fetchQuizData() {
        loadingDialog.show();
        ApiInterface apiInterface = RetrofitClient.getClient().create(ApiInterface.class);
        Call<Get_quiz> call = apiInterface.get_quiz("get_quiz", course_id);
        call.enqueue(new Callback<Get_quiz>() {
            @SuppressLint({"NotifyDataSetChanged" , "RestrictedApi"})
            @Override
            public void onResponse(@NonNull Call<Get_quiz> call, @NonNull Response<Get_quiz> response) {
                if (response.isSuccessful()) {
                    loadingDialog.dismiss();
                    Get_quiz getQuiz = response.body();
                    if (getQuiz != null && getQuiz.getGetQuiz() != null) {
                        List<Get_quiz.GetQuiz> allQuestions = getQuiz.getGetQuiz();
                        // Shuffle the list to randomize the order of questions
                        // Shuffle the list to randomize the order of questions
                        Collections.shuffle(allQuestions);

                        // Select the first 20 questions from the shuffled list
                        List<Get_quiz.GetQuiz> randomQuestions = allQuestions.subList(0,
                                Math.min(20, allQuestions.size()));
                        // Set the fetched quiz data to QuizDataProvider
                        QuizDataProvider.setQuizData(course_name, convertToMap(randomQuestions));
                        // Start quiz after fetching data
                        startQuiz();
                    }
                } else {
                    loadingDialog.dismiss();
                    Log.e(TAG, "Unsuccessful response: " + response.message());
                }
            }

            @SuppressLint("RestrictedApi")
            @Override
            public void onFailure(@NonNull Call<Get_quiz> call, @NonNull Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });
    }

    private void startQuiz() {
        currentQuizData = QuizDataProvider.getQuizDataForCourse(course_name);
        if (currentQuizData != null) {
            updateQuestion(currentQuestionIndex);
        } else {
            Toast.makeText(this, "Failed to fetch quiz data", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    private void updateQuestion(int index) {
        optionClicked = false;
        resetOptionClicks();
        resetOptionBackgrounds();

        if (currentQuizData != null) {
            String questionKey = (String) currentQuizData.keySet().toArray()[index];
            String[] questionAndOptions = currentQuizData.get(questionKey);

            String currentQuestion = questionKey;
            String[] options = Arrays.copyOfRange(questionAndOptions, 0, questionAndOptions.length - 1);

            quiz_question.setText(currentQuestion);

            quiz_option1.setText(options[0]);
            quiz_option2.setText(options[1]);
            quiz_option3.setText(options[2]);
            quiz_option4.setText(options[3]);

            quiz_current_question.setText(" " + (index + 1));
            quiz_total_question.setText(" / " + currentQuizData.size());

            if (index == currentQuizData.size() - 1) {
                next_question.setText("Submit");
                next_question.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(TakeQuizActivity.this, TakeQuizResult.class);
                        intent.putExtra("correct_answer", correct_answer);
                        intent.putExtra("course_id", course_id);
                        intent.putExtra("wrong_answer", wrong_answer);
                        startActivity(intent);
                        finish();
                    }
                });
            } else {
                next_question.setText("Next Question");
                next_question.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (optionClicked) {
                            currentQuestionIndex = (currentQuestionIndex + 1) % currentQuizData.size();
                            updateQuestion(currentQuestionIndex);
                        } else {
                            Toast.makeText(TakeQuizActivity.this, "Please Select Option", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }
    }

    private void resetOptionClicks() {
        quiz_option1.setClickable(true);
        quiz_option2.setClickable(true);
        quiz_option3.setClickable(true);
        quiz_option4.setClickable(true);
    }

    private void resetOptionBackgrounds() {
        quiz_option1.setBackgroundResource(R.drawable.quiz_option);
        quiz_option2.setBackgroundResource(R.drawable.quiz_option);
        quiz_option3.setBackgroundResource(R.drawable.quiz_option);
        quiz_option4.setBackgroundResource(R.drawable.quiz_option);
    }
    private void disable234option() {
        quiz_option1.setClickable(false);
        quiz_option2.setClickable(false);
        quiz_option3.setClickable(false);
        quiz_option4.setClickable(false);
    }
    private void disable134option() {
        quiz_option1.setClickable(false);
        quiz_option2.setClickable(false);
        quiz_option3.setClickable(false);
        quiz_option4.setClickable(false);
    }
    private void disable124option() {
        quiz_option1.setClickable(false);
        quiz_option2.setClickable(false);
        quiz_option3.setClickable(false);
        quiz_option4.setClickable(false);
    }
    private void disable123option() {
        quiz_option1.setClickable(false);
        quiz_option2.setClickable(false);
        quiz_option3.setClickable(false);
        quiz_option4.setClickable(false);
    }

    public void setAnimation(TextView textView) {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_animation);
        textView.startAnimation(animation);
    }

    // Helper method to convert List<Get_quiz.GetQuiz> to Map<String, String[]>
    private Map<String, String[]> convertToMap(List<Get_quiz.GetQuiz> questions) {
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
