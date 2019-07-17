package com.example.alc4challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button aboutAlcBtn;
    private Button aboutMeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeView();
    }

    private void initializeView() {
        aboutAlcBtn = findViewById(R.id.btn_alc);
        aboutMeBtn = findViewById(R.id.btn_me);

        aboutAlcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAboutAlcBtnClick();
            }
        });
        aboutMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAboutMeBtnClick();
            }
        });
    }

    private void onAboutAlcBtnClick() {
        Intent intent = new Intent(this, AboutAlcActivity.class);
        startActivity(intent);
    }

    private void onAboutMeBtnClick() {
        Intent intent = new Intent(this, AboutMeActivity.class);
        startActivity(intent);
    }
}
