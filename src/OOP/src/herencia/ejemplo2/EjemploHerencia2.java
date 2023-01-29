package herencia.ejemplo2;

public class EjemploHerencia2 {
    public static void main(String[] args) {
        //Crear estudiante
        Estudiante estudiante = new Estudiante("Davidcito", 369);
        //estudiante.nombre = "David";
        //estudiante.numId = 963369;
        estudiante.aprobar();
        estudiante.reprobar();
        estudiante.comer();

        System.out.println("***********************");

        //Crear Empleado
        Empleado empleado = new Empleado("Juanito Alimaña", 50.000f);
        //empleado.nombre = "Junito Alimaña";
        //empleado.sueldo = 50.000f;
        empleado.trabajar();
        empleado.cobrar();
        empleado.dormir();
    }
}
