package Pragma_Bancolombia_AdvancedJava.semanaDos.ordersAndItems;

import java.util.ArrayList;
public class TestPedidos {
    public static void main(String[] args) {

        //ARTICULOS
        Articulo articulo1 = new Articulo();
        Articulo articulo2 = new Articulo();
        Articulo articulo3 = new Articulo();
        Articulo articulo4 = new Articulo();

        //ARTICULOS - DANDO PRECIOS Y NOMBRES
        articulo1.nombre = "Moka";
        articulo2.nombre = "Latte";
        articulo3.nombre = "Café de Goteo";
        articulo4.nombre = "Capuccino";

        articulo1.precio = 3.3;
        articulo2.precio = 3.6;
        articulo3.precio = 3.9;
        articulo4.precio = 6.3;

        // PEDIDOS
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();
        Pedido pedido4 = new Pedido();

        // PEDIDOS - NOMBRES CLIENTES
        pedido1.nombre = "Cindhuri";
        pedido2.nombre = "Jimmy";
        pedido3.nombre = "Noah";
        pedido4.nombre = "Sam";

        // IMPRIMIR PEDIDO 1
        System.out.println("pedido1 = " + pedido1);

        // Agrega el artículo1 a la lista de artículos del pedido2 e incrementa el total del pedido.
        pedido2.items.add(articulo1);
        pedido2.total += articulo1.precio;

        // pedido3 pidió un capuchino. Agrega el capuchino a su lista de pedido y a su cuenta.
        pedido3.items.add(articulo4);
        pedido3.total += articulo4.precio;

        // pedido4 agregó un latte. Actualiza en consecuencia.
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;

        // El pedido de Cindhuri ya está listo. Actualiza su estado.
        pedido1.listo = true;

        // Sam pidió más bebidas: 2 latte. Actualiza su pedido también.
        pedido4.items.add(articulo2);
        pedido4.items.add(articulo2);
        pedido4.total += articulo2.precio;
        pedido4.total += articulo2.precio;
        System.out.println("pedido4.total = " + pedido4.total);

        // El pedido de Jimmy ya está listo. Actualiza su estado.
        pedido2.listo = true;

    }
}
