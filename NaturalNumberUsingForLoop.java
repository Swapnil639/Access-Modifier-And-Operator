package com.bridgelabz;

/*
1.Start
2.Declare variable num,sum.
3.Read the value of num from the user.
4.Initialize variable sum=0.
5.For i=num to 0
6.Decrement the value of i by 1.
7.Add the value i to sum.
8.Print the value of sum.
9.End
 */

import java.util.Scanner;

public class NaturalNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0;
        for (int i = num; i >0; i--) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
