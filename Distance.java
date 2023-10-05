package com.bridgelabz;

/*
1. Start
2. Read the values of 'x' and 'y' from the user.
3. Calculate the distance using the formula: distance = sqrt(x*x + y*y)
4. Print the calculated distance
5. End
 */

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        calculateDistance(x,y);
    }

    public static void calculateDistance(int x, int y) {
        double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println(distance);
    }
}
