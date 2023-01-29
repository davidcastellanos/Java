import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
        String tempString = "";

        try {
            tempString = Integer.toString(num);
            String[] arrNums = tempString.split("");
            Arrays.sort(arrNums, Collections.reverseOrder());
            tempString = "";

            for (String n : arrNums) {
                tempString += n;
            }

        } catch (Exception e) {
            System.out.println("Ilegal convertion " + e);
        }




        return Integer.parseInt(tempString.trim());

    }

    public static void main(String[] args) {
        sortDesc(123456789);
        System.out.println(" DESCENDENTE= " + sortDesc(123456789));
    }
}
