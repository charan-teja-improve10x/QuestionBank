package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IQuestionsActivity {
    TextView seekBarTxt;
    Button verifySbBtn;
    SeekBar orderInfoSb;
    String question;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
        handleInitViews();
        getQuestions();
        displayQuestions();
        handleVerifyBtn();
    }

    @Override
    public void handleVerifyBtn() {
        verifySbBtn.setOnClickListener(v -> {
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
        int progress = orderInfoSb.getProgress();
        return progress + "";
    }

    @Override
    public void displayQuestions() {
        seekBarTxt.setText(question);
    }

    @Override
    public void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        answer = intent.getStringExtra("answer");
    }

    public void handleInitViews() {
        seekBarTxt = findViewById(R.id.seek_bar_txt);
        orderInfoSb = findViewById(R.id.order_info_sb);
        verifySbBtn = findViewById(R.id.verify_sb_btn);
    }
}