package com.example.com.chineseproject2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String wordForTranslate;
    EditText WordRus;
    EditText DefenitionRus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WordRus = findViewById(R.id.WordRus);
        wordForTranslate = getIntent().getStringExtra("word");
        WordRus.setText(wordForTranslate);
        DefenitionRus = findViewById(R.id.DefenitionRus);
    }

    public void Save(View view) {
        WordRus.setEnabled(false);
        DefenitionRus.setEnabled(false);
        WordRus.setTextColor(Color.parseColor("#000000"));
        DefenitionRus.setTextColor(Color.parseColor("#000000"));

    }

    public void Change(View view) {
        WordRus.setEnabled(true);
        DefenitionRus.setEnabled(true);
        WordRus.setTextColor(Color.parseColor("#000000"));
        DefenitionRus.setTextColor(Color.parseColor("#000000"));

    }
}
