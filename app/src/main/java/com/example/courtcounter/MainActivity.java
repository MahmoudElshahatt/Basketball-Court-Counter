package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0;
    int sscore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
    }

     public void p_3(View View){
     score=score+3;
        displayForTeamA(score);
  }
   public void p_2(View View){
        score=score+2;
        displayForTeamA(score);
    }
    public void f_th(View View){
        score=score+1;
        displayForTeamA(score);
        // team B

    }  public void p_3b(View View){
        sscore=sscore+3;
        displayForTeamB(sscore);
    }
    public void p_2b(View View){
        sscore=sscore+2;
        displayForTeamB(sscore);
    }
    public void f_thb(View View){
        sscore=sscore+1;
        displayForTeamB(sscore);
    }
    public void reset(View view) {
        score=0;
        sscore=0;
       displayForTeamA(score);
       displayForTeamB(sscore);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}