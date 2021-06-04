package claseEnVivo;

import java.util.Scanner;

public class ejerciciosFunciones {

    static boolean divisible( int valor1, int valor2 ) {
        if( valor1 % valor2 == 0 ) {
            return true;
        }
        return false;
    }

    static boolean primos( int num ) {
        for( int i = 2; i < num; i++ ) {
            if( divisible( num, i ) ) {
                return false;
            }
        }
        return true;
    }

    /*  static boolean numPrimo(int num){
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador!=num)){
            if (num % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    } */

    static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
        if( unNumeroA > unNumeroB && unNumeroA > unNumeroC ) {
            return unNumeroA;
        } else if( unNumeroB > unNumeroA && unNumeroB > unNumeroC ) {
            return unNumeroB;
        } else {
            return unNumeroC;
        }
    }

    public static void main(String[] args) {

        /* Ejercicio 1:
        Hacer una función que dado un número indica si es un número primo o no. Un número primo es aquel que solo   puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible por 1, 5 y 25. 17 sí    es primo porque solo se puede dividir por 1 y por 17. Usar esta función en un programa, que permita el ingreso de un número y luego llame a la función desarrollada para comprobar si es primo o no. Para resolverlo usar la función obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int divisor) */

        int numero;

        Scanner scanner = new Scanner( System.in );

        System.out.println( "Ingrese un numero" );
        numero = scanner.nextInt();

        System.out.println( primos( numero ) );

        /* Ejercicio 2:
        Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
    Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre el resultado. */

        int numeroUno, numeroDos, numeroTres;

        System.out.println( "Ingrese el primer numero" );
        numeroUno = scanner.nextInt();

        System.out.println( "Ingrese el segundo numero" );
        numeroDos = scanner.nextInt();

        System.out.println( "Ingrese el tercer numero" );
        numeroTres = scanner.nextInt();

        System.out.println( maximoEntreTresNumeros( numeroUno, numeroDos, numeroTres ) );
    }
}
