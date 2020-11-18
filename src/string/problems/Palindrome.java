package string.problems;

import java.util.Scanner;

public class Palindrome {
static String reverse = "";
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String st = scan.nextLine();
        palindrome(st);

    }
    public static void palindrome (String s) {
        for (int i = s.length()-1;i>=0;i--) {
            reverse += s.charAt(i);
                }
        boolean palindrome = true;
        for (int i = 0; i< s.length(); i++) {
                if (s.charAt(i) != reverse.charAt(i)) {
                    palindrome = false;

                }
        }

        if (palindrome) {
            System.out.println( "palindrome");

        } else {
            System.out.println(" not a palindrome");
        }
    }
}
