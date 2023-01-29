package herencia.ejemplo3;

public class TarjetaCredito extends Tarjeta {
    int codigoSeguridad;
    double cupo;
    String categoria;

    public TarjetaCredito(long numTarjeta, double interes, String franquicia, int codigoSeguridad, double cupo, String categoria ) {
        super(numTarjeta, interes, franquicia);
        this.codigoSeguridad = codigoSeguridad;
        this.cupo = cupo;
        this.categoria = categoria;
    }

    @Override
    void usoTarjetaCredito() {
        System.out.printf("Usted va usar tarjeta crédito con número: %d, franquicia: %s, interés de crédito: %f, CATEGORÍA: %s, CUPO: %f, CV: %d\n",
                this.numTarjeta, this.franquicia, this.interes, this.categoria, this.cupo, this.codigoSeguridad);


    }
}
