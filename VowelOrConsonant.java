package com.bridgelabz;

import java.util.Scanner;

/*
1.Start
2.Declare variable ch.
3.Read the value of ch from the user.
4.Use switch case
5.Check if the character is 'a','e','i','o'or 'u'.
6.If the character is equal goto this case.
7.Print "Character is vowel"
8.If the character is not equal goto default case.
9.Print "Character is consonant".
10.End
 */

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter One character:");
        char ch=scanner.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println(ch+" is Vowel");
                break;
            case 'e':
                System.out.println(ch+" is Vowel");
                break;
            case 'i':
                System.out.println(ch+" is Vowel");
                break;
            case 'o':
                System.out.println(ch+" is Vowel");
                break;
            case 'u':
                System.out.println(ch+" is Vowel");
                break;
            default:
                System.out.println(ch+" is Consonant");
                break;
        }
    }
}
