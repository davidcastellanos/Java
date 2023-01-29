package interfaces;

public class Aguila extends Animal implements Volador{
    private String nombre;

    @Override
    void nacer() {

    }

    @Override
    void morir() {
        super.morir();
    }

    @Override
    public void despegar() {

    }

    @Override
    public void volar() {
        Volador.super.volar();
    }
}
