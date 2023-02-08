package Pragma_Bancolombia_AdvancedJava.semanaDos.cuentaBancaria;

public class CuentaTest {
    public static void main(String[] args) {
        CuentaBancaria cuentaAhorros = new CuentaAhorros();
        CuentaBancaria cuentaCorriente = new CuentaCorriente();
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente();
        CuentaAhorros cuentaAhorros2 = new CuentaAhorros();


        System.out.println("-----NUMERO CUENTA AHORROS----");
        System.out.println("cuentaAhorros.getNumeroCuenta() = " + cuentaAhorros.getNumeroCuenta());
        System.out.println("-----NUMERO CUENTA CORRIENTE----");
        System.out.println("cuentaCorriente.getNumeroCuenta() = " + cuentaCorriente.getNumeroCuenta());
        System.out.println();
        System.out.println();

        System.out.println("-----SALDO INICIAL CUENTA AHORROS----");
        System.out.println("cuentaAhorros.getSaldo() = " + cuentaAhorros.getSaldo());
        System.out.println("-----SALDO INICIAL CUENTA CORRIENTE----");
        System.out.println("cuentaCorriente.getSaldo() = " + cuentaCorriente.getSaldo());
        System.out.println();
        System.out.println();

        System.out.println("-----DEPOSITANDO DINERO EN CUENTA AHORROS----");
        cuentaAhorros.depositarDinero(5000);
        System.out.println("-----DEPOSITANDO DINERO EN CUENTA CORRIENTE----");
        cuentaCorriente.depositarDinero(3000);
        System.out.println();
        System.out.println();

        System.out.println("-----RETIRANDO DINERO EN CUENTA AHORROS----");
        cuentaAhorros.retirarDinero(3699);
        System.out.println("-----RETIRANDO DINERO EN CUENTA CORRIENTE----");
        cuentaCorriente.retirarDinero(693);
        System.out.println();
        System.out.println();


        System.out.println("-----ERROR EN DEPÓSITO DE CUENTA AHORROS----");
        cuentaAhorros.depositarDinero(-500);
        System.out.println("-----ERROR EN DEPÓSITO DE CUENTA CORRIENTE----");
        cuentaCorriente.depositarDinero(0);
        System.out.println();
        System.out.println();


        System.out.println("-----ERROR EN RETIRO DE CUENTA AHORROS----");
        cuentaAhorros.retirarDinero(3699);
        System.out.println("-----ERROR EN RETIRO DE CUENTA CORRIENTE----");
        cuentaCorriente.retirarDinero(100000);
        System.out.println();
        System.out.println();


        System.out.println("-----CANTIDAD DE CUENTAS BANCARIAS CREADAS----");
        System.out.println(CuentaBancaria.numCuentas);

    }
}
