package ru.mirea.bandurin.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CountSimbols(View view){
        EditText edit = findViewById(R.id.editTextTextPersonName);
        String val = edit.getText().toString();
        int count = val.length();
        String countS=Integer.toString(count);
        String result= "СТУДЕНТ No 4 ГРУППА БСБО-01-20 Количество символов - "+countS;
        Toast toast = Toast.makeText(getApplicationContext(),
                result,
                Toast.LENGTH_LONG);
        toast.show();
    }
}