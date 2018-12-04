package com.example.com.chineseproject2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstScreen extends AppCompatActivity {
    String Word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        EditText WordForTranslate = findViewById(R.id.WordForTranslate);
        Word = WordForTranslate.getText().toString();
    }

    public void Search(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("WordForTranslate",Word);
        startActivity(intent);
    }
}
