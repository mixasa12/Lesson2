package ru.mirea.bandurin.mytimedialogfragment;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private int  mHour, mMinute;
    private TextView TextTime;
    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);
        TextTime = findViewById(R.id.currentTime);

    }
    public void set_time(View v) {
        // получаем текущее время
        final Calendar cal = Calendar.getInstance();
        mHour = cal.get(Calendar.HOUR_OF_DAY);
        mMinute = cal.get(Calendar.MINUTE);

        // инициализируем диалог выбора времени текущими значениями
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        String editTextTimeParam = hourOfDay + " : " + minute;
                        if(minute<10){
                           editTextTimeParam = hourOfDay + " : 0" + minute;
                        }
                        TextTime.setText(editTextTimeParam);
                        Snackbar.make(v, "Время изменено", Snackbar.LENGTH_LONG)
                                .show();
                    }
                }, mHour, mMinute, false);
        timePickerDialog.show();
    }
}
