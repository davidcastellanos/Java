package java_foundations;

public class DatosNoPrimitivos_Strings {
    public static void main(String[] args) {
        /*LOS DATOS NO PRIMITIVOS SOPORTAN NULL ADEMÁS QUE A ELLOS SI SE LES APLICA MÁTODOS*/
        Integer miNumero = 25;
        Integer miNull = null;
        miNumero.intValue();
        System.out.println(miNull);

        // Cadena de carácteres - String:

        String miString = "Hola soy una cadena de carácteres";
        System.out.println(miString);
        String nombre = "David";
        String apellido = "Castellanos";
        String pregunta = "¿Cómo estás?";
        String saludo = String.format("%s Mi nombre es %s y mi apellido es %s", pregunta, nombre, apellido);
        System.out.println(saludo);

        // CONSTANTE
        final Integer nuevoNumero = 25;
        System.out.println(nuevoNumero);
    }
}
