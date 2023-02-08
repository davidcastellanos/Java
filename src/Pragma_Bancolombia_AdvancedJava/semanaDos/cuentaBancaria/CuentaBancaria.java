package Pragma_Bancolombia_AdvancedJava.semanaDos.cuentaBancaria;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    static int numCuentas = 0;
    static double totalDineroOculto = 1;
    private final String numeroCuenta;

    public CuentaBancaria() {
        numCuentas++;
        this.numeroCuenta = generarNumCuentaBancariaRandom();

    }

    public double getSaldo() {
        return this.saldo;
    }

    void depositarDinero(double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
            System.out.println("Nuevo Saldo: " + getSaldo());
        } else {
            System.out.println("No es posible depositar un saldo igual o menor a 0");
        }
    }

    void retirarDinero(double retiro) {
        if (this.saldo > 0 && this.saldo - retiro >= 0) {
            this.saldo -= retiro;
            System.out.println("Nuevo Saldo: " + getSaldo());
        } else {
            System.out.println("No dispone de fondos suficientes para realizar ésta transacción");
        }
    }

    void totalEnCuenta() {
        System.out.printf("El gran total en su cuenta es %.2f", this.saldo + CuentaBancaria.totalDineroOculto);
    }


    private String generarNumCuentaBancariaRandom() {
        Random random = new Random();
        String resultado = "";
        for (int i = 0; i < 10; i++) {
            resultado += Integer.toString(random.nextInt(0, 10));
        }
        return resultado;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
}
