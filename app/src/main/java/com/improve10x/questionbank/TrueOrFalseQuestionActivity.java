package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TrueOrFalseQuestionActivity extends AppCompatActivity implements IQuestionsActivity {
    TextView trueOrFalseTxt;
    Button verifyTrueBtn;
    RadioGroup trueFalseRg;
    RadioButton trueRb;
    RadioButton falseRb;
    String question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_or_false_question);
        initViews();
        getQuestions();
        displayQuestions();
        handleVerifyBtn();
    }

    public void initViews() {
        trueOrFalseTxt = findViewById(R.id.true_or_false_txt);
        trueFalseRg = findViewById(R.id.true_false_rg);
        trueRb = findViewById(R.id.true_rb);
        falseRb = findViewById(R.id.false_rb);
        verifyTrueBtn = findViewById(R.id.verify_true_btn);
    }

    @Override
    public void handleVerifyBtn() {
        verifyTrueBtn.setOnClickListener(v -> {
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
        int selectedId = trueFalseRg.getCheckedRadioButtonId();
        RadioButton selectedRb = findViewById(selectedId);
        String result = selectedRb.getText().toString();
        return result;
    }

    @Override
    public void displayQuestions() {
        trueOrFalseTxt.setText(question);
    }

    @Override
    public void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        answer = intent.getStringExtra("answer");
    }
}