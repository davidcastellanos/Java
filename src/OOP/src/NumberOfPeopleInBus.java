import java.util.ArrayList;

public class NumberOfPeopleInBus {

    public static int countPassengers(ArrayList<int[]> stops) {
        int subidas = 0;
        int bajadas = 0;

        for (int i = 0; i < stops.size(); i++) {
            subidas += stops.get(i)[0];
            bajadas += stops.get(i)[1];
        }

        //Code here!

        return Math.max(subidas - bajadas, 0);
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,9});
        list.add(new int[] {2,5});
        System.out.println("RESULTADO FINAL: " + countPassengers(list));
    }
}
