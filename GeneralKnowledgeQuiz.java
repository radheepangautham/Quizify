/*
Author: Gautham Radheepan
This is what the General Knowledge quiz runs on by accessing the questions and displaying them
 */
package com.example.simple_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GeneralKnowledgeQuiz extends AppCompatActivity {
    private String[] questions,aAnswers,bAnswers,cAnswers,dAnswers,correct;
    Button abtn,bbtn,cbtn,dbtn,menu;
    TextView edttext,edtquestion,edttexta,edttextb,edttextc,edttextd,finalGKCount;
    public GeneralKnowledgeQuestions q = new GeneralKnowledgeQuestions();//gets the questions
    private int randomArray[];
    private int random,counter,correctCounter,randomArrayCounter;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_knowledge_quiz);
        //sets the button and the text view
        abtn = findViewById(R.id.gkabtn);
        bbtn = findViewById(R.id.gkbbtn);
        cbtn = findViewById(R.id.gkcbtn);
        dbtn = findViewById(R.id.gkdbtn);
        menu = findViewById(R.id.gkmenubtn);
        menu.setVisibility(View.INVISIBLE);//sets this button as temporarily invisible
        edttext = findViewById(R.id.gktextView);
        edtquestion = findViewById(R.id.gkquestionview);
        edttexta = findViewById(R.id.gkatextview);
        edttextb = findViewById(R.id.gkbtextview);
        edttextc = findViewById(R.id.gkctextview);
        edttextd = findViewById(R.id.gkdtextview);
        finalGKCount = findViewById(R.id.gkfinalcount);
        finalGKCount.setVisibility(View.INVISIBLE);//sets this button as temporarily invisible
        //sets the questions and answers
        questions=q.getQuestions();
        aAnswers=q.getaAnswers();
        bAnswers=q.getbAnswers();
        cAnswers=q.getcAnswers();
        dAnswers=q.getdAnswers();
        correct=q.getCorrect();
        randomArray = new int[10];
        randomArrayCounter=0;
        correctCounter=0;
        counter=0;
        initialSetQuestions();
        //checks to see if a button is clicked
        abtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                st=(String) abtn.getText();
                checkQuestion();

            }
        });
        bbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                st=(String) bbtn.getText();
                checkQuestion();
            }
        });
        cbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                st=(String) cbtn.getText();
                checkQuestion();
            }
        });
        dbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                st=(String) dbtn.getText();
                checkQuestion();
            }
        });
    }
    private void initialSetQuestions(){//the inital set questions
        random = new Random().nextInt(20);
        edtquestion.setText(("Question " + 1));
        edttext.setText(questions[random]);
        edttexta.setText(aAnswers[random]);
        edttextb.setText(bAnswers[random]);
        edttextc.setText(cAnswers[random]);
        edttextd.setText(dAnswers[random]);
        random++;
        randomArray[randomArrayCounter]=random;
        random--;

    }
    private void checkQuestion(){//after a button is clicked it checks to see if the answer is right and picks a new question to display
        if (st.equals(correct[random])){
            correctCounter++;
            displayCorrect();//displays correct screen
            menu.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v){
                    setNextQuestion();
                }
            });
        }
        else{
            displayWrong();//display wrong screen with the correct answer
            menu.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v){
                    setNextQuestion();
                }
            });
        }
    }
    private void setNextQuestion(){//sets the questions after the button has been clicked

        counter++;
        if (counter==10){//checks to see if 10 questions have been answered
            setVisibility();
            finalGKCount.setText("You have got " + getCorrect() + " questions right");
            menu.setText("Back to Menu");
            menu.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v){
                    Menu();
                }
            });
        }
        else {
            resetVisibility();
            random = new Random().nextInt(20);
            setRandomArray();
            edtquestion.setText(("Question " + (counter + 1)));
            edttext.setText(questions[random]);
            edttexta.setText(aAnswers[random]);
            edttextb.setText(bAnswers[random]);
            edttextc.setText(cAnswers[random]);
            edttextd.setText(dAnswers[random]);

        }
    }
    private int getCorrect(){
        return correctCounter;
    }
    private void Menu(){//returns to the main menu
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void setVisibility(){//sets the visibility to show incorrect and correct questions as well as the main menu option
        abtn.setVisibility(View.INVISIBLE);
        bbtn.setVisibility(View.INVISIBLE);
        cbtn.setVisibility(View.INVISIBLE);
        dbtn.setVisibility(View.INVISIBLE);
        edttexta.setVisibility(View.INVISIBLE);
        edttextb.setVisibility(View.INVISIBLE);
        edttextc.setVisibility(View.INVISIBLE);
        edttextd.setVisibility(View.INVISIBLE);
        edtquestion.setVisibility(View.INVISIBLE);
        edttext.setVisibility(View.INVISIBLE);
        menu.setVisibility(View.VISIBLE);
        finalGKCount.setVisibility(View.VISIBLE);
    }
    private void resetVisibility(){//sets the visibility to see the questions
        abtn.setVisibility(View.VISIBLE);
        bbtn.setVisibility(View.VISIBLE);
        cbtn.setVisibility(View.VISIBLE);
        dbtn.setVisibility(View.VISIBLE);
        edttexta.setVisibility(View.VISIBLE);
        edttextb.setVisibility(View.VISIBLE);
        edttextc.setVisibility(View.VISIBLE);
        edttextd.setVisibility(View.VISIBLE);
        edtquestion.setVisibility(View.VISIBLE);
        edttext.setVisibility(View.VISIBLE);
        menu.setVisibility(View.INVISIBLE);
        finalGKCount.setVisibility(View.INVISIBLE);
    }
    private void setRandomArray(){//makes sure that duplicate questions do not appear
        random++;
        while (true){
            if(randomArray[randomArrayCounter]==random) {
                random = new Random().nextInt(20);
                random++;
                randomArrayCounter = 0;
                while (randomArray[randomArrayCounter]==random){
                    if (randomArray[randomArrayCounter]==random){
                        random = new Random().nextInt(20);
                        random++;
                        randomArrayCounter = 0;
                    }
                    else{
                        break;
                    }
                }
            }
            if (randomArray[randomArrayCounter]==0){
                randomArray[randomArrayCounter]=random;
                break;
            }
            randomArrayCounter++;
        }
        random--;
        randomArrayCounter=0;
    }
    private void displayCorrect(){//if the answer is correct display screen
        setVisibility();
        finalGKCount.setText("Thats Correct!");
        menu.setText("Next Question");

    }
    private void displayWrong(){//if the answer is wrong display screen
        setVisibility();
        finalGKCount.setText("Thats incorrect. The correct answer was " + correct[random]);
        menu.setText("Next Question");

    }



}