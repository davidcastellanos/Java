package herencia.ejemplo3;

public class Tarjeta {
    long numTarjeta;
    String franquicia;

    double interes;

    public Tarjeta(long numTarjeta, double interes, String franquicia) {
        this.numTarjeta = numTarjeta;
        this.interes = interes;
        this.franquicia = franquicia;
    }

    void usoTarjetaDebito() {
        System.out.printf("Usted va usar tarjeta débito con número: %d, franquicia: %s, interés de ahorro: %f\n", this.numTarjeta, this.franquicia, this.interes);
    }
    void usoTarjetaCredito() {
        System.out.printf("Usted va usar tarjeta crédito con número: %d, franquicia: %s, interés de crédito: %f\n", this.numTarjeta, this.franquicia, this.interes);
    }
}
