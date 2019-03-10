package com.example.android.rockpaperscissor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String[] lib={"rock","paper","scissor"};
    private String myChoice;
    private int myScore=0;
    private int sysScore=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void rock(View view) {
        myChoice="rock";
        play();

    }
    public void paper(View view) {
        myChoice="paper";
        play();
    }
    public void scissor(View view) {
        myChoice="scissor";
        play();

    }

    private void play() {
        TextView gen_Text = (TextView)findViewById(R.id.generate);
        int rand=new Random().nextInt(3);
        String syschoice=lib[rand];
        gen_Text.setText(syschoice);
        switch(rand){
            case 0:
                if(myChoice.equals("paper")){
                    myScore++;
                }
                else if(syschoice.equals(myChoice)){
                    Toast.makeText(this,"Tie no Score",Toast.LENGTH_SHORT).show();
                }
                else sysScore++;
                break;
            case 1:
                if(myChoice.equals("scissor")){
                    myScore++;
                }
                else if(syschoice.equals(myChoice)){
                    Toast.makeText(this,"Tie no Score",Toast.LENGTH_SHORT).show();
                }
                else sysScore++;break;
            case 2:
                if(myChoice.equals("rock")){
                    myScore++;
                }
                else if(syschoice.equals(myChoice)){
                    Toast.makeText(this,"Tie no Score",Toast.LENGTH_SHORT).show();
                }
                else sysScore++;break;
             default:
             Toast.makeText(this,"Default Executed",Toast.LENGTH_SHORT).show();
        }
        TextView ms_Text = (TextView)findViewById(R.id.yScore);
        ms_Text.setText("Your Score : "+myScore);
        TextView ss_Text = (TextView)findViewById(R.id.sScore);
        ss_Text.setText("System Score : "+sysScore);

    }
}
