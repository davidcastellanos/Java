package sobrecargaYsobreescritura;

public class EjecutarSobreEscritura {
    public static void main(String[] args) {
        EjemploSobreEscrituraPadre op1 = new EjemploSobreEscrituraPadre();
        op1.operacion(3, 9);

        EjemploSobreEscrituraHijo op2 = new EjemploSobreEscrituraHijo();
        op2.operacion(3, 9);
    }
}
