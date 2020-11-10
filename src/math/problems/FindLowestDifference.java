package math.problems;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FindLowestDifference {
static int min;

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        findmin2(array1, array2); //initiating method findmin2 with two parameters


        /*Example of arraycopy() method

        In the following example, we have created two integer arrays firstArray and secondArray. In order to merge
        two arrays, we find its length and stored in fal and sal variable respectively. After that, we create a new
        integer array result which stores the sum of length of both arrays. Now, copy each elements of both arrays to
        the result array by using arraycopy() function.
         */
//array1 = source array
 //array2 = destination array
        int firstarry = array1.length; // determines length of first array
        int secondarry = array2.length; // determines length of second array
        int[] join = new int[firstarry + secondarry]; //resultant array of size first array1 and array2
        System.arraycopy(array1, 0, join, 0, firstarry);
        //source array, starting point of source array, destination,starting point of destination array,
        // the number of array element to be copied
        System.arraycopy(array2, 0, join, firstarry, secondarry);
        System.out.println(Arrays.toString(join)); //prints the resultant array
        findmin(join); //initiating method with one parameter.

    }

    static void findmin2(int[] array, int[] ary) {
        int low = array[0];
        for (int i = 0; i < Array.getLength(array); i++) {
            if ((array[i] < ary[i]) && (array[i] < low)) {
                low = array[i];
            } else if (ary[i] < low)
                low = ary[i];
        }
        System.out.println(low);
    }

    public static int findmin(int[] array) {
        min = array[0];
        int len = array.length;

        for (int i = 0; i < len - 1; i = i + 2) {


            if (i + 1 > len) {
                if (i + 1 < min)
                    min = array[i];
            }
            if (array[i] > array[i + 1]) {
                if (array[i + 1] < min) min = array[i + 1];

            }
            if (array[i] < array[i + 1]) {

                if (array[i] < min) min = array[i];
                //System.out.println(min);
            }
        }


        System.out.println("minimum value of two arrays " + " " + min);


        return min;
    }

}








