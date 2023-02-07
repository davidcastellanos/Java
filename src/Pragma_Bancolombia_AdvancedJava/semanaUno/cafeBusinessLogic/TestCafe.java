package Pragma_Bancolombia_AdvancedJava.semanaUno.cafeBusinessLogic;

import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        // PUNTO 1
        System.out.println("\n----- Prueba Meta café -----");
        CafeUtil cafeUtil = new CafeUtil();
        System.out.println("Compras necesarias para la semana \"n\": " + cafeUtil.getStreakGoal(10)+"\n");

        // PUNTO 2
        System.out.println("----- Prueba Total Orden -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
            System.out.printf("Total orden: %.2f\n\n", cafeUtil.getOrderTotal(lineItems));

        // PUNTO 3
        System.out.println("----- Prueba Mostrar Menú-----");
        ArrayList<String> menu = new ArrayList<>();
        menu.add("café de goteo");
        menu.add("capuchino");
        menu.add("latte");
        menu.add("moka");

        cafeUtil.displayMenu(menu);

        // PUNTO 4
        System.out.println("\n----- Prueba agregar cliente-----");
        ArrayList<String> customers = new ArrayList<>();
        // // --- Probar 4 veces ---
        for (int i = 0; i < 4; i++) {
            cafeUtil.addCustomer(customers);
            System.out.println("\n");
        }

        // PUNTO 5
        cafeUtil.printPriceChart("Café Molido Colombiano", 12000, 3);
        // NUEVO MENÚ
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(1200.0);
        prices.add(3200.0);
        prices.add(3600.0);
        prices.add(3200.0);

        System.out.println();
        System.out.println(cafeUtil.displayMenu(menu, prices));


    }
}
