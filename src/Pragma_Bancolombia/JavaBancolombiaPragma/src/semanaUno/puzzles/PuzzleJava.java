package semanaUno.puzzles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
    Random random = new Random();

    int[] getTenRolls() {
        int limit = 20;
        int[] arrayRandoms = new int[limit];

        for (int i = 0; i < limit; i++) {
            int randomNumber = random.nextInt(1, limit);
            arrayRandoms[i] = randomNumber;
        }

        return arrayRandoms;
    }

    Character getRandomLetter() {
        Character[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int randomNumber = random.nextInt(26);
        return alphabet[randomNumber];
    }

    String generatePassword() {
        StringBuilder password = new StringBuilder();
        int passwordLength = 8;
        int i = 0;

        while (i < passwordLength) {
            password.append(getRandomLetter());
            i++;
        }
        return password.toString();
    }

    ArrayList<String> getNewPasswordSet(int arrayLength) {
        ArrayList<String> setPasswords = new ArrayList<>(arrayLength);

        for (int i = 0; i < arrayLength; i++) {
            setPasswords.add(i, generatePassword());
        }

        return setPasswords;
    }

    ArrayList<String> shuffleArray(int arrayLength) {
        ArrayList<String> mixedArray = getNewPasswordSet(arrayLength);
        //System.out.println(mixedArray);
        int randomNum = random.nextInt(mixedArray.size() - 1);

        for (int i = 0; i < mixedArray.size(); i++) {
            String temp = mixedArray.remove(i);
            mixedArray.add(randomNum,temp);
        }
        return mixedArray;
    }


}
