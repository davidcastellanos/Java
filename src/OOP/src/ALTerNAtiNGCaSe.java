public class ALTerNAtiNGCaSe {
        public static String toAlternativeString(String string) {
            // your code here!
            String result = "";

            for (int i = 0; i < string.length(); i++) {
                char character = string.charAt(i);

                result += Character.isDigit(character) ? character :
                        (Character.isLowerCase(character) ? Character.toUpperCase(character) :
                                Character.toLowerCase(character));
            }

            return result;
        }


    public static void main(String[] args) {
        System.out.println(toAlternativeString("D1c2b34A"));
        System.out.println(toAlternativeString("123456"));
    }
}
