package com.bridgelabz;

import java.util.Scanner;

/*
1.Start
2.Declare variable number
3.Read a number (1, 10, 100, or 1000) from the user.
4.if number = 1 print one.
5.if number =10 print ten.
7.if number=100 print hundred.
8.if number=1000 print thousand.
9.End

*/

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scanner.nextInt();
        if (num==1){
            System.out.println("Unit");
        } else if (num==10) {
            System.out.println("Ten");
        } else if (num==100) {
            System.out.println("Hundred");
        } else if (num==1000) {
            System.out.println("Thousand");
        }else {
            System.out.println("Invalid Option");
        }
    }
}
