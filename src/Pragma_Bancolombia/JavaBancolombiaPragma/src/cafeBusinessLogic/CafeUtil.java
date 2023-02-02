package cafeBusinessLogic;
import java.util.Locale;


import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
    int getStreakGoal(int numWeeks) {
        int acum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            acum += i;
        }

        return acum;
    }

    double getOrderTotal(double[] prices) {
        double sumOfPrices = 0;

        for (double price : prices) {
            sumOfPrices += price;
        }

        return sumOfPrices;
    }

    void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s\n", i, menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = sc.nextLine();
        int numUsers = customers.size();

        System.out.printf("¡Hola, %s Hay %d personas frente a ti", userName, numUsers);

        customers.add(userName);
        System.out.printf("\n%s", customers);
    }

    void printPriceChart(String product, double price, int maxQuantity) {
        System.out.printf("%s\n", product);
        for (int i = 1; i <= maxQuantity ; i++) {
            System.out.printf(Locale.US, "%d $%,.0f \n", i, (price * i));
        }

    }

    boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        boolean result;

        if (menuItems.size() == prices.size()) {
            result = true;
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf(Locale.US,"%d %s -- $%,.0f\n", i, menuItems.get(i), prices.get(i));
            }
        } else {
            result = false;
        }

        return result;
    }


}
