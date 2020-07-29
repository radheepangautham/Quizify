# Quizify
Simple Quiz for assignment 5
How to run the app
1.This code runs in java so you need to download that programming language
2.You need to also download android studio
3.Open up the project in android studio install an AVD (preferably a newer model)
4.Build and run the project

Code architecture
There is a main class which seperates into 3 other quiz classes(Sports, General Knowledge, Computer Science)
Those classes get there questions from their respective class(SportsQuestions, GeneralKnowledgeQuestions, ComputerScienceQuestions)
The quizzes import the questions into an array and based on a random number generated, displays the question to the user
The questions get put into another array to insure that the question is not repeated
If the answer is right it hides the buttons except for on and displays that you got the question right
If the answer is wrong it hides the buttons except for on and displays that you got the question wrong along with the correct answer
It then displays the next question and repeats this process 10 times
At the end it displays the number of questions you got right and return to the main menu

