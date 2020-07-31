package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="Lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtmsg2=findViewById(R.id.txtmsg2);//create textview type object and give id
        txtmsg2.setText(R.string.msg2);//call string resource file
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onstart() invoked");
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG,"onPostResume() invoked");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.i(TAG,"onPause() invoked");
    }

    @Override
    protected void onStop() {
        Log.i(TAG,"onStop() invoked");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"onDestroy() invoked");
        super.onDestroy();
    }
}