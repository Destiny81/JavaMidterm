package math.problems;

public class FindMissingNumber {


    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n = array.length + 1; //Array length 9 +1 = 10
        missingnumber(array, n); //added parameter value of array, length of array(10)
    }

    static void missingnumber(int[] array, int n) {
        int sum = (n * (n + 1)) / 2;// using math formula to find missing number. (10*(10*1))/2 = sum value 55;
        //if you add all the array elements 10+2+1+4+5+3+7+8+6 = 46 - 55 (sum value) = 9 which we
        // are missing in our array.
        for (int i = 0; i < array.length; i++) {
            sum = sum - array[i];
        }
        System.out.println("missing number is " + sum);


    }
}
