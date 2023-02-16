package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TeacherStudentActivity extends AppCompatActivity {
    Button teacherBtn;
    Button studentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_student);
        handleInitViews();
        handleStudentBtn();
    }

    public void handleInitViews() {
        teacherBtn = findViewById(R.id.teacher_btn);
        studentBtn = findViewById(R.id.student_btn);
    }

    public void handleStudentBtn() {
        studentBtn.setOnClickListener(v -> {
            Intent buttonActivityIntent = new Intent(this, ButtonActivity.class);
            startActivity(buttonActivityIntent);
        });
    }
}