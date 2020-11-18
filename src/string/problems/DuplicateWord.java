package string.problems;

import java.util.HashMap;
import java.util.*;
public class DuplicateWord {

    static int count;
 static String [] words;
    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        //String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String st = scan.nextLine();
        findDuplicate(st);
        findaverage(st);

    }

    static void findDuplicate(String s) {
         words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                    words[j] = "0";
                }
            }

            if (count > 1 && words[i] != "0")
                System.out.println("Duplicate words " + words[i] + ">> and it repeated  " + count + " times");
        }
    }


        static void findaverage(String s) {
            int wordcount = 0;
            for(String i : words){
                wordcount += i.length();
            }
            int wordaverage = words.length;
            int avg = (wordcount/wordaverage);
            System.out.println ("total count of words" + wordcount + "length" + wordaverage);
            System.out.println("the average length of the words is: "+avg);
        }

        }



