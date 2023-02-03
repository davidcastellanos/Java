package semanaUno.retosDos;

/*
Crea un método que reciba un número entero y regrese el factorial de este.
4 ! = 1*2*3*4
*/

public class Factorial {
    int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num ; i++) {
            result *= i;
        }

        return result;
    }
}
