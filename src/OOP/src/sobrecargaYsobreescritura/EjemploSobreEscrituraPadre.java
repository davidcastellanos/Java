package sobrecargaYsobreescritura;

public class EjemploSobreEscrituraPadre {

/*En la clase padre, creamos un método que tendrá dentro de su escope un
comportamiento por defecto, (en éste caso, escribirá que se trata de una
SUMA y hará dicha SUMA)*/

    void operacion(int n1, int n2) {
        System.out.println("Resultado de la Operación SUMA: " + (n1 + n2));
    }
}
