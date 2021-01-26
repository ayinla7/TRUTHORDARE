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

public class family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        Button btn;
        ActionBar a = getSupportActionBar();
        a.setDisplayHomeAsUpEnabled(true);
        a.setTitle("Family");
        final ImageView coin;
        Random r;
        int side;
        Button darebtn,truthbtn;;
        final TextView display;
        //darebtn=(Button)findViewById(R.id.darebtn);
        //truthbtn=(Button)findViewById(R.id.truthbtn);
        display=(TextView) findViewById(R.id.display);
        coin=(ImageView) findViewById(R.id.coin);


        coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int side = r.nextInt(6);
                if (side == 1) {
                    coin.setImageResource(R.drawable.dice1);
                    Toast.makeText(family.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 2) {
                    coin.setImageResource(R.drawable.dice2);
                    Toast.makeText(family.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
                if (side == 3) {
                    coin.setImageResource(R.drawable.dice3);
                    Toast.makeText(family.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 4) {
                    coin.setImageResource(R.drawable.dice4);
                    Toast.makeText(family.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
                if (side == 5) {
                    coin.setImageResource(R.drawable.dice5);
                    Toast.makeText(family.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 6) {
                    coin.setImageResource(R.drawable.dice6);
                    Toast.makeText(family.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
////////////////////TO ROTATE THE COIN
                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                coin.startAnimation(rotate);


                if ((side==2)||(side==4)||(side==6)){
                    String truth[]= {
                            "What is the most annoying thing that your mom does?"
                            ,"What is the most annoying thing that your dad does?"
                            ,"Have you ever snuck anyone into to the house?"
                            ,"How many times have you snuck out of the house?"
                            ,"What is the best dish that you mom makes for dinner?"
                            ,"If you could change any of the house rules, what would it be?"
                            ,"Would you rather be a horse or a cow?"
                            ,"What is the funniest thing your grandparents have ever said?"
                            ,"If you could get rid of one household chore, what would it be?"
                            ,"What is your favourite cartoon from your generation?"
                            ,"What is your favourite childhood song?"
                            ,"What is your favourite board game to play with your family?"
                            ,"If you could put one person in your family on mute for a day, who would it be?"
                            ,"At what age did you learn to ride a bike?"
                            ,"Do you know how to swim?"
                            ,"Describe your dream home"
                            ,"What is the funniest dream that you have ever had?"
                            ,"Have you ever had a dream about one of your relatives?"
                            ,"Who is your celebrity husband or wife?"
                            ,"Who taught you how to tie your shoes?"
                            ,"What is the longest that you have ever been without taking a shower?"
                            ,"Have you ever worn the same clothes for more than three days?"
                            ,"What is your favourite holiday and why?"
                            ,"If you could be any dinosaur, which would it be?"
                            ,"How long could you without eating your favourite food?"
                            ,"Who in your family tells the corniest jokes?"
                            ,"Would you rather be a bumblebee or a slug?"
                            ,"Have you ever eaten a worm?"
                            ,"Have you ever picked your nose when you thought no one was looking?"
                            ,"If you could be any super villain, who would you be?"



                    };
                    Random rand = new Random();
                    int random = rand.nextInt((truth).length);
                    String guess1 = (truth[random]).toString();
                    display.setText(guess1);


                } else{
                    String dare[] = {
                            "Stand on one leg for the next three rounds"
                            ,"Cross your eyes and walk to front yard and back"
                            ,"Do an impression of your favourite relative, do not stop until everyone can guess who you are"
                            ,"Act like the family pet until it is your turn again"
                            ,"For the next 2 rounds, you must do whatever the person to your right says"
                            ,"Quack and walk like a duck"
                            ,"Do your best impression of Mickey Mouse"
                            ,"Spin around for 10 seconds and run out the mailbox and back"
                            ,"Balance a spoon on your nose until the next round"
                            ,"Do your best evil laugh, as loud as you can"
                            ,"Make a funny face, take a selfie, and post it on Facebook"
                            ,"Call a random person and sing happy birthday to them"
                            ,"Blindfolded, go to the kitchen and make sandwich"
                            ,"Give the person to your left a wet willy"
                            ,"Wiggle your ears without using your hands"
                            ,"Talk like a baby for the next 3 rounds"
                            ,"Record yourself doing the silliest dance you can do, and post it to Facebook"
                            ,"Tell a funny knock knock joke, everyone must laugh"
                            ,"Hold your breath for 15 seconds"
                            ,"Do a headstand while you sing your favourite nursery rhyme"
                            ,"Try to spin on your head like a break dancer"
                            ,"Balance the object to your left on your head for the next three rounds"
                            ,"Do your best hula dance"
                            ,"Tapdance on the couch"
                            ,"Stand up and spin around for the next two rounds"
                            ,"Do 150 jumping jacks"
                            ,"Use the person to your right’s stomach as a drum and make up a tribal dance"
                            ,"Stand like a flamingo for the next four rounds"

                    };
                    Random rand = new Random();
                    int random = rand.nextInt((dare).length);
                    String guess = (dare[random]).toString();
                    display.setText(guess);
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
    }}
