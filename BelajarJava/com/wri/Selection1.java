package com.wri;

import java.util.Scanner;

public class Selection1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number; 

        System.out.println("Enter a number : ");
        number =input.nextInt();
        input.close();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        
    }
}
