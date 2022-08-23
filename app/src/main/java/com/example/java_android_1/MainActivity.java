package com.example.java_android_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.d("DDD","OnStart");
        super.onStart();
    }

    @Override
    protected void onPostResume() {
        Log.d("DDD","Resume");
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        Log.d("DDD","Pause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("DDD","Stop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("DDD","Destroy");
        super.onDestroy();
    }
}