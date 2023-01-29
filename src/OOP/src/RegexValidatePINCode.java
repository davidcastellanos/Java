import java.util.regex.Pattern;
/*ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
* NO LETTERS OR CHARACTERS*/

public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        // Your code here...
        return (pin != null && (pin.length() == 4 || pin.length() == 6)) && Pattern.matches("[0-9]+", pin);
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("a234"));
    }
}
