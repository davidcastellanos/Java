package challengesJava;

public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        //your code here !!
        int firstAcum = 1;
        int secondAcum = 1;

        for (int i = 0; i < firstCuboid.length; i++) {
            firstAcum *= firstCuboid[i];
            secondAcum *= secondCuboid[i];
        }

        return Math.abs(firstAcum - secondAcum);
    }

    public static void main(String[] args) {
        int result = findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4});
        int result2 = findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2});
        int result3 = findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8});
        int result4 = findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3});
        int result5 = findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25});
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
