package Pragma_Bancolombia_AdvancedJava.semanaDos.coffeedore64;

public class TestPedidos {
    public static void main(String[] args) {

        // PEDIDOS - 2 INVITADOS
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();

        // PEDIDOS - 3 NOMBRES
        Pedido pedido3 = new Pedido("David");
        Pedido pedido4 = new Pedido("Yese");
        Pedido pedido5 = new Pedido("Pao");
        Pedido pedido6 = new Pedido("Juanito");

        //Agrega al menos 2 artículos a cada uno de los pedidos usando el método addArticulo
        Articulo articulo1 = new Articulo("Café expreso", 3.3);
        Articulo articulo2 = new Articulo("Café Moka", 3.6);
        Articulo articulo3 = new Articulo("Café Latte", 3.9);
        Articulo articulo4 = new Articulo("Café Capuccino", 6.9);
        Articulo articulo5 = new Articulo("Café Donkaccino", 9.6);

        pedido1.addArticulo(articulo1);
        pedido1.addArticulo(articulo5);
        pedido2.addArticulo(articulo2);
        pedido2.addArticulo(articulo5);
        pedido3.addArticulo(articulo3);
        pedido3.addArticulo(articulo4);
        pedido3.addArticulo(articulo5);
        pedido4.addArticulo(articulo4);
        pedido4.addArticulo(articulo5);
        pedido5.addArticulo(articulo1);
        pedido5.addArticulo(articulo5);

        System.out.println("pedido6.items = " + pedido6.items);

        // Prueba los resultados y el método display llamando al método display
        System.out.println("pedido1.display() = " + pedido1.display());
        System.out.println("pedido2.display() = " + pedido2.display());
        System.out.println("pedido3.display() = " + pedido3.display());
        System.out.println("pedido4.display() = " + pedido4.display());
        System.out.println("pedido5.display() = " + pedido5.display());
        System.out.println("pedido6.display() = " + pedido6.display());

        // Prueba la funcionalidad de getStatusMessage configurando algunos pedidos para que estén listos
        // e imprimiendo los mensajes para cada pedido.

        pedido3.setListo(true);
        pedido4.setListo(false);

        System.out.println("pedido3.isListo() = " + pedido3.isListo());
        System.out.println("pedido3.getStatusMessage() = " + pedido3.getStatusMessage());
        System.out.println("pedido4.isListo() = " + pedido4.isListo());
        System.out.println("pedido4.getStatusMessage() = " + pedido4.getStatusMessage());




    }
}
