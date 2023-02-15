package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TrueOrFalseQuestionActivity extends AppCompatActivity implements IQuestionsActivity{
          TextView trueOrFalseTxt;
          Button verifyTrueBtn;
          RadioGroup trueFalseRg;
          RadioButton optionARb;
          RadioButton optionBRb;
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
        optionARb = findViewById(R.id.option_a_rb);
        optionBRb = findViewById(R.id.option_b_rb);
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
if (answer.equals(correctAnswer)){
    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
}else {
    Toast.makeText(this, "Sorry, Wrong Answer", Toast.LENGTH_SHORT).show();
}
    }

    @Override
    public String getSelectedOptions() {
        int selectedOption = trueFalseRg.getCheckedRadioButtonId();
        String result = " ";
        if (selectedOption == R.id.option_a_rb){
            result = "True";
        }else if (selectedOption == R.id.option_b_rb){
            result = "False";
        }
        return  result;
    }

    @Override
    public void displayQuestions() {
       trueOrFalseTxt.setText(question);
    }

    @Override
    public void getQuestions() {
        Intent  intent = getIntent();
        question = intent.getStringExtra("question");
        answer = intent.getStringExtra("answer");
    }

}