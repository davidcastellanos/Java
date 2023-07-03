package challengesJava;

public class QuarterOfTheYear {

    public static int quarterOf(int month) {
        // Your code here
        return month <= 3 ? 1 : month <= 6 ? 2 :
                month <= 9 ? 3 : 4;
    }

    public static void main(String[] args) {
        System.out.println("quarterOf(5) = " + quarterOf(5));
    }
}
