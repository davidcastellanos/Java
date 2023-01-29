package polimorfismo.ejemplo2;

public class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    double calcularArea() {
        return 1.0;
    }

    private double calcularPerimetro() {
        return 1.0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
