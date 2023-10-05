package com.bridgelabz;

/*
1.Start
2.Declare variable num.
3.Read the value of num from the user.
4.Use switch case.
5.Check if the number is between 1 to 12.
6.Print the month name corresponding to the given month number.
7.If the month number is not valid go to step 8.
8.Print "Invalid month number.Please enter a number between 1 to 12".
9.End
 */

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("January");
                break;
                case 2:
                System.out.println("February");
                break;
                case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("April");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                break;
                case 7:
                System.out.println("July");
                break;
                case 8:
                System.out.println("August");
                break;
                case 9:
                System.out.println("September");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("November");
                break;
                case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
