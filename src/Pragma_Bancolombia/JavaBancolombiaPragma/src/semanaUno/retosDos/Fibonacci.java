package semanaUno.retosDos;

import java.util.ArrayList;

/*
Crea un método que reciba un número y que regrese un ArrayList con la serie fibonacci hasta esa posición
0 1 1 2 3 5 8 13 21 34 55 89
*/

public class Fibonacci {

    ArrayList<Integer> fibonacci(int num) {

        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        for (int i = 2; i < num; i++) {
            fibo.add(fibo.get(i - 1) + fibo.get(i - 2));
        }

        return fibo;
    }
}
