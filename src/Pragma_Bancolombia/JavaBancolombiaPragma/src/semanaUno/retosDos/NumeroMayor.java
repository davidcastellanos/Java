package semanaUno.retosDos;

public class NumeroMayor {
    int numMayor(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            max = Math.max(num, max);
        }

        return max;
    }
}
