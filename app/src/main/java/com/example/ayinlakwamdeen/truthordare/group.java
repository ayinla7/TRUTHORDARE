package com.example.ayinlakwamdeen.truthordare;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import  android.content.ClipboardManager;

import java.util.Locale;
import java.util.Random;

import android.speech.tts.TextToSpeech;

public class group extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private TextToSpeech tts;
    //private Button buttonSpeak;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        //////////////
        tts = new TextToSpeech(this, this);
     //   buttonSpeak = (Button) findViewById(R.id.speak);
        display = (TextView) findViewById(R.id.display);





      //  ActionBar a = getActionBar();
        //a.setDisplayHomeAsUpEnabled(true);
        //a.setTitle("Group");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linid);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relid);
        //TextView spin = (TextView) findViewById(R.id.spin);


        //   a.setIcon(R.drawable.tord);
/////////////////////////////////////
        Button btn;
        final ImageView coin;
        Random r;
        int side;
        Button darebtn, truthbtn;
        ;
        final TextView display, tord;
        //darebtn=(Button)findViewById(R.id.darebtn);
        //truthbtn=(Button)findViewById(R.id.truthbtn);
        display = (TextView) findViewById(R.id.display);
        tord = (TextView) findViewById(R.id.tord);
        display.setTextIsSelectable(true);
        coin = (ImageView) findViewById(R.id.coin);
      //  buttonSpeak.setOnClickListener(new View.OnClickListener() {
        //    @Override
          //  public void onClick(View view) {
            //    speakOut();
            //}
        //});

        coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();
                int side = r.nextInt(6);
                if (side == 1) {
                    coin.setImageResource(R.drawable.dice1);
                    Toast.makeText(group.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 2) {
                    coin.setImageResource(R.drawable.dice2);
                    Toast.makeText(group.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
                if (side == 3) {
                    coin.setImageResource(R.drawable.dice3);
                    Toast.makeText(group.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 4) {
                    coin.setImageResource(R.drawable.dice4);
                    Toast.makeText(group.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
                if (side == 5) {
                    coin.setImageResource(R.drawable.dice5);
                    Toast.makeText(group.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 6) {
                    coin.setImageResource(R.drawable.dice6);
                    Toast.makeText(group.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
////////////////////TO ROTATE THE COIN
                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                coin.startAnimation(rotate);


                if ((side == 2) || (side == 4) || (side == 6)) {
                    String truth[] = {
                            "If you got to have a threesome with people in this room, who would you do it with and why?"
                            , "Let someone go through your YouTube history and read it out to the group."
                            , "Let someone go through your Amazon purchase history and read it out to the group."
                            , "Have you ever sexted anyone? If so, read one of the sexts in a fake British accent."
                            , "What is the most adventurous thing you’d want someone to do to you?"
                            , "It’s totally not legal to do this but if it were . . . . [fill in the blank]."
                            , "Who do you most want to sleep with, out of everyone here?"
                            , "What is the song that you get it on to the most?"
                            , "Where are you on the straight / queer spectrum? Be honest!"
                            , "What’s your favorite fantasy to pleasure yourself to?"
                            , "Where is the weirdest place that you’ve ever gone solo?"
                            , "What is your favorite 'special' toy?"
                            , "When was the first time you came?"
                            , "Who was your best partner and why?"
                            , "When was your first kiss?"
                            , "Do you have an “I’m getting laid tonight” outfit? What it is?"
                            , "What’s your favorite body part on yourself? On your partner?"
                            , "Have you ever cheated?"
                            , "ave you ever wanted to cheat?"
                            , "How many people have you slept with?"
                            , "Who’s the hottest person at work?"
                            , "What would be more thrilling: angry sex or make-up sex?"
                            , "Who here are you most jealous of?"

                    };
                    Random rand = new Random();
                    int random = rand.nextInt((truth).length);
                    String guess1 = (truth[random]).toString();
                    display.setText(guess1);
                    tord.setText("TRUTH");

                } else {
                    String dare[] = {
                            "Do your best fake “O” while looking the person to the left of you in the eye."
                            , "Have someone blindfold you. Then, everyone in the group kisses you on the cheek, and you have to either say which one is your partner, and then kiss them on the lips, OR, you have to choose one person that you want to kiss on the lips."
                            , "With your eyes closed and the other person or people standing across from you in the room, walk with your hands out. You have to kiss the first person you touch, where you touch them."
                            , "You have to leave an R-rated voicemail for an ex."
                            , "Someone has to lick peanut butter, chocolate sauce, or whipped cream off your finger, cheek, or somewhere of their choice.",
                            "Someone feeds you M&Ms or other small chocolate candy and you have to say, 'Thank you, Daddy,' after each one."
                            , "If there’s a pool, you have to go skinny dipping, and you have to choose one buddy to go with you."
                            , "You’re in school and you’ve been a bad student. For the next round, you’re in time out on someone’s lap."
                            , "Someone goes onto your Amazon account and buys a special toy for you that’s $20 or less."
                            , "Talk to your hand like you’re making a game plan to sleep with someone else who is in the room."
                            , "Lay down on the ground and have someone pretend like they’re using chalk to draw an outline of your body."
                            , "Go to Cosmopolitan’s website’s love section and find a position you’ve never heard of. Then, try to act it out using whatever furniture and pillows you have at your disposal."
                            , "You leave the room. Everyone pours a shot. You come back into the room and take one of the shots that was poured. Whoever poured the drink, you have to sit on their lap for the rest of the round. (People can take the other shots)."
                            , "You have to undress down to your accessories and skivvies. If you want to keep any clothes on, you have to take a shot for every piece of clothing you want to keep."
                            , "Lightly trace your hands over someone else’s lips and whisper 'I’m coming, I’m coming', five times."
                            , "Change your Facebook status to 'I’m coming . . . I’m coming . . .' Then, one minute later, change it to 'I just came.'"
                            , "Put on a swimming suit and have someone rub sunscreen on your back. Wear the suit for the rest of the evening."
                            , "Someone gives you a back massage for one minutes while you’re blindfolded. If you like their style, you can choose to kiss them afterwards, but without knowing their identity."
                            , "You have to keep your hand on the very inner thigh of the person next to you for the next round."
                            , "Call your boyfriend or crush and explain the rules of Monopoly to them."
                            , "Call your crush and sing a love song like “I can’t help falling in love”."

                    };
                    Random rand = new Random();
                    int random = rand.nextInt((dare).length);
                    String guess = (dare[random]).toString();
                    display.setText(guess);
                    tord.setText("DARE");
                }
            }

        });


        //getActionBar().setDisplayShowHomeEnabled(true);
       //getActionBar().setDisplayHomeAsUpEnabled(true);

    }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected (MenuItem item){

            int id = item.getItemId();

            if (id == R.id.speak) {

speakOut();
            }
            if (id == android.R.id.home) {
                this.finish();
                return true;
            }
            if (id == R.id.main) {
                Intent int1 = new Intent(getApplicationContext(), HOME1.class);
                startActivity(int1);
                return true;
            }
            if (id == R.id.copy) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                TextView display = (TextView) findViewById(R.id.display);
                ClipData clipData = ClipData.newPlainText("Copy", display.getText());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(group.this, "Copied", Toast.LENGTH_SHORT).show();

                return true;

            }
            if (id == R.id.share) {
                TextView display = (TextView) findViewById(R.id.display);

                Intent sh = new Intent();
                sh.setAction(Intent.ACTION_SEND);
                sh.putExtra(Intent.EXTRA_SUBJECT, display.getText().toString());
                sh.putExtra(Intent.EXTRA_TEXT, display.getText().toString());
                sh.setType("text/plain");
                sh.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(Intent.createChooser(sh, "Select Appliction to Share Text"));
                Toast.makeText(group.this, "Sharing", Toast.LENGTH_SHORT).show();

                return true;
            }
            if (id == R.id.exit) {
                AlertDialog.Builder builder = new AlertDialog.Builder(group.this);
                builder.setTitle("QUIT");
                builder.setMessage("Are you sure you want to exit?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
                return true;
            }
            if (id == R.id.mode1) {
                //    black
                TextView tord = (TextView) findViewById(R.id.tord);
                TextView spin = (TextView) findViewById(R.id.spin);
                spin.setTextColor(Color.RED);
                TextView display = (TextView) findViewById(R.id.display);

                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linid);
                linearLayout.setBackgroundResource(R.drawable.bl);
                tord.setBackgroundResource(R.drawable.bl);
                tord.setTextColor(Color.RED);

                //  tord.setBackgroundColor(Color.BLACK);
                display.setTextColor(Color.RED);
                display.setBackgroundColor(Color.BLACK);
                //display.setBackgroundResource();
                Toast.makeText(group.this, "Night Mode", Toast.LENGTH_SHORT).show();

                return true;
            }
            if (id == R.id.mode2) {
                //    white
                TextView tord = (TextView) findViewById(R.id.tord);
                TextView display = (TextView) findViewById(R.id.display);
                TextView spin = (TextView) findViewById(R.id.spin);
                spin.setTextColor(Color.BLACK);
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linid);
                linearLayout.setBackgroundResource(R.drawable.wh);
                tord.setBackgroundResource(R.drawable.wh);
                tord.setTextColor(Color.BLACK);
                //tord.setBackgroundColor(Color.WHITE);
                display.setTextColor(Color.BLACK);
                display.setBackgroundColor(Color.WHITE);
                Toast.makeText(group.this, "Day-light Mode", Toast.LENGTH_SHORT).show();

                return true;
            }


            return super.onOptionsItemSelected(item);
        }
    @Override
    public void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }
        @Override
        public void onInit ( int status){

            if (status == TextToSpeech.SUCCESS) {
                int result = tts.setLanguage(Locale.US);
                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("TTS", "This Language is not supported");
                } else {
                  //  buttonSpeak.setEnabled(true);
                    speakOut();
                }
            } else {
                Log.e("TTS", "Initilization Failed!");
            }
        }

    private void speakOut() {
        String text = display.getText().toString();
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}



