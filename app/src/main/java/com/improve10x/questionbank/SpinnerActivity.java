package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity implements IQuestionsActivity{
    ArrayAdapter arrayAdapter;
    String[] options ;
    Spinner selectSp;
    Button verifySpinnerBtn;
    String question;
    String answer;
    TextView spinnerQuestionTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initViews();
        getQuestions();
        displayQuestions();
        setAdapter();
        connectAdapter();
        handleVerifyBtn();
    }

    @Override
    public void handleVerifyBtn() {
    verifySpinnerBtn.setOnClickListener(v -> {
        verifyAnswer();
    });

    }

    @Override
    public void verifyAnswer() {
        String correctAnswer = getSelectedOptions();
        if (answer.equalsIgnoreCase(correctAnswer)){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Sorry, Wrong Answer", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public String getSelectedOptions() {
        String selectedItem = (String) selectSp.getSelectedItem();
        return selectedItem;
    }

    @Override
    public void displayQuestions() {
      spinnerQuestionTxt.setText(question);

    }

    @Override
    public void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        options = intent.getStringArrayExtra("options");
        answer = intent.getStringExtra("answer");

    }

    public void initViews(){
      selectSp = findViewById(R.id.select_sp);
      verifySpinnerBtn = findViewById(R.id.verify_spinner_btn);
      spinnerQuestionTxt = findViewById(R.id.spinner_question_txt);
    }

    public void setAdapter(){
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,options);
    }

    public void connectAdapter(){
        selectSp.setAdapter(arrayAdapter);
    }
}