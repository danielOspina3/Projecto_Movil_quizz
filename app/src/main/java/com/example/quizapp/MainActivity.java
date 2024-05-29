package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  main_btn(View view) {
        switch (view.getId()){

            case R.id.btn_setting2:
                startActivity(new Intent(MainActivity.this , settingActivity2.class));

                break;
            case R.id.btn_settings3:
                startActivity(new Intent(MainActivity.this , settingActivity3.class));

                break;
            case R.id.btn_play:
                startActivity(new Intent(MainActivity.this , playActivity.class));
                break;

            case R.id.btn_exit:
                this.finishAffinity();
                break;
        }
    }
}