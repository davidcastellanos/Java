
public class YourOrderPplease {
    public static String order(String words) {
        String[] arrWords = words.split(" ");
        String orderedText, result = "";


        for (int i = 1; i < arrWords.length + 1; i++) {
            for (int j = 0; j < arrWords.length; j++) {
                orderedText = arrWords[j];
                if(orderedText.contains(Integer.toString(i))) {
                    result += orderedText + " ";
                }
            }

        }

        System.out.println(result.trim());
        return result.trim();
    }

    public static void main(String[] args) {
        order("4of Fo1r pe6ople g3ood th5e the2");
    }
}
