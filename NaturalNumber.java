package com.bridgelabz;

/*
1.Start
2.Declare variable num,sum.
3.Read the value of num from the user.
4.Initialize variable sum=0.
5.while num!=0
6.Add the value num to sum.
7.Decrement the value num.
8.Print the value of sum.
9.End

 */

import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0;
        while (num!=0){
            sum=sum+num;
            num--;
        }
        System.out.println(sum);
    }
}
