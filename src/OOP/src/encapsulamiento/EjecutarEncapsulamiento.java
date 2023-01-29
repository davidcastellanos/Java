package encapsulamiento;

public class EjecutarEncapsulamiento {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("David");
        persona.setEdad(25);
        persona.setSexo('M');

        persona.imprimir();
    }
}
