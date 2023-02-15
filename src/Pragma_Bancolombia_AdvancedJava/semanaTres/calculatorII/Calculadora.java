package Pragma_Bancolombia_AdvancedJava.semanaTres.calculatorII;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();
        boolean flag = true;

        while (flag) {
            System.out.printf("Escriba qué operación desea hacer:\n\"+\" para Sumar\n\"-\" para Restar\n\"*\" para Multiplicar\n\"/\" para Dividir\nÓ escriba \"q\" para salir.\n");
            String operacion = scanner.next().toLowerCase();

            switch (operacion) {
                case "q" -> flag = false;
                case "+" -> suma.obtenerResultados();
                case "-" -> resta.obtenerResultados();
                case "*" -> multiplicacion.obtenerResultados();
                case "/" -> division.obtenerResultados();
                default -> System.out.println("Opción no válida, intente de nuevo");
            }

        }

        System.out.println("Gracias por usar la calculadora! =)");
    }
}
