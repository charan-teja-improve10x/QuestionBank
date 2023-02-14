package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
    Button questionOneBtn;
    Button questionTwoBtn;
    Button questionThreeBtn;
    Button questionFourBtn;
    Button questionFiveBtn;
    Button questionsixBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        handleInitViews();
        handleQuestionnOneBtn();
        handleQuestion2Btn();
        handleQuestion3Btn();
        handleQuestion4Btn();
        handleQuestion5Btn();
        handleQuestion6Btn();
    }

    private void handleQuestion6Btn() {
       questionsixBtn.setOnClickListener(v -> {
           String question = "Select activity lifecycle methods in Android";
           String optionA = "onCreate";
           String optionB = "onStop";
           String optionC = "onResume";
           String optionD = "onPause";
           String answer = "abcd";
           navigateToQuestionAndAnswersActivity(question,optionA,optionB, optionC, optionD, answer);
       });
    }

    private void handleQuestion5Btn() {
        questionFiveBtn.setOnClickListener(v -> {
            String question = "Select all the parts of a computer";
            String optionA = "Cat";
            String optionB = "Mouse";
            String optionC = "Monitor";
            String optionD = "Keyboard";
            String answer = "bcd";
            navigateToQuestionAndAnswersActivity(question,optionA,optionB, optionC, optionD, answer);
        });
    }

    private void handleQuestion4Btn() {
        questionFourBtn.setOnClickListener(v -> {
            String question = "Which of the following are planets";
            String optionA = "Mercury";
            String optionB = "Sun";
            String optionC = "Moon";
            String optionD = "Jupiter";
            String answer = "ad";
            navigateToQuestionAndAnswersActivity(question,optionA,optionB, optionC, optionD, answer);
        });
    }

    private void handleQuestion3Btn() {
        questionThreeBtn.setOnClickListener(v -> {
            String question = "Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
            String optionA = "true";
            String optionB = "false";
            String optionC = "Non of above";
            String optionD = "Both a and b";
            String answer = "a";
            navigateToQuestionsActivity(question, optionA, optionB, optionC, optionD,answer);
        });
    }

    private void handleQuestion2Btn() {
        questionTwoBtn.setOnClickListener(v -> {
            String question = " What will be the output when input is 6. It must return Fizz if the number is divisible by 3. \n" +
                    " It must return Buzz if the number is divisible by 5.  It must return FizzBuzz if the number is divisible by  both 3 and 5. It must return a number if none of the above conditions are true. ";
            String optionA = "Fizz";
            String optionB = "Buzz";
            String optionC = "FizzBuzz";
            String optionD = "6";
            String answer = "a";
            navigateToQuestionsActivity(question, optionA, optionB, optionC, optionD,answer);
        });
    }

    private void handleQuestionnOneBtn() {
        questionOneBtn.setOnClickListener(view -> {
            String question1 = "How many planets are there in solar system";
            String optionA = " 10 ";
            String optionB = " 9 ";
            String optionC = " 12 ";
            String optionD = " 8 ";
            String answer = "d";
            navigateToQuestionsActivity(question1, optionA, optionB, optionC, optionD,answer);
        });
    }

    public void navigateToQuestionsActivity(String question, String optionA, String optionB, String optionC, String optionD,String answer) {
        Intent questionsIntent = new Intent(this, RadioButtonActivity.class);
        questionsIntent.putExtra("question", question);
        questionsIntent.putExtra("optionA", optionA);
        questionsIntent.putExtra("optionB", optionB);
        questionsIntent.putExtra("optionC", optionC);
        questionsIntent.putExtra("optionD", optionD);
        questionsIntent.putExtra("answer",answer);
        startActivity(questionsIntent);
    }

    private void handleInitViews() {
        questionOneBtn = findViewById(R.id.question_one_btn);
        questionTwoBtn = findViewById(R.id.question_two_btn);
        questionThreeBtn = findViewById(R.id.question_three_btn);
        questionFourBtn = findViewById(R.id.question_four_btn);
        questionFiveBtn = findViewById(R.id.question_five_btn);
        questionsixBtn= findViewById(R.id.question_six_btn);
    }
    public void navigateToQuestionAndAnswersActivity(String question, String optionA, String optionB,String optionC, String optionD, String answer){
        Intent questionAndAnswerActivityIntent = new Intent(this, CheckBoxActivity.class);
        questionAndAnswerActivityIntent.putExtra("question",question);
        questionAndAnswerActivityIntent.putExtra("optionA", optionA);
        questionAndAnswerActivityIntent.putExtra("optionB", optionB);
        questionAndAnswerActivityIntent.putExtra("optionC",optionC);
        questionAndAnswerActivityIntent.putExtra("optionD", optionD);
        questionAndAnswerActivityIntent.putExtra("answer",answer);
        startActivity(questionAndAnswerActivityIntent);
    }
}