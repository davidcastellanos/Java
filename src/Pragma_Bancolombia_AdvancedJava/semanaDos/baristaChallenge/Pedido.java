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
        return this.isListo() ? "Tu pedido está listo" : "Gracias por esperar. Tu pedido estará listo pronto";
    }

    String display() {
        for (Articulo articulo : items) {

        }
        return String.format("Nombre Cliente: %s\n" +
                "", this.getNombre());
    }
}
