package com.example.sathiyakugan.htdetect;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

import at.grabner.circleprogress.CircleProgressView;


public class Main2Activity extends AppCompatActivity {
    private TextView loadingTextView;
    CircleProgressView mCircleView;
    Button btnTry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        loadingTextView=(TextView)findViewById(R.id.wait);
        mCircleView = (CircleProgressView) findViewById(R.id.circleView);

        Random rand = new Random();

        int  n = rand.nextInt(10) + 1;

        mCircleView.setValue(n);
        btnTry=(Button)findViewById(R.id.btnTry);
        btnTry.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                finish();  //Kill the activity from which you will go to next activity
                startActivity(i);

            }
        });




//50 is the maximum and the 1 is our minimum
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            public void run() {
//                loadingTextView.setText("Processing...");
//            }
//        }, 10000);   //5 seconds
//
//
//        Handler handler2 = new Handler();
//        handler.postDelayed(new Runnable() {
//            public void run() {
//                loadingTextView.setText("Please Wait...");
//            }
//        }, 2000);   //5 seconds
//
//
//        Handler handler3 = new Handler();
//        handler.postDelayed(new Runnable() {
//            public void run() {
//                loadingTextView.setText("Done...");
//            }
//        }, 1000);   //5 seconds
//
//
//        Handler handler4 = new Handler();
//        handler.postDelayed(new Runnable() {
//            public void run() {
//                Intent i = new Intent(Main2Activity.this, Main3Activity.class);
//                finish();  //Kill the activity from which you will go to next activity
//                startActivity(i);
//            }
//        }, 10000);   //5 seconds


    }
}


