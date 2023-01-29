package interfaces;

public interface Volador {
    void despegar();
    default void volar() {
        System.out.println("Volando!!!");
    }
}
