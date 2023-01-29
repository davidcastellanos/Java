import java.util.ArrayList;

public class Isograms {

    public static boolean  isIsogram(String str) {
        boolean result = true;

        ArrayList<Character> arrayChars = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            arrayChars.add(Character.toLowerCase(str.charAt(i)));
        }

        System.out.println(arrayChars);

        Character deletedChar;



        for (int j = 0; j < arrayChars.size(); j++) {
            deletedChar = arrayChars.remove(j);

            if (!arrayChars.isEmpty()) {
                if (arrayChars.contains(deletedChar)) {
                    result = false;
                    break;
                }

            }

        }

        System.out.println("RESULTADO " + result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("Dermatoglyphics"));
    }
}
