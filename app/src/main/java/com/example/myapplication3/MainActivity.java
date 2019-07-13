package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("qing==", "onCreate: "+ Build.MODEL);
//        NotificationUtils.openNotificationSettings(getApplicationContext());
        RadioButton radioButton =findViewById(R.id.rb);
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.KITKAT) {
            radioButton.setButtonDrawable(new ColorDrawable(Color.TRANSPARENT));
        }else {
            radioButton.setButtonDrawable(null);
        }
    }
}
