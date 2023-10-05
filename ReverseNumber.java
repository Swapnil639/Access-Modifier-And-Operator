package com.bridgelabz;

/*
1.Start
2.Declare variable num,rem,rev.
3.Initialize variable rev=0.
4.Read the value of num from the user.
5.while num!=0.
6.rem = num modulus 10.
7.rev =rev multiply 10 and add rem.
8.num = num divide by 10.
9.Print the value of rev.
10.End
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num,rem,rev=0;
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
