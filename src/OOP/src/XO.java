public class XO {
    public static boolean getXO (String str) {
        int countX = 0, countO = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'x') {
                countX = countX + 1;
            } else if (str.toLowerCase().charAt(i) == 'o') {
                countO = countO + 1;
            }
        }

        return countX == countO;
    }

    public static void main(String[] args) {
        System.out.println(getXO("Xxxxertr34"));

    }
}
