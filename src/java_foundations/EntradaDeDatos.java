package java_foundations;//ENTRADA DE DATOS EN JAVA

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        Scanner miEntrada = new Scanner(System.in);
        int miNumero;

        System.out.print("Introduzca un número: ");
        miNumero = miEntrada.nextInt();

        String msj = String.format("Tu número seleccionado es %s.", miNumero);
        System.out.println(msj);

    }
}
