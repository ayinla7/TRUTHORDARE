package com.example.ayinlakwamdeen.truthordare;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static com.example.ayinlakwamdeen.truthordare.R.id.answer1;
import static com.example.ayinlakwamdeen.truthordare.R.id.type1;

public class Adult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult);

        ActionBar a = getSupportActionBar();
        a.setDisplayHomeAsUpEnabled(true);
        a.setTitle("Adult");
        Button btn;
        final ImageView coin;
        Random r;
        int side;
        Button darebtn,truthbtn;;
        final TextView display,tord;
        //darebtn=(Button)findViewById(R.id.darebtn);
        //truthbtn=(Button)findViewById(R.id.truthbtn);
        display=(TextView) findViewById(R.id.display);
        tord=(TextView) findViewById(R.id.tord);
        coin=(ImageView) findViewById(R.id.coin);


        coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int side = r.nextInt(6);
                if (side == 1) {
                    coin.setImageResource(R.drawable.dice1);
                    Toast.makeText(Adult.this, "DARE", Toast.LENGTH_SHORT).show();

                } else if (side == 2) {
                    coin.setImageResource(R.drawable.dice2);
                    Toast.makeText(Adult.this, "TRUTH", Toast.LENGTH_SHORT).show();

                }
                if (side == 3) {
                    coin.setImageResource(R.drawable.dice3);
                    Toast.makeText(Adult.this, "DARE", Toast.LENGTH_SHORT).show();

                } else if (side == 4) {
                    coin.setImageResource(R.drawable.dice4);
                    Toast.makeText(Adult.this, "TRUTH", Toast.LENGTH_SHORT).show();

                }
                if (side == 5) {
                    coin.setImageResource(R.drawable.dice5);
                    Toast.makeText(Adult.this, "DARE", Toast.LENGTH_SHORT).show();

                } else if (side == 6) {
                    coin.setImageResource(R.drawable.dice6);
                    Toast.makeText(Adult.this, "TRUTH", Toast.LENGTH_SHORT).show();

                }
////////////////////TO ROTATE THE COIN
                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                coin.startAnimation(rotate);


                if ((side==2)||(side==4)||(side==6)){
                    String truth[]={


                            };
                    Random rand = new Random();
                    int random = rand.nextInt((truth).length);
                    String guess1 = (truth[random]).toString();
                    display.setText(guess1);
                    tord.setText("TRUTH");

                } else{
                    String dare[] = {
                    };
                    Random rand = new Random();
                    int random = rand.nextInt((dare).length);
                    String guess = (dare[random]).toString();
                    display.setText(guess);
                    tord.setText("DARE");
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
