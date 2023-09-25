package com.wri;

import java.util.Scanner;

public class jbs5tgs2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String foodName;
        int upDeliv = 30000, downDeliv = 20000, foodPrice, total;
        char a;

        System.out.print("Enter a food name : ");
        foodName = sc.nextLine();
        System.out.print("Enter the food price : IDR ");
        foodPrice = sc.nextInt();
        System.out.print("Do you want express delivery (0 = no, 1 = yes)? ");
        a = sc.next().charAt(0);
        sc.close();

        switch (a) {
            case '0':
                if (foodPrice < 100000) {
                    total = foodPrice + downDeliv;
                    System.out.println("RECEIPT");
                    System.out.println(foodName + "\t\t: IDR " + foodPrice);
                    System.out.println("Shipping costs\t: Rp. " + downDeliv);
                    System.out.println("TOTAL\t\t: Rp. " + total);
                } else if (foodPrice >= 100000) {
                    total = foodPrice + upDeliv;
                    System.out.println("RECEIPT");
                    System.out.println(foodName + "\t\t: IDR " + foodPrice);
                    System.out.println("Shipping costs\t: Rp. " + upDeliv);
                    System.out.println("TOTAL\t\t: Rp. " + total);
                }
                break;
            case '1':
                if (foodPrice < 100000) {
                    downDeliv += 25000;
                    total = foodPrice + downDeliv;
                    System.out.println("RECEIPT");
                    System.out.println(foodName + "\t\t: IDR " + foodPrice);
                    System.out.println("Shipping costs\t: Rp. " + downDeliv);
                    System.out.println("TOTAL\t\t: Rp. " + total);
                } else if (foodPrice >= 100000) {
                    upDeliv += 25000;
                    total = foodPrice + upDeliv;
                    System.out.println("RECEIPT");
                    System.out.println(foodName + "\t\t: IDR " + foodPrice);
                    System.out.println("Shipping costs\t: Rp. " + upDeliv);
                    System.out.println("TOTAL\t\t: Rp. " + total);
                }
                break;
            default:
                System.out.println("Invalid input");
        }

    }

}
