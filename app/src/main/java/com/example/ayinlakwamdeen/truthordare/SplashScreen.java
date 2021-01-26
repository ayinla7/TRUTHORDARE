package com.example.ayinlakwamdeen.truthordare;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
public class SplashScreen extends Activity {
private  static  int SPLASH_TIME= 6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
         getActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(SplashScreen.this,HOME1.class);
                      startActivity(i);
                finish();
            }
        },SPLASH_TIME);
    }


}
