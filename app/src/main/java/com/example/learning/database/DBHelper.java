package com.example.learning.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Learning";
    public static final int DATABASE_VERSION = 2;

    public static final String FAVOURITE_COURSE_TABLE = "FavouriteCourse";
    public static final String ENROLL_COURSE_TABLE = "EnrollCourse";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String query2 = "CREATE TABLE "+FAVOURITE_COURSE_TABLE+"("+
                "course_name TEXT,"+
                "category_name TEXT,"+
                "Email TEXT,"+
                "image BLOB"+  // Change to BLOB
                ")";
        sqLiteDatabase.execSQL(query2);

        String query3 = "CREATE TABLE "+ENROLL_COURSE_TABLE+"("+
                "course_name TEXT,"+
                "cat_image_name BLOB,"+ // Change to BLOB
                "cat_name TEXT,"+
                "cat_type TEXT,"+
                "Email TEXT"+
                ")";
        sqLiteDatabase.execSQL(query3);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+FAVOURITE_COURSE_TABLE);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+ENROLL_COURSE_TABLE);
        onCreate(sqLiteDatabase);
    }

    // favourite
    public boolean isCourseInFavorites(String courseName, String category, String email) {
        SQLiteDatabase database = getWritableDatabase();
        String table = FAVOURITE_COURSE_TABLE;
        String[] columns = {"course_name"};
        String selection = "course_name = ? AND category_name = ? AND email = ?";
        String[] selectionArgs = {courseName, category, email};

        Cursor cursor = database.query(table, columns, selection, selectionArgs, null, null, null);
        boolean isInFavorites = cursor.getCount() > 0;
        cursor.close();

        return isInFavorites;
    }
    public boolean insert_favourite_course(String i, String c, String email, byte[] image) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("course_name", i);
        values.put("category_name", c);
        values.put("email", email);
        values.put("image", image);  // Inserting image as BLOB
        long res = database.insert(FAVOURITE_COURSE_TABLE, null, values);
        return res > 0;
    }

    public Cursor fetch_favourite_course(String email){
        SQLiteDatabase database = getWritableDatabase();
        String[] projection = {"course_name","category_name","image"};
        String selection = "email = ?";
        String[] selectionArgs = {email};
        Cursor cursor = database.query(FAVOURITE_COURSE_TABLE,projection,selection,selectionArgs,null,null,null);
        return cursor;
    }

    public boolean delete_favourite_course(String i, String c, String email) {
        SQLiteDatabase database = getWritableDatabase();
        String whereClause = "course_name = ? AND category_name = ? AND email = ?";
        String[] whereArgs = {i, c, email};
        long res = database.delete(FAVOURITE_COURSE_TABLE, whereClause, whereArgs);
        return res > 0;
    }


    //enroll course
    public boolean insert_enroll_course(String courseName, byte[] catImageName, String catName, String catType, String e) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("course_name", courseName);
        values.put("cat_image_name", catImageName); // Store the image name for reference
        values.put("cat_name", catName);
        values.put("cat_type", catType);
        values.put("email", e);
        long res = database.insert(ENROLL_COURSE_TABLE, null, values);
        return res > 0;
    }

    public boolean isCourseEnroll(String course_name, String cat_name, String e) {
        SQLiteDatabase database = getWritableDatabase();
        String table = ENROLL_COURSE_TABLE;
        String[] columns = {"course_name"};
        String selection = "course_name = ? AND cat_name = ? AND Email = ?";
        String[] selectionArgs = {course_name, cat_name, e};

        Cursor cursor = database.query(table, columns, selection, selectionArgs, null, null, null);
        boolean isInEnroll= cursor.getCount() > 0;
        cursor.close();

        return isInEnroll;
    }
    public Cursor fetch_enroll_course(String email){
        SQLiteDatabase database = getWritableDatabase();
        String[] projection = {"course_name","cat_name","cat_image_name","cat_type"};
        String selection = "Email = ?";
        String[] selectionArgs = {email};
        Cursor cursor = database.query(ENROLL_COURSE_TABLE,projection,selection,selectionArgs,null,null,null);
        return cursor;
    }

}
