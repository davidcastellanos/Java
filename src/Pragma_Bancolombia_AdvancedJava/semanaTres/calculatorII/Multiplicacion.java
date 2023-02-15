package Pragma_Bancolombia_AdvancedJava.semanaTres.calculatorII;

import java.util.Scanner;

public class Multiplicacion implements Computar {
    @Override
    public double realizarOperacion(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public void obtenerResultados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();
        System.out.printf("El resultado de la multiplicación es %.2f\n\n", realizarOperacion(num1, num2));
    }
}
