package clasesyobjetos;

public class Main {
    public static void main(String[] args) {
        System.out.println("****** Objeto 1 ********");
        Persona p1 = new Persona("#", 25, 'M');

        p1.respirar();
        p1.nacer();
        p1.morir();

        System.out.println("****** Objeto 2 ********");
        Persona p2 = new Persona();
        p2.nombre = "Pepita";
        p2.edad = 20;
        p2.sexo = 'F';

        p2.respirar();
        p2.nacer();
        p2.morir();

    }
}