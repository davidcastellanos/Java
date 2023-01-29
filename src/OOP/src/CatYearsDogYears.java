import java.util.Arrays;

public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        // Your code here!
        int catYears, dogYears, limit;

        if(humanYears == 1) {
            catYears = 15;
            dogYears = 15;

        } else if (humanYears == 2) {
            catYears = 15 + 9;
            dogYears = 15 + 9;

        } else {
            catYears = 15 + 9;
            dogYears = 15 + 9;
            limit =  humanYears - 2;

            while (limit > 0) {
                catYears += 4;
                dogYears += 5;
                limit--;
            }

        }

        return new int[]{humanYears, catYears, dogYears};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(5)));
    }
}
