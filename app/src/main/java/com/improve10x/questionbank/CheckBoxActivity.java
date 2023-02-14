package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class CheckBoxActivity   extends AppCompatActivity implements IQuestionsActivity {
    TextView questionTxt;
    CheckBox optionOneCb;
    CheckBox optionTwoCb;
    CheckBox optionThreeCb;
    CheckBox optionFourCb;
    Button verifyBtn;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        initViews();
        getQuestions();
        displayQuestions();
        handleVerifyBtn();
    }

    @Override
    public void handleVerifyBtn() {
        verifyBtn.setOnClickListener(v -> {
            verifyAnswer();
        });
    }

    @Override
    public void verifyAnswer() {
        String correctAnswer = getSelectedOptions();
        if (answer.equals(correctAnswer)) {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Sorry, Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public String getSelectedOptions() {
        boolean selectedOption1 = optionOneCb.isChecked();
        boolean selectedOption2 = optionTwoCb.isChecked();
        boolean selectedOption3 = optionThreeCb.isChecked();
        boolean selectedOption4 = optionFourCb.isChecked();
        String result = " ";
        if (selectedOption1 == true) {
            result = "a";
        } else if (selectedOption2 == true) {
            result = "b";
        } else if (selectedOption3 == true) {
            result = "c";
        } else if (selectedOption4 == true) {
            result = "d";
        }
        return result;
    }

    @Override
    public void displayQuestions() {
        questionTxt.setText(question);
        optionOneCb.setText(optionA);
        optionTwoCb.setText(optionB);
        optionThreeCb.setText(optionC);
        optionFourCb.setText(optionD);
    }

    @Override
    public void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        optionA = intent.getStringExtra("optionA");
        optionB = intent.getStringExtra("optionB");
        optionC = intent.getStringExtra("optionC");
        optionD = intent.getStringExtra("optionD");
        answer = intent.getStringExtra("answer");
    }

    private void initViews() {
        questionTxt = findViewById(R.id.question_cb_txt);
        optionOneCb = findViewById(R.id.option_one_cb);
        optionTwoCb = findViewById(R.id.option_two_cb);
        optionThreeCb = findViewById(R.id.option_three_cb);
        optionFourCb = findViewById(R.id.option_four_cb);
        verifyBtn = findViewById(R.id.verify_cb_btn);
    }
}