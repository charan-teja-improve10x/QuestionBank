package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
    Button questionOneBtn;
    Button questionTwoBtn;
    Button questionThreeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        handleInitViews();
        handleQuestionnOneBtn();
        handleQuestion2Btn();
        handleQuestion3Btn();
    }

    private void handleQuestion3Btn() {
      questionTwoBtn.setOnClickListener(v -> {
          String question = "Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
          String optionA = "true";
          String optionB = "false";
          String optionC = "Non of above";
          String optionD = "Both a and b";
          navigateToQuestionsActivity(question, optionA, optionB, optionC, optionD);
      });
    }

    private void handleQuestion2Btn() {

    }

    private void handleQuestionnOneBtn() {
        questionOneBtn.setOnClickListener(view -> {
            String question1 = "How many palnets are there in solar syatem";
            String optionA = " 10 ";
            String optionB = " 9 ";
            String optionC = " 12 ";
            String optionD = " 8 ";
            navigateToQuestionsActivity(question1, optionA, optionB, optionC, optionD);
        });
    }

    public void navigateToQuestionsActivity(String question1, String optionA, String optionB, String optionC, String optiond) {
        Intent questionsIntent = new Intent(this, QuestionsActivity.class);
        questionsIntent.putExtra("question", question1);
        questionsIntent.putExtra("optioon1", optionA);
        questionsIntent.putExtra("optioon2", optionB);
        questionsIntent.putExtra("optioon3", optionC);
        questionsIntent.putExtra("optioon4", optiond);
        startActivity(questionsIntent);
    }

    private void handleInitViews() {
        questionOneBtn = findViewById(R.id.question_one_btn);
        questionTwoBtn = findViewById(R.id.question_two_btn);
        questionThreeBtn = findViewById(R.id.question_three_btn);
    }
}