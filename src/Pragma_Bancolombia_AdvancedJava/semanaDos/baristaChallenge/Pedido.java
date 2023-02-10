package Pragma_Bancolombia_AdvancedJava.semanaDos.baristaChallenge;

import java.util.ArrayList;

public class Pedido {
    private String nombre;
    private boolean listo;
    ArrayList<Articulo> items;

    public Pedido() {
        this.nombre = "Invitado";
        this.items = new ArrayList<>();
    }

    public Pedido(String nombre) {
        this.nombre = nombre;
        this.items = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isListo() {
        return listo;
    }

    public void setListo(boolean listo) {
        this.listo = listo;
    }

    void addArticulo(Articulo articulo) {
        items.add(articulo);
    }

    String getStatusMessage() {
        return this.isListo() ? "Tu pedido está listo\n" : "Gracias por esperar. Tu pedido estará listo pronto\n";
    }

    String display() {
        StringBuilder displayResult = new StringBuilder(String.format("\nNombre Cliente: %s\n", this.getNombre()));

        if (items.size() > 0 || items != null) {
            for (Articulo articulo : items) {
                displayResult.append(String.format("%s: $%.2f\n", articulo.getNombre(), articulo.getPrecio()));
            }
            displayResult.append(String.format("Total: $%.2f\n", getOrderTotal()));

        } else {
            displayResult.append("No hay datos para mostrar, realice primero su pedido\n");
            displayResult.append(String.format("Total: $%.2f\n", getOrderTotal()));
        }

        return String.valueOf(displayResult);
    }

    double getOrderTotal() {
        double totalOrder = 0;
        if (items.size() > 0 || items != null) {
            for (Articulo articulo : items) {
                totalOrder += articulo.getPrecio();
            }
        }

        return totalOrder;
    }
}
