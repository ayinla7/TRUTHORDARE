package com.example.ayinlakwamdeen.truthordare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);



        Button teens = (Button) findViewById(R.id.teens);
        Button students = (Button) findViewById(R.id.students);
        Button family = (Button) findViewById(R.id.family);
        Button group = (Button) findViewById(R.id.group);
        Button adult = (Button) findViewById(R.id.adult);
        //Button family = (Button) findViewById(R.id.family);
        //Button family = (Button) findViewById(R.id.family);
        teens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), teens.class);
                startActivity(int1);
            }
        });
        students.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), students.class);
                startActivity(int1);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), family.class);
                startActivity(int1);
            }
        });
        group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), group.class);
                startActivity(int1);
            }
        });
        adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(getApplicationContext(), Adult.class);
                startActivity(int1);
            }
        });
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        if(id==android.R.id.home){
            this.finish();
        }
     return super.onOptionsItemSelected(item);
    }

}
