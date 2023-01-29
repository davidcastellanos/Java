package polimorfismo.claseAbstracta;

public abstract class Figura {
    String color;
    public Figura(String color) {
        this.color = color;
    }
    abstract double calcularArea();
}
