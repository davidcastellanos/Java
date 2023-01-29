import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frecuency {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(2);

        int countA= Collections.frequency(list, 1);
        int countB=Collections.frequency(list, 2);
        int countC=Collections.frequency(list, 3);

        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
        System.out.println("countC = " + countC);
    }
}