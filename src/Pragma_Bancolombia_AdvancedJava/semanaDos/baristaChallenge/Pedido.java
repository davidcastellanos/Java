package Pragma_Bancolombia_AdvancedJava.semanaDos.baristaChallenge;

import java.util.ArrayList;

public class Pedido {
    private String nombre;
    private double total = 0;
    private boolean listo;
    ArrayList<Articulo> items = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(ArrayList<Articulo> items) {
        this.items = items;
    }

    public Pedido(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getOrderTotal() {
        if (items.size() > 0) {
            for (Articulo item : items) {
                this.total += item.getPrecio();
            }
        }
        return this.total;
    }

    public boolean isListo() {
        return listo;
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }

    public ArrayList<Articulo> getItems() {
        return items;
    }
    void addArticulo(Articulo articulo) {
        this.items.add(articulo);
    }

    String getStatusMessage() {
        if (isListo()) {
            return "Tu pedido está listo";

        } else {
            return "Gracias por esperar. Tu pedido estará listo pronto";
        }
    }

    String display(Articulo articulo) {
        return String.format("Nombre del Cliente: %s\n%s : %.2f",this.nombre, articulo.getNombre(), articulo.getPrecio());
    }


}
