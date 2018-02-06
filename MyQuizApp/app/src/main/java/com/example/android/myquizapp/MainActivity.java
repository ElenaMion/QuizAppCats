/**
 * Created by Elena
 */

package com.example.android.myquizapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    float score = 0; //score for correct answers
    int maxScore = 6;
    int waitTime = 3000; //time to wait before showing next question

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when answer to the 1st question is submitted
     *
     * @param view
     */
    public void submit1(View view) {

        //get the checkboxes
        CheckBox iriomote_cat = ((CheckBox) findViewById(R.id.q1_iriomote_cat));
        CheckBox scottish_wildcat = ((CheckBox) findViewById(R.id.q1_scottish_wildcat));
        CheckBox fishing_cat = ((CheckBox) findViewById(R.id.q1_fishing_cat));
        CheckBox iberian_lynx = ((CheckBox) findViewById(R.id.q1_iberian_lynx));

        //check which answers are checked; mark correct with green and incorrect with red
        if (iriomote_cat.isChecked()) {
            iriomote_cat.setTextColor(Color.GREEN);
        }
        if (scottish_wildcat.isChecked()) {
            scottish_wildcat.setTextColor(Color.RED);
        }
        if (fishing_cat.isChecked()) {
            fishing_cat.setTextColor(Color.RED);
        }
        if (iberian_lynx.isChecked()) {
            iberian_lynx.setTextColor(Color.GREEN);
        }

        //if both correct answers are selected and none of the incorrect answers is selected, score 1 point
        if (iriomote_cat.isChecked() && iberian_lynx.isChecked() &&
                !scottish_wildcat.isChecked() && !fishing_cat.isChecked()) {
            score += 1;
            //if only one of correct answers is selected and no more than 2 checkboxes selected in total, score 0.5 point
        } else if (((iriomote_cat.isChecked() && !iberian_lynx.isChecked()) ||
                (!iriomote_cat.isChecked() && iberian_lynx.isChecked())) &&
                (!scottish_wildcat.isChecked() || !fishing_cat.isChecked())) {
            score += 0.5;
        }

        //show a pop-up with correct answer
        Toast.makeText(this, R.string.a1_small_cats, Toast.LENGTH_LONG).show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                //make the next question visible
                findViewById(R.id.question1).setVisibility(View.GONE);
                findViewById(R.id.question2).setVisibility(View.VISIBLE);
            }
        }, waitTime);
    }

    /**
     * This method is called when answer to the 2nd question is submitted
     *
     * @param view
     */
    public void submit2(View view) {

        //get the checkboxes
        RadioButton q2_less65 = ((RadioButton) findViewById(R.id.q2_less65));
        RadioButton q2_more65 = ((RadioButton) findViewById(R.id.q2_more65));
        RadioButton q2_more100 = ((RadioButton) findViewById(R.id.q2_more100));
        RadioButton q2_more150 = ((RadioButton) findViewById(R.id.q2_more150));

        //check which answers are checked; mark correct with green and incorrect with red
        if (q2_less65.isChecked()) {
            q2_less65.setTextColor(Color.GREEN);
            score++;
        }
        if (q2_more65.isChecked()) {
            q2_more65.setTextColor(Color.RED);
        }
        if (q2_more100.isChecked()) {
            q2_more100.setTextColor(Color.RED);
        }
        if (q2_more150.isChecked()) {
            q2_more150.setTextColor(Color.RED);
        }

        //show a pop-up with correct answer
        Toast.makeText(this, R.string.a2_amur_leopards, Toast.LENGTH_LONG).show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                //make the next question visible
                findViewById(R.id.question2).setVisibility(View.GONE);
                findViewById(R.id.question3).setVisibility(View.VISIBLE);
            }
        }, waitTime);
    }

    /**
     * This method is called when answer to the 3rd question is submitted
     *
     * @param view
     */
    public void submit3(View view) {

        //get the checkboxes
        RadioButton q3_nt = ((RadioButton) findViewById(R.id.q3_nt));
        RadioButton q3_vu = ((RadioButton) findViewById(R.id.q3_vu));
        RadioButton q3_en = ((RadioButton) findViewById(R.id.q3_en));
        RadioButton q3_ex = ((RadioButton) findViewById(R.id.q3_ex));

        //check which answers are checked; mark correct with green and incorrect with red
        if (q3_nt.isChecked()) {
            q3_nt.setTextColor(Color.RED);
        }
        if (q3_vu.isChecked()) {
            q3_vu.setTextColor(Color.GREEN);
            score++;
        }
        if (q3_en.isChecked()) {
            q3_en.setTextColor(Color.RED);
        }
        if (q3_ex.isChecked()) {
            q3_ex.setTextColor(Color.RED);
        }

        //show a pop-up with correct answer
        Toast.makeText(this, R.string.a3_golden_cat, Toast.LENGTH_LONG).show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                //make the next question visible
                findViewById(R.id.question3).setVisibility(View.GONE);
                findViewById(R.id.question4).setVisibility(View.VISIBLE);
            }
        }, waitTime);
    }

    /**
     * This method is called when answer to the 4th question is submitted
     *
     * @param view
     */
    public void submit4(View view) {

        //get the checkboxes
        RadioButton q4_bobcat = ((RadioButton) findViewById(R.id.q4_bobcat));
        RadioButton q4_florida_panther = ((RadioButton) findViewById(R.id.q4_florida_panther));
        RadioButton q4_western_lion = ((RadioButton) findViewById(R.id.q4_western_lion));
        RadioButton q4_eastern_cougar = ((RadioButton) findViewById(R.id.q4_eastern_cougar));

        //check which answers are checked; mark correct with green and incorrect with red
        if (q4_bobcat.isChecked()) {
            q4_bobcat.setTextColor(Color.RED);
        }
        if (q4_florida_panther.isChecked()) {
            q4_florida_panther.setTextColor(Color.RED);
        }
        if (q4_western_lion.isChecked()) {
            q4_western_lion.setTextColor(Color.RED);
        }
        if (q4_eastern_cougar.isChecked()) {
            q4_eastern_cougar.setTextColor(Color.GREEN);
            score++;
        }

        //show a pop-up with correct answer
        Toast.makeText(this, R.string.a4_eastern_cougar, Toast.LENGTH_LONG).show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                //make the next question visible
                findViewById(R.id.question4).setVisibility(View.GONE);
                findViewById(R.id.question5).setVisibility(View.VISIBLE);
            }
        }, waitTime);
    }

    /**
     * This method is called when answer to the 5th question is submitted
     *
     * @param view
     */
    public void submit5(View view) {

        //get the checkboxes
        RadioButton q5_NA = ((RadioButton) findViewById(R.id.q5_NA));
        RadioButton q5_SA = ((RadioButton) findViewById(R.id.q5_SA));
        RadioButton q5_EU = ((RadioButton) findViewById(R.id.q5_EU));
        RadioButton q5_Asia = ((RadioButton) findViewById(R.id.q5_Asia));

        //check which answers are checked; mark correct with green and incorrect with red
        if (q5_NA.isChecked()) {
            q5_NA.setTextColor(Color.GREEN);
            score++;
        }
        if (q5_SA.isChecked()) {
            q5_SA.setTextColor(Color.RED);
        }
        if (q5_EU.isChecked()) {
            q5_EU.setTextColor(Color.RED);
        }
        if (q5_Asia.isChecked()) {
            q5_Asia.setTextColor(Color.RED);
        }

        //show a pop-up with correct answer
        Toast.makeText(this, R.string.a5_Miracinonyx, Toast.LENGTH_LONG).show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                //make the next question visible
                findViewById(R.id.question5).setVisibility(View.GONE);
                findViewById(R.id.question6).setVisibility(View.VISIBLE);
            }
        }, waitTime);
    }

    /**
     * This method is called when answer to the 6yh question is submitted
     *
     * @param view
     */
    public void submit6(View view) {

        //get the checkboxes
        CheckBox q6_smilodon = ((CheckBox) findViewById(R.id.q6_smilodon));
        CheckBox q6_afrosmilus = ((CheckBox) findViewById(R.id.q6_afrosmilus));
        CheckBox q6_eofelis = ((CheckBox) findViewById(R.id.q6_eofelis));
        CheckBox q6_dinofelis = ((CheckBox) findViewById(R.id.q6_dinofelis));

        //check which answers are checked; mark correct with green and incorrect with red
        if (q6_smilodon.isChecked()) {
            q6_smilodon.setTextColor(Color.GREEN);
            score += 0.25;
        }
        if (q6_afrosmilus.isChecked()) {
            q6_afrosmilus.setTextColor(Color.GREEN);
            score += 0.25;
        }
        if (q6_eofelis.isChecked()) {
            q6_eofelis.setTextColor(Color.GREEN);
            score += 0.25;
        }
        if (q6_dinofelis.isChecked()) {
            q6_dinofelis.setTextColor(Color.GREEN);
            score += 0.25;
        }

        //show a pop-up with correct answer
        Toast.makeText(this, "" + getText(R.string.a6_saber_tooth) + "\nYour score: " + score, 7).show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                //make the next question visible
                findViewById(R.id.question6).setVisibility(View.GONE);
                setScore();
                findViewById(R.id.score).setVisibility(View.VISIBLE);
            }
        }, waitTime);
    }

    /**
     * puts result in the TextView
     */
    private void setScore() {
        TextView scoreText = (TextView) findViewById(R.id.show_score);
        String scoreValue = "Your score is " + score + " out of " + maxScore;
        if (score >= 5) {
            scoreValue = "Awesome!!! \n" + scoreValue + "\nHow many cats do you have?";
        }
        if ((score < 5) && (score >= 3)) {
            scoreValue = "Not bad. \n" + scoreValue;
        }
        if (score < 3) {
            scoreValue = scoreValue + "\nI think you should try caring about animals.";
        }
        scoreValue += "\n\nPlease continue to the next questions. They won't affect your score.";
        scoreText.setText(scoreValue);
    }

    public void proceed_to_last(View view) {
        Intent lastScreen = new Intent("com.example.android.myquizapp.LastActivity");
        if (lastScreen.resolveActivity(getPackageManager()) != null) {
            startActivity(lastScreen);
        }
    }

}