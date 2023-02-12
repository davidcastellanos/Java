package Pragma_Bancolombia_AdvancedJava.semanaDos.zooKeeper;

public class Mamifero {
    private int nivelEnergia;

    public Mamifero() {
        this.nivelEnergia = 100;
    }

    public Mamifero(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public int mostrarEnergia() {
        return this.nivelEnergia;
    }

    public void bajarEnergia(int nivelEnergia) {
        this.nivelEnergia -= nivelEnergia;
        System.out.println("nivelEnergia = " + mostrarEnergia());
    }

    public void subirEnergia(int nivelEnergia) {
        this.nivelEnergia += nivelEnergia;
        System.out.println("nivelEnergia = " + mostrarEnergia());
    }
}
