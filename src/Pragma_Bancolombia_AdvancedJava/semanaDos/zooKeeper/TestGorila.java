package Pragma_Bancolombia_AdvancedJava.semanaDos.zooKeeper;

public class TestGorila {
    public static void main(String[] args) {
        Gorila gorila = new Gorila();
        System.out.println("-----GORILA LANZANDO-----");
        gorila.lanzarAlgo();
        gorila.lanzarAlgo();
        gorila.lanzarAlgo();
        System.out.println("-----GORILA COMIENDO-----");
        gorila.comerBananas();
        gorila.comerBananas();
        System.out.println("-----GORILA TREPANDO-----");
        gorila.trepar();
    }

}
