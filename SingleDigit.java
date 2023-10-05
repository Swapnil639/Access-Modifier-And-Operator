package com.bridgelabz;


/*
1. Start the program.
2.Prompt the user to enter a single-digit number.
3.Read the input from the user and store it in an integer variable called number.
4.Declare a string variable called word.
5.Use if-else statements to check the value of number:
6.If number is equal to 0, assign the string "Zero" to word.
7.Else if number is equal to 1, assign the string "One" to word.
8.Else if number is equal to 2, assign the string "Two" to word.
9.Continue this pattern for the numbers 3 to 9.
10.If number does not match any of the above conditions, assign the string "Invalid number" to word.
11.Print the word representation of the number stored in word.
12.End
 */

import java.util.Scanner;

/*
1. Start
2.Declare variable num.
2. Read a single-digit number from the user
3. Create a switch case to map the digit to its corresponding word representation
4. Initialize a variable to store the word representation of the digit
5. Match the digit using the switch case
     - For each case, assign the corresponding word representation to the variable
6. Print the word representation of the digit
7. End
 */

public class SingleDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if (num==0){
            System.out.println("Zero");
        } else if (num==1) {
            System.out.println("One");
        } else if (num==2) {
            System.out.println("Two");
        }else if (num==3) {
            System.out.println("Three");
        }else if (num==4) {
            System.out.println("Four");
        }else if (num==5) {
            System.out.println("Five");
        }else if (num==6) {
            System.out.println("Six");
        }else if (num==7) {
            System.out.println("Seven");
        }else if (num==8) {
            System.out.println("Eight");
        }else if (num==9) {
            System.out.println("Nine");
        }else {
            System.out.println("Invalid Option");
        }
    }
}
