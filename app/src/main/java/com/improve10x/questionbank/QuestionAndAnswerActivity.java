package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class QuestionAndAnswerActivity extends AppCompatActivity {
    TextView questionTxt;
    CheckBox optionOneCb;
    CheckBox optionTwoCb;
    CheckBox optionThreeCb;
    CheckBox optionFourCb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_and_answer);
        initViews();
    }

    private void initViews() {
        questionTxt = findViewById(R.id.question_cb_txt);
        optionOneCb = findViewById(R.id.option_one_cb);
        optionTwoCb = findViewById(R.id.option_two_cb);
        optionThreeCb = findViewById(R.id.option_three_cb);
        optionFourCb = findViewById(R.id.option_four_cb);
    }
}