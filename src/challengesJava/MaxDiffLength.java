package challengesJava;

/*
* You are given two arrays a1 and a2 of strings.
* Each string is composed with letters from a to z.
* Let x be any string in the first array and y be any string in the second array.
* Find max(abs(length(x) − length(y)))
* If a1 and/or a2 are empty return -1 in each language
* except in Haskell (F#) where you will return Nothing (None).
*
* a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
* a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(a1, a2) --> 13
* */

import java.util.Arrays;

public class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        int maxAbsolute = Integer.MIN_VALUE;

        if (a1.length == 0 || a2.length == 0) {
            maxAbsolute = -1;
        } else if (a1.length < a2.length) {

            for (int i = 0; i < a1.length; i++) {
                maxAbsolute = Math.max(maxAbsolute, Math.abs(a1[i].length() - a2[i].length()));
            }

        } else {
            for (int i = 0; i < a2.length; i++) {
                maxAbsolute = Math.max(maxAbsolute, Math.abs(a1[i].length() - a2[i].length()));
            }
        }
        return maxAbsolute;
    }

    public static void main(String[] args) {
        String[] a1 = {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        String[] a3 = new String[0];
        String[] a4 = new String[0];

        System.out.println("mxdiflg(a1, a2) = " + mxdiflg(a1, a2));

    }
}
