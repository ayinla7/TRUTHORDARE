package com.example.ayinlakwamdeen.truthordare;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {
    RadioGroup answer1;
    int selectedid1;
    RadioButton type2;
    RadioButton type1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        type1 = (RadioButton) findViewById(R.id.type1);
        type2 = (RadioButton) findViewById(R.id.type2);
        Button save = (Button) findViewById(R.id.savebtn);

        answer1 = (RadioGroup) findViewById(R.id.answer1);
        //sharedpreferences = getSharedPreferences("my", Context.MODE_PRIVATE);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedid1 = answer1.getCheckedRadioButtonId();
                RadioButton ansbtn1 = (RadioButton) findViewById(selectedid1);
                if (type1.isChecked()) {

                }else {

                }
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

