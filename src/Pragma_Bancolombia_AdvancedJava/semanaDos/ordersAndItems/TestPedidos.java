package Pragma_Bancolombia_AdvancedJava.semanaDos.ordersAndItems;
import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args) {

        // Elementos del menú
        Articulo articulo1 = new Articulo();
        Articulo articulo2 = new Articulo();
        Articulo articulo3 = new Articulo();
        Articulo articulo4 = new Articulo();
        //Nombres Artículos
        articulo1.setNombre("moka");
        articulo2.setNombre("latte");
        articulo3.setNombre("café de goteo");
        articulo4.setNombre("capuchino");
        //Precios Artículos
        articulo1.setPrecio(3.3);
        articulo2.setPrecio(3.6);
        articulo3.setPrecio(6.9);
        articulo4.setPrecio(9.6);


        //Ordenar variables -- orden1, orden2, etc.
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();
        Pedido pedido4 = new Pedido();

        //Nombres de pedidos
        pedido1.setNombre("Cindhuri");
        pedido2.setNombre("Jimmy");
        pedido3.setNombre("Noah");
        pedido4.setNombre("Sam");
        // Simulaciones de aplicaciones
        // Utiliza este código de ejemplo para probar las actualizaciones de varios pedidos
        System.out.printf("Nombre: %s\n", pedido1.getNombre());
        System.out.printf("Total: %s\n", pedido1.getTotal());
        System.out.printf("Listo: %s\n", pedido1.isListo());
        System.out.println();

        //Agrega el artículo1 a la lista de artículos del pedido2 e incrementa el total del pedido.
        pedido2.items.add(articulo1);
        System.out.println("pedido2.getTotal() = " + pedido2.getTotal());

        //pedido3 pidió un capuchino. Agrega el capuchino a su lista de pedido y a su cuenta.
        pedido3.items.add(articulo4);
        System.out.println("pedido3.getTotal() = " + pedido3.getTotal());

        //pedido4 agregó un latte. Actualiza en consecuencia.
        pedido4.items.add(articulo2);

        //El pedido de Cindhuri ya está listo. Actualiza su estado.
        pedido1.setListo(true);
        System.out.println("pedido1.isListo() Cindhuri = " + pedido1.isListo());

        //Sam pidió más bebidas: 2 latte. Actualiza su pedido también.
        pedido4.items.add(articulo2);
        pedido4.items.add(articulo2);

        System.out.println("pedido4.items = " + pedido4.items);
        System.out.println("pedido4.getTotal() = " + pedido4.getTotal());

        //El pedido de Jimmy ya está listo. Actualiza su estado.
        pedido2.setListo(true);
        System.out.println("pedido2.isListo() Jimmy = " + pedido2.isListo());


    }
}
