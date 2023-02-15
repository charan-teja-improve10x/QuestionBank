package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IQuestionsActivity{
    TextView seekBarTxt;
    Button verifySbBtn;
    SeekBar orderInfoSb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
        handleInitViews();
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
    public void handleInitViews(){
        seekBarTxt = findViewById(R.id.seek_bar_txt);
        orderInfoSb = findViewById(R.id.order_info_sb);
        verifySbBtn = findViewById(R.id.verify_sb_btn);
    }
}