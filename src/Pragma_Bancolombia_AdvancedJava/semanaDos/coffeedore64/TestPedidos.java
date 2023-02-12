package Pragma_Bancolombia_AdvancedJava.semanaDos.coffeedore64;

public class TestPedidos {
    public static void main(String[] args) {
        PedidoKiosko pedidoKiosko = new PedidoKiosko();
        // AGREGANDO ARTÍCULOS AL MENÚ DE ARTÍCULOS
        pedidoKiosko.addMenuItem("cappucino", 5.5);
        pedidoKiosko.addMenuItem("Mocha", 6.5);
        pedidoKiosko.addMenuItem("Latte", 4.5);
        pedidoKiosko.addMenuItem("Drip Coffee", 5.0);

        pedidoKiosko.newOrder();

    }
}
