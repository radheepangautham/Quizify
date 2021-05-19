/*
Author: Gautham Radheepan

 */
package com.example.simple_quiz;


public class GeneralKnowledgeQuestions {
    private int correctCounter;
    private String[] questions;
    private String[] aAnswers;
    private String[] bAnswers;
    private String[] cAnswers;
    private String[] dAnswers;
    private String[] correct;
    public GeneralKnowledgeQuestions(){

        questions = new String[20];
        aAnswers = new String [20];
        bAnswers = new String [20];
        cAnswers = new String [20];
        dAnswers = new String [20];
        correct = new String[20];

    }
    private void setQuestions(){
        questions[0]="How Many Rings are on the Olympic Flag?";
        aAnswers[0]="4";
        bAnswers[0]="5";
        cAnswers[0]="6";
        dAnswers[0]="7";
        correct[0]="B";
        questions[1]="Which animal does not appear in the Chinese zodiac?";
        aAnswers[1]="Bear";
        bAnswers[1]="Rabbit";
        cAnswers[1]="Dragon";
        dAnswers[1]="Dog";
        correct[1]="A";
        questions[2]="What are the main colours on the Canadian flag?";
        aAnswers[2]="Red and White";
        bAnswers[2]="Blue and White";
        cAnswers[2]="Red and White";
        dAnswers[2]="Red and Blue";
        correct[2]="A";
        questions[3]="Eritrea, which became the 182nd member of the UN in 1993, is in the continent of";
        aAnswers[3]="Asia";
        bAnswers[3]="Australia";
        cAnswers[3]="Africa";
        dAnswers[3]="Europe";
        correct[3]="C";
        questions[4]="What year did Neil Armstrong land on the moon?";
        aAnswers[4]="1966";
        bAnswers[4]="1967";
        cAnswers[4]="1968";
        dAnswers[4]="1969";
        correct[4]="D";
        questions[5]="A person born in 1992 would be how old in 2020?";
        aAnswers[5]="27";
        bAnswers[5]="28";
        cAnswers[5]="29";
        dAnswers[5]="30";
        correct[5]="B";
        questions[6]="'An eye for and eye, makes the whole world blind' was said by who?";
        aAnswers[6]="Mahatma Gandhi";
        bAnswers[6]="Nelson Mandela";
        cAnswers[6]="Pierre Elliot Trudeau";
        dAnswers[6]="Barack Obama";
        correct[6]="A";
        questions[7]="Which one of these are not a state?";
        aAnswers[7]="New York";
        bAnswers[7]="California";
        cAnswers[7]="Miami";
        dAnswers[7]="Florida";
        correct[7]="C";
        questions[8]="What ocean is between North America and Europe?";
        aAnswers[8]="Pacific";
        bAnswers[8]="Atlantic";
        cAnswers[8]="Indian";
        dAnswers[8]="Arctic";
        correct[8]="B";
        questions[9]="What animal is on the Canadian nickel?";
        aAnswers[9]="Moose";
        bAnswers[9]="Caribou";
        cAnswers[9]="Loon";
        dAnswers[9]="Beaver";
        correct[9]="D";
        questions[10]="How many blue stripes are there an the American flag?";
        aAnswers[10]="6";
        bAnswers[10]="7";
        cAnswers[10]="50";
        dAnswers[10]="0";
        correct[10]="D";
        questions[11]="Who is the only US president to resign?";
        aAnswers[11]="Herbert Hoover";
        bAnswers[11]="Richard Nixon";
        cAnswers[11]="George W. Bush";
        dAnswers[11]="John F. Kennedy";
        correct[11]="B";
        questions[12]="How many bones are in the human body?";
        aAnswers[12]="206";
        bAnswers[12]="205";
        cAnswers[12]="201";
        dAnswers[12]="209";
        correct[12]="A";
        questions[13]="How old do you have to be to enter the Hunger Games?";
        aAnswers[13]="10";
        bAnswers[13]="11";
        cAnswers[13]="12";
        dAnswers[13]="13";
        correct[13]="C";
        questions[14]="Which is the biggest planet in out solar system?";
        aAnswers[14]="Saturn";
        bAnswers[14]="Neptune";
        cAnswers[14]="Jupiter";
        dAnswers[14]="Earth";
        correct[14]="C";
        questions[15]="Which Boy Band sings the song 'I want it that way'?";
        aAnswers[15]="One Direction";
        bAnswers[15]="NSYNC";
        cAnswers[15]="New Kids On The Block";
        dAnswers[15]="Backstreet Boys";
        correct[15]="D";
        questions[16]="Which New York City building is the tallest?";
        aAnswers[16]="Empire State Building";
        bAnswers[16]="One World Trade Center";
        cAnswers[16]="Bank of America Tower";
        dAnswers[16]="Statue of Liberty";
        correct[16]="B";
        questions[17]="Who painted the Mona Lisa?";
        aAnswers[17]="Van Gogh";
        bAnswers[17]="da Vinci";
        cAnswers[17]="Picasso";
        dAnswers[17]="Monet";
        correct[17]="B";
        questions[18]="When the groundhog sees his shadow on Groundhogs day, it means:";
        aAnswers[18]="6 more weeks of winter";
        bAnswers[18]="Early spring";
        cAnswers[18]="It's going to rain";
        dAnswers[18]="A tornado is coming";
        correct[18]="A";
        questions[19]="How many days are in February during a leap year?";
        aAnswers[19]="28";
        bAnswers[19]="29";
        cAnswers[19]="30";
        dAnswers[19]="31";
        correct[19]="B";

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
