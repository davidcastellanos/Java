package Pragma_Bancolombia_AdvancedJava.semanaUno.puzzles;

import java.util.Arrays;

public class PuzzleJavaTest {
    public static void main(String[] args) {

        PuzzleJava puzzleJava = new PuzzleJava();

        //PUNTO 1
        System.out.println(Arrays.toString(puzzleJava.getTenRolls()));

        //PUNTO 2
        System.out.println("puzzleJava.getRandomLetter() = " + puzzleJava.getRandomLetter());

        //PUNTO 3
        System.out.println("puzzleJava.generatePassword() = " + puzzleJava.generatePassword());

        //PUNTO 4
        int arrLength = 8;
        System.out.println("puzzleJava.getNewPasswordSet(8) = " + puzzleJava.getNewPasswordSet(arrLength));
        //PUNTO 5

        System.out.println("puzzleJava.shuffleArray(arrLength) = " + puzzleJava.shuffleArray(arrLength));

    }
}
