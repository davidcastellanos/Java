package modificadoresAcceso.paquete2;

import modificadoresAcceso.paquete1.ClaseUnoPublic;

public class ClaseCuatro {
    ClaseCuatro() {
        System.out.println("Constructor Clase Cuatro");
    }

    public static void main(String[] args) {
        ClaseUnoPublic clase1 = new ClaseUnoPublic();
        System.out.println("clase1 pública = " + clase1);
        System.out.println("clase1.atributoPublico = " + clase1.atributoPublico);
        clase1.metodoPublico();

    }
}
