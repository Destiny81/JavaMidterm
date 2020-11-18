package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        Scanner scan = new Scanner(System.in); //Taking user input and storing into two new variables
        System.out.println("Enter a word of choice");
        String firstWord = scan.next();
        System.out.println("Enter another word of choice");
        String SecondWord = scan.next();
        System.out.println("The words are " + areAnagram(firstWord, SecondWord) + " anagrams.");
    }


    public static boolean areAnagram(String input1, String input2) {

        if (input1.length() != input2.length())
            return false;

        int count = 0;

        // Take sum of all characters of
        // first String
        for(int i = 0; i < input1.length(); i++)
        {
            count = count + input1.charAt(i);
        }

        // Subtract the Value of all the characters
        // of second String
        for(int i = 0; i < input2.length(); i++)
        {
            count = count - input2.charAt(i);
        }

        // If Count = 0 then they are anagram
        // If count > 0 or count < 0 then
        // they are not anagram
        return (count == 0);
    }

            }







