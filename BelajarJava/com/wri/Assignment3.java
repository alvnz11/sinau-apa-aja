package com.wri;


import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int midExam, finalExam, quiz, assignment;
        double finalScore;

        System.out.println("Enter your midterm exam score : ");
        midExam = input.nextInt();
        System.out.println("Enter your final exam score : ");
        finalExam = input.nextInt();
        System.out.println("Enter your quiz score : ");
        quiz = input.nextInt();
        System.out.println("Enter your assignment score : ");
        assignment = input.nextInt();
        input.close();

        finalScore = (midExam*0.3 + finalExam*0.4 + quiz*0.1 + assignment*0.2);

        if (finalScore >= 65) {
            System.out.println("You pass the exam, your final score is " + finalScore);
        } else {
            System.out.println("You get a remedy, your final score is " + finalScore);
        }


    }
    
}
