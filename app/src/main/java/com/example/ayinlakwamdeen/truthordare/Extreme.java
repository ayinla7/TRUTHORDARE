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

public class Extreme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extreme);
        Button btn;
        ActionBar a = getSupportActionBar();
        a.setDisplayHomeAsUpEnabled(true);
        a.setTitle("Extreme");
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
                    Toast.makeText(Extreme.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 2) {
                    coin.setImageResource(R.drawable.dice2);
                    Toast.makeText(Extreme.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
                if (side == 3) {
                    coin.setImageResource(R.drawable.dice3);
                    Toast.makeText(Extreme.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 4) {
                    coin.setImageResource(R.drawable.dice4);
                    Toast.makeText(Extreme.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
                if (side == 5) {
                    coin.setImageResource(R.drawable.dice5);
                    Toast.makeText(Extreme.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 6) {
                    coin.setImageResource(R.drawable.dice6);
                    Toast.makeText(Extreme.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
////////////////////TO ROTATE THE COIN
                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                coin.startAnimation(rotate);


                if ((side==2)||(side==4)||(side==6)){
                    String truth[]= {"What is your favourite part of my body?"
                            ,"If you could do whatever you wanted to me what would it be?"
                            ,"Describe what you would like me to do to you."
                            ,"On a scale from 1 to 10 how good can you give a head to me?"
                            ,"would you like giving me head?"
                            ,"What is our best sexual experience that you remember?"
                            ,"Could we ever have sex?"
                            ,"Where do you like my tongue the most?"
                            ,"Would you ever eat my booty?"
                            ,"Do you like it rough or soft?"
                            ,"If you could invite any of our friends into the bedroom with us, who would it be?"
                            ,"Would you ever want to go to a swingers party?"
                            ,"What is your favourite pair of  underwear?"
                            ,"Do you ever dream about the sex,seeing us together?"
                            ,"Would you ever want to have sex with one of my friends? If so, who?"
                            ,"Have I ever done something that you didn’t enjoy during sex?"
                            ,"What part of your body would you love for me to massage?"
                            ,"Do you like drunk sex?"
                            ,"Would you ever cook naked for me?"
                            ,"Do you like “doggy-style” or “missionary” better?"
                            ,"What sexual position have you always wanted to try?"
                            };
                    Random rand = new Random();
                    int random = rand.nextInt((truth).length);
                    String guess1 = (truth[random]).toString();
                    display.setText(guess1);


                } else{
                    String dare[] = {
                            "Give me head for three full songs, or until I cum, whichever comes first"
                            ,"Put on the sexiest song you know, and give me a naked lap dance"
                            ,"Give me a hickey on my chest"
                            ,"(For women) Finger yourself until you cum while I record you/(For men) Jack off until you cum while I record you"
                            ,"Eat my booty out"
                            ,"(For women) Ride my penis for 3 minutes only (if you go longer it’s a penalty)/(For men) Do me in doggy-style for 3 minutes only (if you go longer it’s a penalty)"
                            ,"Make me cum without touching my privates"
                            ,"(For women) Let me use a dildo on you until you squirt"
                            ,"(For women) Let me put my penis in your booty"
                            ,"Sit on my lap with no clothes on"
                            ,"Grab whatever ever you want out of the fridge, put it on my privates, and cuck it off"
                            ,"Try to do a naked split"
                            ,"Take off my underwear using only your teeth"
                            ,"Let me tie up your hands and feet, then I will give you head, do not make a sound"
                            ,"Rub on your nipples until they become hard"
                            ,"Play with yourself for the next 3 rounds"
                            ,"Try to give yourself head"
                            ,"Moan as loud as you can"
                            ,"Take of a video of you masturbating and send it to my phone"
                            ,"Let me record you giving me head for the next two minutes"
                            ,"Do your best yoga pose naked"
                            ,"Pick your favourite porn, let’s watch it together and do exactly what they do"
                            ,"(For women) Let me put a dildo in your vagina while I put my penis in your booty"
                            ,"Let’s go have sex in the shower"
                            ,"Do me in your favourite position"
                            ,"Be my sex slave for the next 30 minutes"
                            ,"Let me sit on your face while you give me head"
                            ,"Invite one of your friends over for threesome"
                            ,"Get on the table (or in the middle/front) and do a strip tease"
                            ,"With clothes on (for now) top your partner and start riding"
                            ,"Twerk in only your underwear"
                            ,"Lick your partner (or person to your left) from their neck all the way to the brim or their underwear."
                            ,"Suck on your partner’s belly button for a minute"
                            ,"Lick or suck on the nipples of your partner for a minute"
                            ,"Unwrap a piece of candy in your mouth"
                            ,"Put a wrapped piece of candy in your mouth and then unwrap it with your partner"
                            ,"Take off your partner’s underwear using only your teeth"
                            ,"Kiss your partner all around their “down-low” area (not the actual part tough)"
                            ,"Put your hand down your partner’s pants until the next round"
                            ,"Make out with the person to the right of you (if okay with your partner :])"
                            ,"With no bottoms, sit on your partner’s man piece until the next round (women)"
                            ,"With no bottoms, spoon your partner until the next round"
                            ,"Give your partner head for 3 minutes"
                            ,"Take and ice cube and run it up and down your partner’s body until it is melted"
                            ,"Spray whipped cream (or any other food) all over someone in the group and eat it off of them"
                            ,"Bite/kiss your partner’s booty"
                            ,"Masturbate in front of the group (or just your partner)"
                            ,"Blindfold yourself, Spin around for ten seconds, who ever you are pointing to at the end, go in the next room and enjoy 7 minutes of heaven"
                            ,"Sit half-naked for the rest of the game"
                            ,"Take a naked selfie and send it to your partner"
                            ,"Go in the next room and make a sex video with your partner for 5 minutes"
                            ,"Give your partner’s private a peck"
                            ,"Stand outside naked for 3 minutes"
                            ,"Give a hand job for 3 minutes"
                            ,"Make love with your partner for 3 minutes only (must stop after 3 minutes)"
                            ,"Take off your partner’s bra (or nearest woman’s) using only your teeth"
                            ,"Give a back rub the person to your right"
                            ,"Pull up your favourite porn site your phone right now"
                            ,"Send a nude to your ex"
                            ,"Wear a pair of your partner’s underwear"
                            ,"Put a hickey on the inner thigh of the person to your left"
                            ,"Give head to the person next to you for 2 full songs"
                            ,"Make your partner cum using only your hands"
                            ,"Let your partner rub your inner thighs, but don’t let yourself get hard"
                            ,"Make a porno in front of the group. You must do everything the group says to do for 10 minutes"
                            ,"You must act like the sex slave to the person to your right. Doing whatever they say to do for the next 15 minutes."
                            ,"Go blindfolded into the closet, undress, and redress with items only available in that same closet."

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
