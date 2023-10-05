package com.bridgelabz;

/*
1.Start
2.Declare variable m,d,isSpring.
3.Read the value of m and d from the user.
4.If (m is equal to 3 and d is 21 to 31 and
     m is equal to 4 and d is 1 to 30 and
     m is equal to 5 and d is 1 to 31 and
     m is equal to 6 and d is 1 to 20 )
8.Print isSpring.
9.End
 */

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int d=scanner.nextInt();
        isSpringSeason(m,d);
    }

    public static void isSpringSeason(int m, int d) {
        boolean isSpring = (m == 3 && d == 21 || d == 31 &&
                m == 4 && d == 1 || d == 30 &&
                m == 5 && d == 1 || d == 31 &&
                m == 6 && d == 1 || d == 21);
        System.out.println(isSpring);
    }
}
