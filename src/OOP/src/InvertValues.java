import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {

        if (array.length != 0) {

            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    array[i] = Math.abs(array[i]);
                } else {
                    array[i] = array[i] * -1;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] arrTest1 = {1,2,3,4,5};
        int[] arrTest2 = {1,-2,3,-4,5};
        System.out.println("Arrays.toString(arrTest) = " + Arrays.toString( invert(arrTest1)));
        System.out.println("Arrays.toString(arrTest) = " + Arrays.toString( invert(arrTest2)));

    }
}
