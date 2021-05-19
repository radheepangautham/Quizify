/*
Author: Gautham Radheepan

 */
//This sets the sports quiz questions
package com.example.simple_quiz;


public class SportsQuizQuestions {
    //private vairables to hold the questions and answers
    private int correctCounter;
    private String[] questions;
    private String[] aAnswers;
    private String[] bAnswers;
    private String[] cAnswers;
    private String[] dAnswers;
    private String[] correct;
    public SportsQuizQuestions(){
       // set the size of the arrays
        questions = new String[20];
        aAnswers = new String [20];
        bAnswers = new String [20];
        cAnswers = new String [20];
        dAnswers = new String [20];
        correct = new String[20];

    }
    private void setQuestions(){
        questions[0]="How many points are free throws worth in Basketball?";
        aAnswers[0]="1 point";
        bAnswers[0]="2 points";
        cAnswers[0]="3 points";
        dAnswers[0]="4 points";
        correct[0]="A";
        questions[1]="How long is an Olympic swimming pool?";
        aAnswers[1]="25 meters";
        bAnswers[1]="50 meters";
        cAnswers[1]="100 meters";
        dAnswers[1]="150 meters";
        correct[1]="B";
        questions[2]="In soccer, how many players are allowed on the field for one team?";
        aAnswers[2]="10";
        bAnswers[2]="11";
        cAnswers[2]="12";
        dAnswers[2]="13";
        correct[2]="B";
        questions[3]="In baseball, how many innings are there?";
        aAnswers[3]="9";
        bAnswers[3]="10";
        cAnswers[3]="11";
        dAnswers[3]="12";
        correct[3]="A";
        questions[4]="How many periods are there in ice hockey?";
        aAnswers[4]="1";
        bAnswers[4]="2";
        cAnswers[4]="3";
        dAnswers[4]="4";
        correct[4]="C";
        questions[5]="Who won the 2014 FIFA world cup?";
        aAnswers[5]="Brazil";
        bAnswers[5]="Germany";
        cAnswers[5]="Argentina";
        dAnswers[5]="Spain";
        correct[5]="B";
        questions[6]="How many runs do you get if you hit the cricket ball over the edge without bouncing?";
        aAnswers[6]="3";
        bAnswers[6]="4";
        cAnswers[6]="5";
        dAnswers[6]="6";
        correct[6]="D";
        questions[7]="In volleyball, how many players are allowed on the court for one team?";
        aAnswers[7]="4";
        bAnswers[7]="5";
        cAnswers[7]="6";
        dAnswers[7]="7";
        correct[7]="C";
        questions[8]="Who won 2019 NBA championship?";
        aAnswers[8]="Golden State Warriors";
        bAnswers[8]="Milwaukee Bucks";
        cAnswers[8]="Utah Jazz";
        dAnswers[8]="Toronto Raptors";
        correct[8]="D";
        questions[9]="Which country won the most medals at the 2018 Olympics";
        aAnswers[9]="Canada";
        bAnswers[9]="Germany";
        cAnswers[9]="Norway";
        dAnswers[9]="United States of America";
        correct[9]="C";
        questions[10]="What is it called when you hit a home run with the bases loaded?";
        aAnswers[10]="Grand Slam";
        bAnswers[10]="4 pointer";
        cAnswers[10]="Strike out";
        dAnswers[10]="fly ball";
        correct[10]="A";
        questions[11]="How many minutes are there in a round of boxing?";
        aAnswers[11]="1";
        bAnswers[11]="2";
        cAnswers[11]="3";
        dAnswers[11]="4";
        correct[11]="C";
        questions[12]="Who won the Stanley Cup in 2019?";
        aAnswers[12]="Boston Bruins";
        bAnswers[12]="Nashville Predators";
        cAnswers[12]="St.Louis Blues";
        dAnswers[12]="Toronto Maple Leafs";
        correct[12]="C";
        questions[13]="How many NBA championships did Michael Jordan win with the Chicago Bulls?";
        aAnswers[13]="5";
        bAnswers[13]="6";
        cAnswers[13]="7";
        dAnswers[13]="8";
        correct[13]="B";
        questions[14]="Which racing driver holds the record for the most Formula One World Drivers’ Championship wins, with seven titles?";
        aAnswers[14]="Lewis Hamilton";
        bAnswers[14]="Sebastian Vettel";
        cAnswers[14]="Niki Lauda";
        dAnswers[14]="Michael Schumacher";
        correct[14]="D";
        questions[15]="Who won the last SuperBowl?";
        aAnswers[15]="Kansas City Chiefs";
        bAnswers[15]="San Francisco 49ers";
        cAnswers[15]="New England Patriots";
        dAnswers[15]="New York Giants";
        correct[15]="A";
        questions[16]="When you knock all the pins down in bowling, what is it called?";
        aAnswers[16]="Spare";
        bAnswers[16]="Strike";
        cAnswers[16]="Split";
        dAnswers[16]="A Double";
        correct[16]="B";
        questions[17]="What is the world record for the 100 meter sprint?";
        aAnswers[17]="9.69 seconds";
        bAnswers[17]="9.65 seconds";
        cAnswers[17]="9.71 seconds";
        dAnswers[17]="9.58 seconds";
        correct[17]="D";
        questions[18]="How many Olympic medals has Micheal Phelps won?";
        aAnswers[18]="30";
        bAnswers[18]="28";
        cAnswers[18]="26";
        dAnswers[18]="24";
        correct[18]="B";
        questions[19]="Which team won the 2016 World Series to break a 108 win less streak?";
        aAnswers[19]="Boston Red Sox";
        bAnswers[19]="Chicago White Sox";
        cAnswers[19]="Chicago Cubs";
        dAnswers[19]="New York Yankees";
        correct[19]="C";

    }
    public String[] getQuestions() {
        setQuestions();
        return questions;
    }

    public void setCorrectCounter(){
        correctCounter++;
    }
    public int getCorrectCounter(){
        return correctCounter;
    }
    public String[] getaAnswers(){
        return aAnswers;
    }
    public String[] getbAnswers(){
        return bAnswers;
    }
    public String[] getcAnswers(){
        return cAnswers;
    }
    public String[] getdAnswers(){
        return dAnswers;
    }
    public String[] getCorrect(){
        return correct;
    }
}
