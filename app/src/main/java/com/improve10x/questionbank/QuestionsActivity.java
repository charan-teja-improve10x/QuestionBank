package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {
    TextView questionTxt;
    RadioGroup optionsRg;
    RadioButton optionOneRb;
    RadioButton optionTwoRb;
    RadioButton optionThreeRb;
    RadioButton optionFourRb;
    Button submitBtn;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        initViews();
        getQuestions();
        displayQuestions();
        handleSubmitBtn();
    }

    private void handleSubmitBtn() {
        submitBtn.setOnClickListener(v -> {
        varifyAnswer();
        });
    }

    private void varifyAnswer() {
        String correctAnswer = selectedAnswer();
        if (answer.equals(correctAnswer)) {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Sorry, Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }

    public String selectedAnswer() {
        int selectedOption = optionsRg.getCheckedRadioButtonId();
        String result = "";
        if (selectedOption == R.id.option_one_rb) {
            result = "a";
        } else if (selectedOption == R.id.option_two_rb) {
            result = "b";
        } else if (selectedOption == R.id.option_three_rb) {
            result = "c";
        } else if (selectedOption == R.id.option_four_rb) {
            result = "d";
        }
        return result;
    }


    private void displayQuestions() {
        questionTxt.setText(question);
        optionOneRb.setText(optionA);
        optionTwoRb.setText(optionB);
        optionThreeRb.setText(optionC);
        optionFourRb.setText(optionD);
    }

    private void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        optionA = intent.getStringExtra("optionA");
        optionB = intent.getStringExtra("optionB");
        optionC = intent.getStringExtra("optionC");
        optionD = intent.getStringExtra("optionD");
        answer = intent.getStringExtra("answer");
    }

    private void initViews() {
        questionTxt = findViewById(R.id.question_txt);
        optionsRg = findViewById(R.id.options_rg);
        optionOneRb = findViewById(R.id.option_one_rb);
        optionTwoRb = findViewById(R.id.option_two_rb);
        optionThreeRb = findViewById(R.id.option_three_rb);
        optionFourRb = findViewById(R.id.option_four_rb);
        submitBtn = findViewById(R.id.submit_btn);
    }
}