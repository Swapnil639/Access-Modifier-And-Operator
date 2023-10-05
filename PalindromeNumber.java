package com.bridgelabz;

/*
1.Start
2.Declare variable num,rem,rev and temp.
3.Read the value of num from the user.
4.Initialize variable rev=0,temp=num.
5.for i=temp to i!=0.
6.Decrement the value of i=i/10.
7.rem is equal to i modulus 10.
8.rev is equal to rev multiply 10 and add rem.
9.IF num is equal to rev goto 11.
10.IF num is not equal to rev goto 12.
11.Print num is Palindrome number.
12.Print num is not Palindrome number.
13.End

 */

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int temp=num;
        int rem,rev=0;
        for (int i = num; i >0 ; i=i/10) {
            rem=i%10;
            rev=rev*10+rem;
        }
        if (temp==rev){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not Palindrome number");
        }
    }
}
