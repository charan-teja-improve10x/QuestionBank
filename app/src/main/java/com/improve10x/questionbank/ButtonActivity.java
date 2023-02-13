package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
    Button questionOneBtn;
    Button questionTwoBtn;
    Button questionThreeBtn;
    Button questionCbOneBtn;
    Button questionCbTwoBtn;
    Button questionCbThreeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        handleInitViews();
        handleQuestionnOneBtn();
        handleQuestion2Btn();
        handleQuestion3Btn();
        handleQuestion1CbBtn();
    }

    private void handleQuestion1CbBtn() {
        questionCbOneBtn.setOnClickListener(v -> {
            navigateToQuestionAndAnswersActivity();
        });
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
        questionThreeBtn.setOnClickListener(v -> {
            String question = " What will be the output when input is 6. It must return Fizz if the number is divisible by 3. \n" +
                    " It must return Buzz if the number is divisible by 5.  It must return FizzBuzz if the number is divisible by  both 3 and 5. It must return a number if none of the above conditions are true. ";
            String optionA = "Fizz";
            String optionB = "Buzz";
            String optionC = "FizzBuzz";
            String optionD = "6";
            navigateToQuestionsActivity(question, optionA, optionB, optionC, optionD);
        });
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

    public void navigateToQuestionsActivity(String question, String optionA, String optionB, String optionC, String optionD) {
        Intent questionsIntent = new Intent(this, QuestionsActivity.class);
        questionsIntent.putExtra("question", question);
        questionsIntent.putExtra("optionA", optionA);
        questionsIntent.putExtra("optionB", optionB);
        questionsIntent.putExtra("optionC", optionC);
        questionsIntent.putExtra("optionD", optionD);
        startActivity(questionsIntent);
    }

    private void handleInitViews() {
        questionOneBtn = findViewById(R.id.question_one_btn);
        questionTwoBtn = findViewById(R.id.question_two_btn);
        questionThreeBtn = findViewById(R.id.question_three_btn);
        questionCbOneBtn = findViewById(R.id.check_box_one_btn);
        questionCbTwoBtn = findViewById(R.id.check_box_two_btn);
        questionCbThreeBtn = findViewById(R.id.check_box_three_btn);
    }
    public void navigateToQuestionAndAnswersActivity(){
        Intent questionAndAnswerActivityInten = new Intent(this,QuestionAndAnswerActivity.class);
        startActivity(questionAndAnswerActivityInten);
    }
}