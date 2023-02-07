package java_foundations;

import java.util.Scanner;

public class EntradaDeDatosStrChar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;

        System.out.print("Digite un texto: ");
        frase = entrada.nextLine(); //si se pone sólo next() traerá sólo la primer palabra antes del primer espacio

        System.out.println("El texto es: " + frase);


        /*ENTRADA DE DATOS CARACTER*/
        char letra;

        System.out.print("Digite un nuevo texto: ");
        letra = entrada.next().charAt(5);//charAt especifica el índice de la letra que me interesa o 0 default

        System.out.println("La letra es: " + letra);

    }
}
