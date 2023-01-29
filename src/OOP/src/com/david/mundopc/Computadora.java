package com.david.mundopc;

public class Computadora {
    private final int idComputadora;
    private Mouse mouse;
    private Teclado teclado;
    private Monitor monitor;
    private String nombre;
    private static int contadorComputadoras;

    //private Computadora(){}
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }
    {
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("{ID: %d,\nNombre: %s,\nID, Marca y Tamaño Monitor:\n%s,\nTeclado y Entrada Teclado:\n %s,\nMouse y Entrada Mouse:\n %s\n}",
                this.idComputadora, this.getNombre(), this.getMonitor().toString(),
                this.getTeclado().toString(),  this.getMouse().toString());
    }
}
