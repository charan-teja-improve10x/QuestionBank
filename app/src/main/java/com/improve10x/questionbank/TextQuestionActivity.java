package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TextQuestionActivity extends AppCompatActivity implements IQuestionsActivity {
    Button verifyBlankBtn;
    TextView textQuestionTxt;
    EditText answerTxt;
    String question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_question);
        initViews();
        getQuestions();
        displayQuestions();
        handleVerifyBtn();
    }

    @Override
    public void handleVerifyBtn() {
        verifyBlankBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    @Override
    public void verifyAnswer() {
        String correctAnswer = getSelectedOptions();
        if (answer.equalsIgnoreCase(correctAnswer)) {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Sorry, Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public String getSelectedOptions() {
        String enterdAnswer = answerTxt.getText().toString();
        return enterdAnswer;
    }

    @Override
    public void displayQuestions() {
        textQuestionTxt.setText(question);
    }

    @Override
    public void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        answer = intent.getStringExtra("answer");
    }

    public void initViews() {
        textQuestionTxt = findViewById(R.id.text_question_txt);
        verifyBlankBtn = findViewById(R.id.verify_blank_btn);
        answerTxt = findViewById(R.id.answer_txt);
    }
}