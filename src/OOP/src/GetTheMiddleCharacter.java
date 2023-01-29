public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        String middleChar;

        if (word.length() == 0) {
            middleChar = "";
            System.out.println("middleChar length 0 = " + middleChar);

        } else if (word.length() == 1 || word.length() == 2) {
            middleChar = word;
            System.out.println("middleChar length 1 or 2 = " + middleChar);

        } else {
            if (word.length() % 2 != 0) {
                middleChar = "" + word.charAt(word.length()/2);

            } else {
                middleChar = "" + word.charAt((word.length()/2) - 1) + word.charAt((word.length()/2));
            }


        }

        return middleChar;
    }

    public static void main(String[] args) {
        getMiddle("middle");

    }
}
