package com.david.mundopc;

public class Mouse extends DispositivoEntrada{
    private final int idMouse;
    private static int contadorMouses;

    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);

    }
    {
        this.idMouse = ++Mouse.contadorMouses;
    }

    public int getIdMouse() {
        return this.idMouse;
    }



    @Override
    public String toString() {
        return String.format("ID Mouse: %d - Marca Mouse y Tipo de entrada: %s", this.idMouse, super.toString());
    }
}
