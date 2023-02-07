package java_foundations;/*HOLA MUNDO Y DATOS PRIMITIVOS JAVA*/

public class HolaMundo_DataTypes {
    public static void main(String[] args) {
        // MI HOLA MUNDO
        System.out.println("Bienvenido a Java David!!!");


        //Números enteros Java
        byte mibyte = 12;
        byte misegundobyte = 2;
        int resultado = mibyte * misegundobyte;
        String message = String.format("el resultado de la operación es %s", resultado);
        System.out.println(message);

        short miNumeroShort = 15;
        int miNumeroInt = 369;
        long minumeroLong = 46456;

        //Números Decimales
        float miNumeroFloat = 3.45f;
        double miNUmeroDouble = 3.46;

        // Caracácteres
        char miChar = 'a';
        char miCHar2 = '4';

        // Booleanos
        boolean verdadero = true;
        boolean falso = false;
        System.out.println(verdadero);
    }
}

