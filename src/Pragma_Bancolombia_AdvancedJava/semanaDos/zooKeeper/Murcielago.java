package Pragma_Bancolombia_AdvancedJava.semanaDos.zooKeeper;

public class Murcielago extends Mamifero {

    public Murcielago() {
        super(300);
    }
    void volar() {
        System.out.println("Murciélago vuela y suena: Siiiiiiuuuu!");
        bajarEnergia(50);
    }

    void comerHumano() {
        System.out.println("El murciélago come humano y suena: ñam ñam yummy");
        subirEnergia(25);
    }

    void atacarPueblo() {
        System.out.println("El pueblo está en llamas y suena: Aiuda!");
        bajarEnergia(100);
    }
}
