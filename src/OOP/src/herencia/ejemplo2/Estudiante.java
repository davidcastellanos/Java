package herencia.ejemplo2;

public class Estudiante extends Persona {
    int numId;
    public Estudiante(String nombre, int numId){
        super("Pepe");
        this.nombre = nombre;
        this.numId = numId;
    }

    void aprobar() {
        System.out.printf("Mi nombre es %s y aprobé el éxamen =), mi num de cuenta es %d\n", nombre, numId);
    }
    void reprobar() {
        System.out.printf("Mi nombre es %s y reprobé mi exámen, mi num de cuenta es %d =(\n", this.nombre, numId);
    }
}
