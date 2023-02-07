package challengesJava;

import java.util.Arrays;

public class TakeFirstNElements {
    public static int[] take(int[] arr, int n) {
        int[] finalArray = new int[n];
        for (int i = 0; i < n; i++) {
            finalArray[i] = arr[i];
        }
        return finalArray;
    }

    public static void main(String[] args) {
        System.out.println("Arrays.toString(int[3, 6, 9, 4, 2, 16], 3) = " + Arrays.toString(take(new int[]{3, 6, 9, 4, 2, 16}, 3)));
    }
}
