package herencia.ejemplo2;

public class Empleado extends Persona {
    float sueldo;

    public Empleado(String nombre, float sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    void trabajar() {
        System.out.printf("Soy %s y estoy trabajando!\n", nombre);
    }
    void cobrar() {
        System.out.printf("Soy %s y esto cobrando mi dinero, me dieron %f\n", nombre, sueldo);
    }
}
