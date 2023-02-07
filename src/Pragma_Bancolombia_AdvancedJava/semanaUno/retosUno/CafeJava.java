package Pragma_Bancolombia_AdvancedJava.semanaUno.retosUno;

public class CafeJava {
    public static void main(String[] args) {
        // VARIABLES DE LA APP
        // Líneas de texto que aparecerán en la app
        String saludoGeneral = "Bienvenido al Café Java, ";
        String mensajePendiente = ", tu pedido estará listo en breve";
        String mensajeListo = ", tu pedido está listo";
        String mensajeMostrarTotal = "Tu total es $";

        // Variables de menú (agrega las tuyas a continuación)
        double precioMocha = 3.5;
        double precioCafeDeLitro= 2.2;
        double precioCafeConLeche = 3.6;
        double precioCapuchino = 6.9;

        // Variables de nombre de cliente (agrega las tuyas a continuación)
        String cliente1 = "Cindhuri";
        String cliente2 = "Sam";
        String cliente3 = "Jimmy";
        String cliente4 = "Noah";

        // Finalizaciones de pedidos (agrega las tuyas a continuación)
        boolean estaListoOrden1 = false;
        boolean estaListoOrden2 = true;
        boolean estaListoOrden3 = false;
        boolean estaListoOrden4 = true;

        // SIMULACIÓN DE INTERACCIÓN DE APP(Agrega tu código para los desafíos a continuación)
        // Ejemplo:
        System.out.println(saludoGeneral + cliente1); // Muestra "Bienvenido a Café Java, Cindhuri"
        // ** Las sentencias print sobre las interacciones con el cliente irán aquí ** //
        System.out.println(String.format("%s %s", cliente1, mensajePendiente));
        System.out.println(String.format("%s %s %s %.2f", cliente1, mensajeListo, mensajeMostrarTotal, precioCafeDeLitro));

        /*Cliente NOAH*/
        System.out.println(saludoGeneral + cliente4);
        if (estaListoOrden4) {
            System.out.println(String.format("%s %s %s %.2f", cliente4, mensajeListo, mensajeMostrarTotal, precioMocha));
        } else {
            System.out.println(String.format("%s %s", cliente4, mensajePendiente));
        }

        /*Cliente SAM*/
        System.out.println(saludoGeneral + cliente2);
        if (estaListoOrden2) {
            System.out.println(String.format("%s %s %s %.2f", cliente2, mensajeListo, mensajeMostrarTotal, (precioCafeConLeche * 2)));
        } else {
            System.out.println(String.format("%s %s", cliente2, mensajePendiente));
        }

        /*Cliente JIMMY*/
        System.out.println(String.format("%s %s %.2f", cliente3, mensajeMostrarTotal, (precioCafeConLeche - precioCafeDeLitro)));

    }
}

