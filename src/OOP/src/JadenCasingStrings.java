public class JadenCasingStrings {
    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment

        if (phrase == null || phrase.equals("")) {
            phrase = null;
        } else {

            String[] words = phrase.split(" ");
            phrase = "";
            for (String word: words) {
                phrase += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
        }

        return phrase != null ? phrase.trim() : null;

    }

    public static void main(String[] args) {
        String result = JadenCasingStrings.toJadenCase("most trees are blue");
        System.out.println(result);
    }
}
