package herencia.ejemplo3;

public class TarjetaDebito extends Tarjeta {
    double saldo;
    String color;

    public TarjetaDebito(long numTarjeta, double interes, String franquicia, double saldo, String color) {
        super(numTarjeta, interes, franquicia);
        this.saldo = saldo;
        this.color = color;
    }

    @Override
    void usoTarjetaDebito() {
        System.out.printf("Usted va usar tarjeta débito con número: %d, franquicia: %s, interés de ahorro: %f, SALDO: %f, COLOR: %s\n",
                this.numTarjeta, this.franquicia, this.interes, this.saldo, this.color);
    }
}
