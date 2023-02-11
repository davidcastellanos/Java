package Pragma_Bancolombia_AdvancedJava.semanaDos.coffeedore64;

import java.util.ArrayList;
import java.util.Scanner;

public class PedidoKiosko {
    ArrayList<Articulo> menuArticulos;
    ArrayList<Pedido> pedidos;

    public PedidoKiosko() {
        menuArticulos = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    ArrayList<Articulo> addMenuItem(String nombreItem, double precio) {
        Articulo articulo = new Articulo(nombreItem, precio);
        menuArticulos.add(articulo.getIndice(), articulo);
        articulo.setIndice(1);

        return  menuArticulos;
    }

    String displayMenu() {
        String str = "";
        if (menuArticulos.size() > 0) {
            for (Articulo articulo : menuArticulos) {
                str = String.format("%d %s -- $%.2f\n", articulo.getIndice(), articulo.getNombre(), articulo.getPrecio());
            }
        } else {
            str = "No hay Items para mostrar";
        }

        return str;
    }

    public void newOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String nombre = scanner.nextLine();

        // Tu código:
        // Crea un nuevo pedido con la cadena de entrada dada
        Pedido pedido1 = new Pedido("David");
        // Muestra el menú al usuario, para que puedan elegir artículos para agregar
        System.out.println(displayMenu());

        // Pedir al usuario que ingrese un número de artículo
            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            String itemNumber = scanner.nextLine().toLowerCase();

        // Escribir un bucle while para recopilar todos los artículos del pedido del usuario
        // Obtén el objeto del artículo del menú y agrega el artículo al pedido
        // Pídales que ingresen un nuevo índice de artículo o q nuevamente, y toma su entrada

        while(!itemNumber.equals("q")) {
            try {
                Articulo itemElegido = menuArticulos.get(Integer.parseInt(itemNumber));
                pedido1.addArticulo(itemElegido);

            } catch (NumberFormatException ex) {
                if (!itemNumber.equals("q")) {
                    System.out.println("Opción no válida.");
                }
            }

            System.out.println("Ingrese un índice de artículo del menú o q para salir:");
            itemNumber = scanner.nextLine().toLowerCase();
        }
        // Después de haber completado su pedido, imprime los detalles del pedido
        // como el ejemplo de abajo. Puedes utilizar el método de visualización del pedido

    }
}
