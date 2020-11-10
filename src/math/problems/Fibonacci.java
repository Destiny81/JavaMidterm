package math.problems;

import java.util.Scanner;

public class Fibonacci {

     /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

    static int result = 0; //initializing first number of fibonacci series 0
    static int j = 1; // initializing second number of Fibonacci series 1
    static  int c = 0;

    public static void main(String[] args) throws Exception {


            Fibonacci arry = new Fibonacci();
            System.out.println("Enter your numbers for the Fibonacci Sequence:");
            Scanner s = new Scanner(System.in);
             forloop();
            arry.whileloop (s);
        }

        public static void forloop () { // for loop iterate to displaying the sum of the previous two terms for the given number.
            Scanner scan = new Scanner(System.in);
            int fibo = scan.nextInt();
            for (int i = 1; i <= fibo; i++) {

                System.out.print(result + " ");

                c = result + j;
                result = j;
                j = c;
            }
        }
        public void whileloop(Scanner s) {

            int i = 1;
            int fibo = s.nextInt();
            while (i <= fibo) {

                System.out.print(result + " ");

                c = result + j;
                result = j;
                j = c;
                i++;

            }
        }





    }

