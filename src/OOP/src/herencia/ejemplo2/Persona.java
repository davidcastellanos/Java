package herencia.ejemplo2;

public class Persona {
    String nombre;
    String fechaDeNacimiento;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    void dormir() {
        System.out.printf("Hola, soy %s y estoy DURMIENDO\n", this.nombre);
    }
    void respirar() {
        System.out.printf("Hola, soy %s y estoy RESPIRANDO\n", nombre);
    }
    void comer() {
        System.out.printf("Hola, soy %s y estoy COMIENDO\n",nombre);
    }
}
