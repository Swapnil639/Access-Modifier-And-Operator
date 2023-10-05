package com.bridgelabz;

/*
1.Start
2.Declare variable a,b,c,op1,op2,op3,op4.
3.Read the value of a,b,c from the user.
4.op1 is equal to a+b*c go to step 8.
5.op2 is equal to c+a/b go to step 9.
6.op3 is equal to a%b+c go to step 10.
7.op4 is equal to a*b+c go to step 11.
8.print op1.
9.print op2.
10.print op3.
11.print op4.
12.End
 */

import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        arithmeticOperator(a,b,c);
    }

    private static void arithmeticOperator(int a,int b,int c) {
        int op1= a+b*c;
        int op2=c+a/b;
        int op3=a%b+c;
        int op4=a*b+c;
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);
    }
}
