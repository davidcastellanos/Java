package Pragma_Bancolombia_AdvancedJava.semanaTres.listaSimpleEnlazada;

public class PruebaLista {
    public static void main(String[] args) {
        ListaSimpleEnlazada sll = new ListaSimpleEnlazada();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
    }
}
