package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TextQuestionActivity extends AppCompatActivity implements IQuestionsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_question);
    }

    @Override
    public void handleVerifyBtn() {

    }

    @Override
    public void verifyAnswer() {

    }

    @Override
    public String getSelectedOptions() {
        return null;
    }

    @Override
    public void displayQuestions() {

    }

    @Override
    public void getQuestions() {

    }
}