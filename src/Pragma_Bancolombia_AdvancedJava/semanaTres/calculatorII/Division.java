package Pragma_Bancolombia_AdvancedJava.semanaTres.calculatorII;

import java.util.Scanner;

public class Division implements Computar{

    @Override
    public double realizarOperacion(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por 0");
        }
    }

    @Override
    public void obtenerResultados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número (dividendo):");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número (divisor) - tenga en cuenta que no es posible dividir por cero:");
        double num2 = scanner.nextDouble();
        System.out.printf("El resultado de la división es %.2f\n\n", realizarOperacion(num1, num2));
    }
}
