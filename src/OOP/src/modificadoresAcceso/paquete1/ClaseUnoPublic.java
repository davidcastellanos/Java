package modificadoresAcceso.paquete1;

public class ClaseUnoPublic {

    public String atributoPublico = "atributo público";

    // Si la clase es pública, también es conveniente que el constructor usado para instanciarla sea público,
    // Si hay más de un construtor, estos no tienen que ser públicos también, solo el usado para instanciar.
   public ClaseUnoPublic() {
        System.out.println("Constructor Clase Uno");
    }

    public void metodoPublico () {
        System.out.println("Método público");
    }

    public static void main(String[] args) {

        // se puede acceder a una clase protected desde el mismo paquete
        // desde una herencia o ella misma.

       ClaseDosMiembrosProtected claseDosProtected = new ClaseDosMiembrosProtected();
        System.out.println("claseDosProtected.atributoProtected = " + claseDosProtected.atributoProtected);
        claseDosProtected.metodoProtected();
    }
}
