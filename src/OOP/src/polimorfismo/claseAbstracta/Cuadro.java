package polimorfismo.claseAbstracta;

public class Cuadro extends Figura {

    private  double lado;

    public Cuadro(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    // DEBO USAR OBLIGATORIAMENTE EL MÉTODO DE LA CLASE ABSTRACTA, ÉSTE TAMBIÉN ES ABSTRACTO AUQNUE NO NECESARIAMENTE
    @Override
    double calcularArea() {
        return lado * lado;
    }
}
