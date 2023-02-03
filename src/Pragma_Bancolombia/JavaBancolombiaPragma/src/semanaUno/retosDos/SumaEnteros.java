package semanaUno.retosDos;

public class SumaEnteros {
    int result = 0;
    int sumatoria(int[] arr) {
        for ( int num : arr) {
            result += num;
        }

        return result;
    }
}
