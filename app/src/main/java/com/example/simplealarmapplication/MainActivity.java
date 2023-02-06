package com.example.simplealarmapplication;

import static android.os.VibrationAttributes.USAGE_ALARM;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
    }

    public void OnToggleClicked(View view) {
        Vibrator vibrator = (Vibrator) MainActivity.this.getSystemService(MainActivity.this.VIBRATOR_SERVICE);
        if (toggleButton.isChecked()){
            vibrator.vibrate(VibrationEffect.createOneShot(5000,VibrationEffect.DEFAULT_AMPLITUDE));
        }else{
            vibrator.cancel();
        }
    }
}