package clasesyobjetos;

public class Persona {
    String nombre;
    int edad;
    char sexo;

    public Persona(){}

    public Persona(String nombre, int edad, char sexo){
        if (nombre == null || nombre == "") {
            throw new NullPointerException( "Pailas" );
        } else {
            this.nombre = nombre;
            this.edad = edad;
            this.sexo = sexo;
        }

    }

    void respirar(){
        System.out.printf("La persona %s está respirando\n", this.nombre);
    }
    void nacer(){
        System.out.printf("La persona %s nació hace %d años\n", this.nombre, this.edad);
    }
    void morir(){
        System.out.printf("La persona %s de género %c, murió a los %d años\n", this.nombre, this.sexo, this.edad);
    }
}
