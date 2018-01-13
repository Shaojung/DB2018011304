package com.example.student.db2018011304;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MYLOG", "這是 onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MYLOG", "這是 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MYLOG", "這是 onResume");
    }
}
