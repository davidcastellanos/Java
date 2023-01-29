package encapsulamiento.abstraccion;

public class Persona {
    void conducir(Auto auto) {
        auto.encender();
        auto.acelerar();
        auto.cambiarVelocidad();
        auto.frenar();
        System.out.println("Estoy conduciendo!!");
    }
}
