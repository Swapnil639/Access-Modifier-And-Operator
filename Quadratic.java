package com.bridgelabz;

/*
1. Start
2. Read the values of 'a', 'b', and 'c' from the user
3. Calculate the discriminant
   delta = b*b - 4*a*c
4. Check if delta is positive
5. If delta is positive, go to step 6
6.   Calculate root1 = (-b + sqrt(delta)) / (2*a)
7.   Calculate root2 = (-b - sqrt(delta)) / (2*a)
8.   Print "Root 1: " + root1
9.   Print "Root 2: " + root2
10. If delta is zero, go to step 11
11.   Calculate root = -b / (2*a)
12.   Print "Root: " + root
13. If delta is negative, go to step 14
14.   Print "No real roots exist"
15. End
 */

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        findRoot(a, b, c);


    }

    public static void findRoot(int a, int b, int c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots exist");
        }
    }
}
