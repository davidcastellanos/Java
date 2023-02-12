package Pragma_Bancolombia_AdvancedJava.semanaDos.caranddriver;

public class Automovil {
    private int gasolina = 10;
    private final int capacity = 10;

    public Automovil() {
        this.gasolina = capacity;
    }


    public void agregarGasolina(int gasolina) {
        if (gasolina >= 0) {
            this.gasolina += (this.gasolina + gasolina) <= capacity ? gasolina : 0;
        } else {
            this.gasolina = 0;
        }

    }

    public void reducirGasolina(int gasolina) {
        if (this.gasolina - gasolina <= 0) {
            this.gasolina = 0;
            System.out.println("Juego Terminado!");
        } else {
            this.gasolina -= gasolina;
        }

    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGasolina() {
        return this.gasolina;
    }

}
