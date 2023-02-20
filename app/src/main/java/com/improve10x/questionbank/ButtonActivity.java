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
    Button questionSixBtn;
    Button trueOrFalse1Btn;
    Button trueOrFalse2Btn;
    Button trueOrFalse3Btn;
    Button numberQuestion1Btn;
    Button numberQuestion2Btn;
    Button numberQuestion3Btn;
    Button fillInBlank1Btn;
    Button fillInBlank2Btn;
    Button fillInBlank3Btn;
    Button spinner1Btn;
    Button spinner2Btn;
    Button spinner3Btn;

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
        handleQuestion7Btn();
        handleQuestion8Btn();
        handleQuestion9Btn();
        handleNumberQuestion1Btn();
        handleNumberQuestion2Btn();
        handleNumberQuestion3Btn();
        handleTextQuestion1Btn();
        handleTextQuestion2Btn();
        handleTextQuestion3Btn();
        handleSpinner1Btn();
        handleSpinner2Btn();
        handleSpinner3Btn();
    }

    private void handleSpinner1Btn() {
        spinner1Btn.setOnClickListener(v -> {
            String question = "Number of primitive data types in java are ?";
            String[] options = {"6", "7", "8", "9"};
            String answer = "8";
            navigateToSpinnerActivity(question, options, answer);
        });
    }

    private void handleSpinner2Btn() {
        spinner2Btn.setOnClickListener(v -> {
            String question = "public class Solution{\n" +
                    "       public static void main(String[] args){\n" +
                    "                     byte x = 127;\n" +
                    "                     x++;\n" +
                    "                     x++;\n" +
                    "                     System.out.print(x);\n" +
                    "       }\n" +
                    "}";
            String[] options = {"-127", "127", "129", "2"};
            String answer = "-127";
            navigateToSpinnerActivity(question, options, answer);
        });
    }

    private void handleSpinner3Btn() {
        spinner3Btn.setOnClickListener(v -> {
            String question = "Find the value of A[1] after execution of the following program.\n" +
                    "\n" +
                    "int[] A = {0,2,4,1,3};\n" +
                    "for(int i = 0; i < a.length; i++){\n" +
                    "    a[i] = a[(a[i] + 3) % a.length];\n" +
                    "}";
            String[] options = {"0", "1", "2", "3"};
            String answer = "1";
            navigateToSpinnerActivity(question, options, answer);
        });
    }

    public void handleTextQuestion1Btn() {
        fillInBlank1Btn.setOnClickListener(v -> {
            String question = "Java _______ can contain variables and methods";
            String answer = "Class";
            navigateToTextQuestionActivity(question, answer);
        });
    }

    public void handleTextQuestion2Btn() {
        fillInBlank2Btn.setOnClickListener(v -> {
            String question = "Android is an _________________";
            String answer = "Operating System";
            String trimmedTxt = answer.trim();
            navigateToTextQuestionActivity(question, trimmedTxt);
        });
    }

    public void handleTextQuestion3Btn() {
        fillInBlank3Btn.setOnClickListener(v -> {
            String question = "____________ component is used to supper vertical Scrolling";
            String answer = "Scrollview";
            String trimmedTxt = answer.trim();
            navigateToTextQuestionActivity(question, trimmedTxt);
        });
    }

    public void handleNumberQuestion1Btn() {
        numberQuestion1Btn.setOnClickListener(v -> {
            String question = "What is the size of int data type in bytes";
            String answer = "4";
            String trimmedTxt = answer.trim();
            navigateToNumberSelectActivity(question, trimmedTxt);
        });
    }

    public void handleNumberQuestion2Btn() {
        numberQuestion2Btn.setOnClickListener(v -> {
            String question = "What is the size of long data type in bytes";
            String answer = "8";
            navigateToNumberSelectActivity(question, answer);
        });
    }

    public void handleNumberQuestion3Btn() {
        numberQuestion3Btn.setOnClickListener(v -> {
            String question = "What is the size of int data type in bytes";
            String answer = "4";
            navigateToNumberSelectActivity(question, answer);
        });
    }

    private void handleQuestion9Btn() {
        trueOrFalse3Btn.setOnClickListener(v -> {
            String question = "Android emulator takes very less space ";
            String answer = "False";
            navigateToTrueOrFalseActivity(question, answer);
        });
    }

    private void handleQuestion8Btn() {
        trueOrFalse2Btn.setOnClickListener(v -> {
            String question = "Android  studio supports hava programing language";
            String answer = "True";
            navigateToTrueOrFalseActivity(question, answer);
        });
    }

    private void handleQuestion7Btn() {
        trueOrFalse1Btn.setOnClickListener(v -> {
            String question = "Java is a programing language ?";
            String answer = "True";
            navigateToTrueOrFalseActivity(question, answer);
        });
    }

    private void handleQuestion6Btn() {
        questionSixBtn.setOnClickListener(v -> {
            String question = "Select activity lifecycle methods in Android";
            String optionA = "onCreate";
            String optionB = "onStop";
            String optionC = "onResume";
            String optionD = "onPause";
            String answer = "abcd";
            navigateToQuestionAndAnswersActivity(question, optionA, optionB, optionC, optionD, answer);
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
            navigateToQuestionAndAnswersActivity(question, optionA, optionB, optionC, optionD, answer);
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
            navigateToQuestionAndAnswersActivity(question, optionA, optionB, optionC, optionD, answer);
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
            navigateToQuestionsActivity(question, optionA, optionB, optionC, optionD, answer);
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
            navigateToQuestionsActivity(question, optionA, optionB, optionC, optionD, answer);
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
            navigateToQuestionsActivity(question1, optionA, optionB, optionC, optionD, answer);
        });
    }

    public void navigateToQuestionsActivity(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        Intent questionsIntent = new Intent(this, SingleSelectActivity.class);
        questionsIntent.putExtra("question", question);
        questionsIntent.putExtra("optionA", optionA);
        questionsIntent.putExtra("optionB", optionB);
        questionsIntent.putExtra("optionC", optionC);
        questionsIntent.putExtra("optionD", optionD);
        questionsIntent.putExtra("answer", answer);
        startActivity(questionsIntent);
    }

    private void handleInitViews() {
        questionOneBtn = findViewById(R.id.question_one_btn);
        questionTwoBtn = findViewById(R.id.question_two_btn);
        questionThreeBtn = findViewById(R.id.question_three_btn);
        questionFourBtn = findViewById(R.id.question_four_btn);
        questionFiveBtn = findViewById(R.id.question_five_btn);
        questionSixBtn = findViewById(R.id.question_six_btn);
        trueOrFalse1Btn = findViewById(R.id.true_false_1_btn);
        trueOrFalse2Btn = findViewById(R.id.true_false_2_btn);
        trueOrFalse3Btn = findViewById(R.id.true_false_3_btn);
        numberQuestion1Btn = findViewById(R.id.number_question_1_btn);
        numberQuestion2Btn = findViewById(R.id.number_question_2_btn);
        numberQuestion3Btn = findViewById(R.id.number_question_3_btn);
        fillInBlank1Btn = findViewById(R.id.fill_blank_1_btn);
        fillInBlank2Btn = findViewById(R.id.fill_blank_2_btn);
        fillInBlank3Btn = findViewById(R.id.fill_blank_3_btn);
        spinner1Btn = findViewById(R.id.spinner_one_btn);
        spinner2Btn = findViewById(R.id.spinner_two_btn);
        spinner3Btn = findViewById(R.id.spinner_thrre_btn);
    }

    public void navigateToQuestionAndAnswersActivity(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        Intent questionAndAnswerActivityIntent = new Intent(this, MultiSelectActivity.class);
        questionAndAnswerActivityIntent.putExtra("question", question);
        questionAndAnswerActivityIntent.putExtra("optionA", optionA);
        questionAndAnswerActivityIntent.putExtra("optionB", optionB);
        questionAndAnswerActivityIntent.putExtra("optionC", optionC);
        questionAndAnswerActivityIntent.putExtra("optionD", optionD);
        questionAndAnswerActivityIntent.putExtra("answer", answer);
        startActivity(questionAndAnswerActivityIntent);
    }

    public void navigateToTrueOrFalseActivity(String question, String answer) {
        Intent trueOrFalseIntent = new Intent(this, TrueOrFalseQuestionActivity.class);
        trueOrFalseIntent.putExtra("question", question);
        trueOrFalseIntent.putExtra("answer", answer);
        startActivity(trueOrFalseIntent);
    }

    public void navigateToNumberSelectActivity(String question, String answer) {
        Intent numberSelectIntent = new Intent(this, NumberSelectQuestionActivity.class);
        numberSelectIntent.putExtra("question", question);
        numberSelectIntent.putExtra("answer", answer);
        startActivity(numberSelectIntent);
    }

    public void navigateToTextQuestionActivity(String question, String answer) {
        Intent textQuestionActivityIntent = new Intent(this, TextQuestionActivity.class);
        textQuestionActivityIntent.putExtra("question", question);
        textQuestionActivityIntent.putExtra("answer", answer);
        startActivity(textQuestionActivityIntent);
    }

    public void navigateToSpinnerActivity(String question, String[] options, String answer) {
        Intent spinnerActivityIntent = new Intent(this, SpinnerActivity.class);
        spinnerActivityIntent.putExtra("question", question);
        spinnerActivityIntent.putExtra("options", options);
        spinnerActivityIntent.putExtra("answer", answer);
        startActivity(spinnerActivityIntent);
    }
}