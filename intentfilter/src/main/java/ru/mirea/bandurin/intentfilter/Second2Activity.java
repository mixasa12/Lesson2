package ru.mirea.bandurin.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        Intent intent = getIntent();
        handleSendText(intent);
    }
    void handleSendText(Intent intent) {
        String sharedText = intent.getStringExtra(Intent.EXTRA_TEXT);
        String headtext = intent.getStringExtra(Intent.EXTRA_SUBJECT);
        if (sharedText != null) {
            TextView textview = (TextView) findViewById(R.id.textView2);
            textview.setText(sharedText);
        }
        if (headtext != null) {
            TextView textview2 = (TextView) findViewById(R.id.textView3);
            textview2.setText(headtext);
        }
    }
}