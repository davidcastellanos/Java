package Pragma_Bancolombia_AdvancedJava.semanaDos.retosUno.POO;

public class CuentaAhorro {
    public static void main(String[] args) {
        Cuenta cuentaAhorros = new Cuenta("John Doe", 234654687);
        String titularCuentaAHorros = cuentaAhorros.getTitular();
        long numeroCuentaAhorros = cuentaAhorros.getNumeroCuenta();

        System.out.printf("Titular cuenta ahorros: %s y No Cuenta: %d", titularCuentaAHorros, numeroCuentaAhorros);
        System.out.println();



    }

}
