package modificadoresAcceso.paquete1;

public class ClaseDosMiembrosProtected { // LA CLASE NO SOPORTA LA PALABRA RESERVADA PROTECTED

    protected String atributoProtected = "field protected";

    protected ClaseDosMiembrosProtected() {
        System.out.println("Constructor Clase Dos");
    }

    public ClaseDosMiembrosProtected(String a) {
        System.out.println(a);
    }

    protected void metodoProtected () {
        System.out.println("Método protected");
    }
}
