package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String st = "ABC";
        int i = st.length();
        Permutation pt = new Permutation();
        pt.permutation(st, 0, i - 1);
    }

    private void permutation(String s, int l, int r)
    {
        if (l == r)
            System.out.println(s);
        else {
            for (int i = l; i <= r; i++) {
                s = swap(s, l, i);
                permutation(s, l + 1, r);
                s = swap(s, l, i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
