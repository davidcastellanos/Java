package com.david.mundopc;

public class Monitor {
    private  final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    //private Monitor() {}

    public Monitor(String marca, double tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }
    {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return String.format("ID Monitor: %s, Marca Monitor: %s, Tamaño: %f", this.idMonitor, this.getMarca(), this.getTamanio());
    }
}
