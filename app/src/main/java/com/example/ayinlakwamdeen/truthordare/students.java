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
import static com.example.ayinlakwamdeen.truthordare.R.id.students;
import static com.example.ayinlakwamdeen.truthordare.R.id.type1;

public class students extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        Button btn;
        ActionBar a = getSupportActionBar();
        a.setDisplayHomeAsUpEnabled(true);
        a.setTitle("Student");
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
                    Toast.makeText(students.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 2) {
                    coin.setImageResource(R.drawable.dice2);
                    Toast.makeText(students.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
                if (side == 3) {
                    coin.setImageResource(R.drawable.dice3);
                    Toast.makeText(students.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 4) {
                    coin.setImageResource(R.drawable.dice4);
                    Toast.makeText(students.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
                if (side == 5) {
                    coin.setImageResource(R.drawable.dice5);
                    Toast.makeText(students.this, "DARE", Toast.LENGTH_SHORT).show();
                } else if (side == 6) {
                    coin.setImageResource(R.drawable.dice6);
                    Toast.makeText(students.this, "TRUTH", Toast.LENGTH_SHORT).show();
                }
////////////////////TO ROTATE THE COIN
                RotateAnimation rotate = new RotateAnimation(0, 360,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                coin.startAnimation(rotate);


                if ((side==2)||(side==4)||(side==6)){
                    String truth[]= {
                            "How people have you slept with on campus?"
                            ,"What is your real GPA?"
                            ,"What is your least favourite frat on campus?"
                            ,"What did you do on your first night of freshman year?"
                            ,"Would you ever have sex with one of your professors? If so, which one?"
                            ,"Have you ever blacked out from drinking too much?"
                            ,"What is the craziest thing that you have ever done while drunk?"
                            ,"Who is the best roommate that you have ever had?"
                            ,"What is the most annoying thing that your roommate has ever done?"
                            ,"Have you ever had sex anywhere on campus?"
                            ," Who was your first crush at school?"
                            ,"Who is the most handsome guy/beautiful girl at school?"
                            ,"What’s your idea of a perfect date?"
                            ,"Where would you like to go on a first date?"
                            ,"Do you have a boyfriend?"
                            ,"How many boyfriends have you had?"
                            ,"Have you been kissed yet?"
                            ,"When did you have your first kiss, and with who?"
                            ,"Did you ever break your boyfriend’s/girlfriend’s heart?"
                            ,"Was your heart ever broken by your boyfriend/girlfriend?"
                            ,"If you could go out on a date with a celebrity, who would it be?"
                            ,"If you are stranded on a remote island, who would you choose for company?"
                            ,"If you had to go out on a date with one of us in the room, who would it be?"
                            ,"Of all the people you have dated, who has the most beautiful eyes?"
                            ,"Tell us about your most embarrassing date?"
                            ,"What was your most awkward moment on a date?"
                            ,"Who do you think is the most beautiful/handsome teacher at school?"
                            ,"Did you ever have a crush on any of your best friend’s boyfriends/girlfriends?"
                            ,"Have you ever flirted with your best friend’s siblings?"
                            ,"Would you use a dating website?"
                            ,"If you had to pick one of us to go on a prom date, who would it be?"
                            ,"Are you obsessed with a celebrity?"
                            ,"Would you break up with someone by sending them a text?"
                            ,"Are you jealous of someone because of who they date?"
                            ,"How would you want the love of your life to propose to you?"
                            ,"What kind of a person would you want to be married to in the future?"
                            ,"Have you ever fallen in love with someone at first sight?"
                            ,"Who is your best friend (when the person has two good friends) – name only one?"
                            ,"Did you ever lie to your best friend/bud?"
                            ,"Did you make them do something for you by lying?"
                            ,"What were your first impressions about “best friend’s name”?"
                            ,"Would you lie or cheat for a friend?"
                            ,"What would you do if you had a crush on your bestie’s boyfriend/girlfriend?"
                            ,"Would you go behind your bestie’s back with a crush?"
                            ,"Would you ditch a lunch date with your bestie to go on a date?"
                            ,"Name one quality that you do not like in your friend."
                            ,"What do you like most about your best friend?"
                            ,"What are the three most important qualities you look for in a friend?"
                            ,"Who was the worst friend you have had and why?"
                            ,"What is the cruelest thing you have done to a friend?"
                            ,"Have you ever shared your best friend’s secrets with anyone else?"
                            ,"Can you go for weeks or even months without talking to your bestie?"
                            ,"Did you have an imaginary friend? What was his or her name?"
                            ,"Did you ever cheat in a test?"
                            ,"Did you actually enjoy reading a romantic poem in literature class but pretended that it was lame?"
                            ,"What’s your career ambition?"
                            ,"How confident are you about achieving your dreams?"
                            ,"Which subject do you hate the most?"
                            ,"Which is the most boring class you had to attend?"
                            ,"Did you ever skip school by telling a lie and lie about it to your parents?"
                            ,"Did you ever mock a teacher or classmate behind their back?"
                            ,"What is the first thing you do after school every day?"
                            ,"What is your favorite thing to do at school?"
                            ,"Do you like gym class?"
                            ,"Are you into sports?"
                            ,"Who is your favorite teacher and why?"
                            ,"Have you ever played a prank on a teacher?"
                            ,"How many times have you been punished and sent to the principal’s office?"
                            ,"Who is the creepiest kid you know in school?"
                            ,"What is the lowest/worst grade you got in school?"
                            ,"Have you ever fallen asleep in class?"
                            ,"Did you pretend to be sick so you can skip class or avoid a test?"
                            ,"Who was the first boy that you kissed in school?"
                            ,"Have you ever had sex in your roommate’s bed?"
                            ,"Did you smoke or drink before college? Or did you start when you got here?"
                            ,"Have you ever been a stripper?"
                            ,"Have you ever slept with your roommate’s bf/gf?"
                            ,"Have you ever had sex in your parent’s bed?"
                            ,"Would you drop out of school if you were to win the lottery?"
                            ,"What is the best party that you’ve ever been to?"
                            ,"How many parties have you thrown at your house?"
                            ,"Have you ever had a threesome?"
                            ,"Have you ever wanted to have an orgy?"
                            ,"Have you used a toy while have sex?"
                            ,"What is the longest you’ve had sex in one session?"
                            ,"What is most amount of shots that you have taken in one night?"
                            ,"Have you ever thrown up in someone’s car?"
                            ,"Have you ever wet bed from being too drunk?"
                            ,"What is the longest you have gone without sleep?"
                            ,"What is the longest you’ve gone without sex?"
                            ,"How many times have you skipped class for no reason?"
                            ,"Have you ever gotten an STD?"
                            ,"Have you ever woken up to a stranger in your bed?"
                            ,"What is the earliest you have ever started drinking in the day?"
                            ,"Have you ever spent your parent’s money on alcohol?"
                            ,"How many freshmen have you slept with?"
                            ,"Have you ever taken money from a freshman?"
                            ,"Have you ever lied to your parents about if you were in classes or not?"
                            ,"Have you ever taken money from your roommate?"
                            ,"What is the most annoying thing your roommate does?"
                            ,"Have you been in any fights while in school?"
                            ,"Have you ever had someone write a paper for you?"
                            ,"Have you ever done a sex train?"};
                    Random rand = new Random();
                    int random = rand.nextInt((truth).length);
                    String guess1 = (truth[random]).toString();
                    display.setText(guess1);


                } else{
                    String dare[] = {
                            "Take a shot"
                            ,"Take a shot off of the person to your right"
                            ,"Run down the street in only your underwear"
                            ,"Slap the person to your left on the booty"
                            ,"Speak like Tony Montana for the next 10 minutes"
                            ,"Give the person to your right a hickie"
                            ,"Eat toilet paper"
                            ,"Snort a line of sugar"
                            ,"Eat some soap"
                            ,"Twerk on a handstand"
                            ,"Let someone give you haircut with their weak hand"
                            ,"Make a freestyle rap song about each person in the group"
                            ,"Lick someone’s foot"
                            ,"Give a topless lap dance"
                            ,"Call someone random, and talk freaky to them"
                            ,"Twerk while in a split"
                            ,"Spin the bottle, whoever it lands on you must take their shirt off, only using your teeth"
                            ,"Send a nude to one of your exes"
                            ,"Email one of your professor’s and tell them you love them"
                            ,"Lick the wall"
                            ,"Blindfolded, spin around for 10 seconds, kiss the person in front you at the end of your spinning"
                            ,"Close your eyes, go to the refrigerator and eat whatever you grab"
                            ,"Give some head with their underwear still on"
                            ,"Take two shots of a dark and a light liquor ( 4 shots total )"
                            ,"Blindfolded, let someone tie you to a chair and give you a lapdance"
                            ,"Go outside completely naked and walk slowly up to the mailbox and back"
                            ,"Let someone lick a full circle around your face"
                            ,"Stand in the corner in “time out”, not say a word for the next 3 rounds"
                            ,"Make out with someone’s boyfriend or girlfriend"
                            ,"Raise your shirt play with your nipples"
                            ,"Chug a whole beer in 15 seconds"
                            ,"it in the trash can for the next round"
                            ,"Chug an entire beer, then spin around for 15 seconds, after that try to run to the door"
                            ,"Wearing only high heels do a strip dance for the group"
                            ,"Take 2 shots and do a cartwheel"
                            ,"Call your parents and tell them you’re dropping out"

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
