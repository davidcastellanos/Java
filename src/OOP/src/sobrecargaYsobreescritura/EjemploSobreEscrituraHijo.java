package sobrecargaYsobreescritura;

public class EjemploSobreEscrituraHijo extends EjemploSobreEscrituraPadre {

    /*En la clase HIJO, se ve que hay herencia desde la clase padre, aquí usaremos el mismo método
    EN ÉSTE CASO NO CAMBIA LA FIRMA, sigue siendo el mismo nombre y sus mismos parámetros originales
    pero dentro, si que hay un cambio, YA NO ESCRIBE QUE HARÁ UNA SUMA SINO UNA MULTIPLICACIÓN Y EL PROCESO QUE HACE
    ES EL DE UNA MULTIPLICACIÓN*/

    /*SE USÓ EL MISMO MÉTODO DE UNA MANERA DIFERENTE Y EL RESULTADO SUELE SER TAMBIÉN DIFERENTE*/
    @Override
    void operacion(int n1, int n2) {
        System.out.println("Resultado de la Operación MULTIPLICACIÓN: " + (n1 * n2));
    }
}
