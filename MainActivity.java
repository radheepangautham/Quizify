/*

Author: Gautham Radheepan


This is the main class where you initially get to choose which category of quizzes you would like to do
 */
package com.example.simple_quiz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sportsbtn,compscibtn,genknowbtn;
    TextView edttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sportsbtn = findViewById(R.id.sportsbtn);
        compscibtn = findViewById(R.id.compscibtn);
        genknowbtn = findViewById(R.id.genknowbtn);

        edttext = findViewById(R.id.screen);
        //checks to see which quiz to go to once you click on a button
        sportsbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openSportsQuiz();
            }
        });
        compscibtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openComputerScienceQuiz();
            }
        });
        genknowbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openGeneralKnowledgeQuiz();
            }
        });

    }



    private void openSportsQuiz() {
        Intent intent = new Intent(MainActivity.this,SportsQuiz.class);
        startActivity(intent);
    }
    private void openComputerScienceQuiz() {
        Intent intent = new Intent(MainActivity.this,ComputerScienceQuiz.class);
        startActivity(intent);
    }
    private void openGeneralKnowledgeQuiz(){
        Intent intent = new Intent(MainActivity.this,GeneralKnowledgeQuiz.class);
        startActivity(intent);
    }
}