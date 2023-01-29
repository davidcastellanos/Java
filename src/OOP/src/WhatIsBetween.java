import java.util.Arrays;

public class WhatIsBetween {
    public static int[] between(int a, int b) {
        // your code here
        int[] arrayNums = new int[(b - a) + 1];
        int arrLength = arrayNums.length;
        int acum = a;

        arrayNums[0] = a;
        arrayNums[arrLength - 1] = b;

        for (int i = 1; i < arrLength - 1; i++) {
            acum = acum + 1;
            arrayNums[i] = acum;
        }
        return arrayNums;
    }

    public static void main(String[] args) {
        System.out.println("Arrays.toString(between(1, 4)) = " + Arrays.toString(between(1, 4)));
    }
}
