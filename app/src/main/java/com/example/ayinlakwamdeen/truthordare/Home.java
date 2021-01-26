package com.example.ayinlakwamdeen.truthordare;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btn;
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
                Random r= new Random();
                int   side=r.nextInt(2);
                if (side==0){
                    coin.setImageResource(R.drawable.coin1);
                    Toast.makeText(Home.this, "DARE", Toast.LENGTH_SHORT).show();
                }else if (side==1){
                    coin.setImageResource(R.drawable.coin2);
                    Toast.makeText(Home.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
////////////////////TO ROTATE THE COIN
                RotateAnimation rotate = new RotateAnimation(0,360,
                        RotateAnimation.RELATIVE_TO_SELF,0.5f, RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setDuration(1000);
                coin.startAnimation(rotate);

                String bg=String.valueOf(coin.getTag());
                if (coin.equals(R.drawable.coin2)) {
            String truth[]= {"What was your best sexual experience?"
                    , "What is the longest you’ve ever given head?"
                    , "Would you ever do a 3-some?"
                    , "How do you feel about sex in groups?"
                    , "Would you ever watch your partner have sex with someone else?"
                    , "How many partners have you had at one time?"
                    , "Describe how you orgasim feels?"
                    , "Where is your favourite place to be kissed?"
                    , "Have you ever taken it in the butt or would you?"
                    , "What is the longest time you’ve gone without sex?"};
                    Random rand = new Random();
                    int random = rand.nextInt((truth).length+1);
                    String guess1 = (truth[random]).toString();
                    display.setText(guess1);


        } else{
                        String dare[] = {" Kiss your partner all around their “down-low” area (not the actual part tough)"
                                , "Put your hand down your partner’s pants until the next round"
                                , "Make out with the person to the right of you (if okay with your partner :])"
                                , "With no bottoms, sit on your partner’s man piece until the next round (women)"
                                , "With no bottoms, spoon your partner until the next round"
                                , "Give your partner head for 3 minutes"
                                , "Take and ice cube and run it up and down your partner’s body until it is melted"
                                , "Spray whipped cream (or any other food) all over someone in the group and eat it off of them"
                                , "Bite/kiss your partner’s booty"
                                , "Masturbate in front of the group (or just your partner)"
                                , "Blindfold yourself, Spin around for ten seconds, who ever you are pointing to at the end, go in the next room and enjoy 7 minutes of heaven"
                                , "Sit naked for the rest of the game"
                                , "Take a naked selfie and send it to your partner"
                                , "Go in the next room and make a sex video with your partner for 5 minutes"
                                , "Give your partner’s private a peck"
                                , "Stand outside naked for 3 minutes"
                                , "Give a hand job for 3 minutes"
                                , "Make love with your partner for 3 minutes only (must stop after 3 minutes)"
                                , "Take off your partner’s bra (or nearest woman’s) using only your teeth"
                                , "Give a back rub the person to your right"
                                , "Pull up your favourite porn site your phone right now"
                                , "Send a nude to your ex"
                                , "Wear a pair of your partner’s underwear"
                                , "Put a hickey on the inner thigh of the person to your left"
                                , "Give head to the person next to you for 2 full songs"
                                , "Make your partner cum using only your hands"
                                , "Let your partner rub your inner thighs, but don’t let yourself get hard"
                                , "Make a porno in front of the group. You must do everything the group says to do for 10 minutes"
                                , "You must act like the sex slave to the person to your right. Doing whatever they say to do for the next 15 minutes."
                                , "Go blindfolded into the closet, undress, and redress with items only available in that same closet."
                        };
                        Random rand = new Random();
                        int random = rand.nextInt((dare).length + 1);
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
    }
}
