package encapsulamiento;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    void imprimir() {
        System.out.printf("El nombre de la persona es %s\n", nombre);
        System.out.printf("La edad de la persona %s es %d\n", nombre, edad);
        System.out.printf("El género de la persona %s, es %c\n", nombre, sexo);
    }
}
