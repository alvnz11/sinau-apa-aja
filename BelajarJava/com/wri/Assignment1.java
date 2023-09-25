package com.wri;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.println("Enter the first number : ");
        number1 = input.nextInt();
        System.out.println("Enter the second number : ");
        number2 = input.nextInt();
        input.close();

        if (number1 > number2) {
            System.out.println("The largest value is : " + number1);
        } else if (number1 < number2) {
            System.out.println("The largest value is : " + number2);
        }
    }
    
}
