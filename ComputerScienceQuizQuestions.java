/*
Author: Gautham Radheepan

 */
package com.example.simple_quiz;


public class ComputerScienceQuizQuestions {
    private int correctCounter;
    private String[] questions;
    private String[] aAnswers;
    private String[] bAnswers;
    private String[] cAnswers;
    private String[] dAnswers;
    private String[] correct;
    public ComputerScienceQuizQuestions(){

        questions = new String[20];
        aAnswers = new String [20];
        bAnswers = new String [20];
        cAnswers = new String [20];
        dAnswers = new String [20];
        correct = new String[20];

    }
    private void setQuestions(){
        questions[0]="Which one of these is used to hold letter values?";
        aAnswers[0]="Char";
        bAnswers[0]="Integer";
        cAnswers[0]="Float";
        dAnswers[0]="Boolean";
        correct[0]="A";
        questions[1]="Which one of these is a low-level programming language?";
        aAnswers[1]="Java";
        bAnswers[1]="Python";
        cAnswers[1]="C++";
        dAnswers[1]="Assembly";
        correct[1]="D";
        questions[2]="What does CPU stand for?";
        aAnswers[2]="Computer Processing Unit";
        bAnswers[2]="Central Processing Unit";
        cAnswers[2]="Central Programming Unit";
        dAnswers[2]="Central Progressive Unit";
        correct[2]="B";
        questions[3]="In Java, how do you print a statement?";
        aAnswers[3]="print();";
        bAnswers[3]="System.out.println();";
        cAnswers[3]="String.toText();";
        dAnswers[3]="ln.print();";
        correct[3]="B";
        questions[4]="The fields in the structure of the C language are by default";
        aAnswers[4]="Private";
        bAnswers[4]="Abstract";
        cAnswers[4]="Public";
        dAnswers[4]="Protected";
        correct[4]="C";
        questions[5]="At what point of time a variable comes into existence in memory is determined by its ";
        aAnswers[5]="Scope";
        bAnswers[5]="storage class";
        cAnswers[5]="data type";
        dAnswers[5]="all of the above";
        correct[5]="B";
        questions[6]="Which one of these symbols represents 'or' in Java?";
        aAnswers[6]="&&";
        bAnswers[6]="//";
        cAnswers[6]="\\";
        dAnswers[6]="||";
        correct[6]="D";
        questions[7]="Which one of these is included in the java.util package?";
        aAnswers[7]="Scanner";
        bAnswers[7]="Color";
        cAnswers[7]="Image";
        dAnswers[7]="Graphics";
        correct[7]="A";
        questions[8]="Which loop runs first, then checks the condition?";
        aAnswers[8]="while";
        bAnswers[8]="do while";
        cAnswers[8]="for";
        dAnswers[8]="none of the above";
        correct[8]="B";
        questions[9]="Who created the C language?";
        aAnswers[9]="James Gosling";
        bAnswers[9]="Guido van Rossum";
        cAnswers[9]="Dennis Ritchie";
        dAnswers[9]="Bjarne Stroustrup";
        correct[9]="C";
        questions[10]="1 Kilobyte is equal to how many bytes?";
        aAnswers[10]="1024";
        bAnswers[10]="1000";
        cAnswers[10]="1200";
        dAnswers[10]="1275";
        correct[10]="A";
        questions[11]="Which of the following languages was developed by Microsoft?";
        aAnswers[11]="Java";
        bAnswers[11]="DCL";
        cAnswers[11]="SHELL";
        dAnswers[11]="C#";
        correct[11]="D";
        questions[12]="What is a function in Python?";
        aAnswers[12]="A block of code that runs any time";
        bAnswers[12]="A block of code that only runs when called on";
        cAnswers[12]="A block of code that negates all the code outside of the function";
        dAnswers[12]="None of the above";
        correct[12]="B";
        questions[13]="Boolean holds what type of value?";
        aAnswers[13]="Integers";
        bAnswers[13]="Decimals";
        cAnswers[13]="Sentences";
        dAnswers[13]="True/False";
        correct[13]="D";
        questions[14]="What is a null value?";
        aAnswers[14]="An uninitialized value";
        bAnswers[14]="An error";
        cAnswers[14]="A string value";
        dAnswers[14]="the term null does not exist";
        correct[14]="A";
        questions[15]="ArrayIndexOutOfBounds exception means";
        aAnswers[15]="The array is not initialized";
        bAnswers[15]="The array is not used";
        cAnswers[15]="The array exceeds its storage size";
        dAnswers[15]="The array has no way to be indexed";
        correct[15]="C";
        questions[16]="What year was C created in?";
        aAnswers[16]="2011";
        bAnswers[16]="1994";
        cAnswers[16]="1992";
        dAnswers[16]="1972";
        correct[16]="D";
        questions[17]="Which one of these is not a primitive data type in java?";
        aAnswers[17]="Int";
        bAnswers[17]="Char";
        cAnswers[17]="String";
        dAnswers[17]="Float";
        correct[17]="C";
        questions[18]="What is a constructor?";
        aAnswers[18]="A program which helps you write code";
        bAnswers[18]="A special method that is used to initialize objects";
        cAnswers[18]="A special loop";
        dAnswers[18]="None of the above";
        correct[18]="B";
        questions[19]="Can a parent class inherit from a child class in Java?";
        aAnswers[19]="Sometimes, if the variables in the child are public";
        bAnswers[19]="Always";
        cAnswers[19]="inheritance is not allowed in Java";
        dAnswers[19]="Never";
        correct[19]="D";

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
