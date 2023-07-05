package OOP.modificadoresAcceso.paquete2;

import OOP.modificadoresAcceso.paquete1.ClaseDosMiembrosProtected;

public class ClaseTres extends ClaseDosMiembrosProtected {
    ClaseTres() {
        System.out.println("Constructor Clase Tres");
    }

    public static void main(String[] args) {
        ClaseDosMiembrosProtected claseDosProtected = new ClaseDosMiembrosProtected("");
        System.out.println("claseDosProtected = " + claseDosProtected);
        
    }
    
    
}
