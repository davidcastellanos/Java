package Pragma_Bancolombia_AdvancedJava.semanaDos.coffeedore64;

public class Articulo {
    private String nombre;
    private double precio;
    private static int indice = 0;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int incremental) {
        Articulo.indice += incremental;
    }
}
