package challengesJava;

import java.util.Arrays;

/*Scenario
Several people are standing in a row divided into two teams.
The first person goes into team 1, the second goes into team 2,
the third goes into team 1, and so on.

Task
Given an array of positive integers (the weights of the people),
return a new array/tuple of two integers, where the first one is the total weight of team 1,
and the second one is the total weight of team 2.
*/
public class RowWeights {
    public static int[] rowWeights (final int[] weights) {
        int team1Weight = 0;
        int team2Weight = 0;

        if (weights.length == 1) {
            return new int[]{weights[0], 0};
        } else {

            for (int i = 0; i < weights.length; i++) {
                if (i % 2 == 0) {
                    team1Weight += weights[i];
                } else {
                    team2Weight += weights[i];
                }

            }

        }

        return new int[]{team1Weight, team2Weight};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowWeights(new int[]{50,60,70,80})));
        System.out.println(Arrays.toString(rowWeights(new int[]{100,50})));
        System.out.println(Arrays.toString(rowWeights(new int[]{80})));
    }

}
