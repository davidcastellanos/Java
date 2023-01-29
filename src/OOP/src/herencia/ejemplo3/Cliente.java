package herencia.ejemplo3;

public class Cliente {

    public static void main(String[] args) {
        TarjetaDebito tarjetaDebito = new TarjetaDebito(3213123, 1.5, "MASTERCARD",1.000000, "rojo oscurito");
        tarjetaDebito.usoTarjetaDebito();
        System.out.println("*******************");
        TarjetaCredito tarjetaCredito = new TarjetaCredito(9786876, 35, "VISA",123, 5000000, "Oro");
        tarjetaCredito.usoTarjetaCredito();

    }



}
