package com.example.biro.udacitygdcsabnd_activitylifecycle;

import android.support.v7.app.AppCompatActivity;
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
        super.onStart();
        setLogMessage("onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        setLogMessage("onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        setLogMessage("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        setLogMessage("onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        setLogMessage("onRestart");
    }

    private void setLogMessage(String str)
    {
        Log.v(this.toString(), str);
    }
}
