package Pragma_Bancolombia_AdvancedJava.semanaDos.zooKeeper;

public class Gorila extends Mamifero {
    void lanzarAlgo() {
        System.out.println("El gorila lanzó algo su energía disminuye en 5pts");
        bajarEnergia(5);
    }
    void comerBananas() {
        System.out.println("El gorila comió bananas su energía y satisfacción aumenta en 10pts");
        subirEnergia(10);
    }

    void trepar() {
        System.out.println("El gorila trepó un árbol, su energía disminuye en 10pts");
        bajarEnergia(10);

    }
}
