package com.example.com.chineseproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView TranslatWordRus = findViewById(R.id.TranslaetWordRus);
        String wordForTranslate = getIntent().getStringExtra("word");
        TranslatWordRus.setText(wordForTranslate);
    }
}
