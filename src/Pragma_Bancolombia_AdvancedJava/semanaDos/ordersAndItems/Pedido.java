package Pragma_Bancolombia_AdvancedJava.semanaDos.ordersAndItems;

import java.util.ArrayList;

public class Pedido {
    private String nombre;
    private double total = 0;
    private boolean listo;
    ArrayList<Articulo> items = new ArrayList<>();;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotal() {
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

    public void setItems(ArrayList<Articulo> items) {
        this.items = items;
    }
}
