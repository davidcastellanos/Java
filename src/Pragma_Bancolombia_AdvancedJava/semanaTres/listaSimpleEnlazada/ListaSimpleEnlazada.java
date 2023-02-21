package Pragma_Bancolombia_AdvancedJava.semanaTres.listaSimpleEnlazada;

public class ListaSimpleEnlazada {
    public Nodo head;
    public ListaSimpleEnlazada() {
        // tu código aquí
        this.head = null;
    }
    // Los métodos de SLL van aquí. Para empezar, te mostraremos cómo agregar un nodo a la lista.
    private boolean estaVacio() {
        return this.head == null;
    }

    public void agregarAlFrente(int value) {
        Nodo newNode = new Nodo(value);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void agregarAtras(int value) {
        Nodo newNode = new Nodo(value);
        if(head == null) {
            head = newNode;
            return;
        }
        Nodo runner = this.head;
        while(runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
    }

    public boolean contiene(int value) {
        Nodo runner = this.head;
        while(runner != null) {
            if(runner.value == value)
                return true;
            runner = runner.next;
        }
        return false;

    }

    public void printValues() {
        if(estaVacio()) {
            System.out.println("List is empty");
            return;
        }

        Nodo runner = this.head;
        while(runner.next != null) {
            System.out.println("$$$$$$$$");
            String s = String.format("Node Value: %s :: Nexint Value: %s", runner.value, runner.next.value);
            System.out.println(s);
            runner = runner.next;
        }
        System.out.println("$$$$$$$$");
        String s = String.format("Node Value: %s :: Nexint Value: null", runner.value);
        System.out.println(s);
    }

    public Integer remove() {
        Nodo runner = head;
        int valToReturn;

        // if we have 0 nodes return null
        if(estaVacio())
            return null;

        // if we have just one node, remove head
        if(head.next == null) {
            valToReturn = head.value;
            head = null;
            return valToReturn;
        }

        // otherwise, loop til we are right before the last node
        while(runner.next.next != null) {
            runner = runner.next;
        }
        valToReturn = runner.next.value;
        runner.next = null;
        return valToReturn;

    }
    public void add(int value) {
        Nodo newNodo = new Nodo(value);
        if(head == null) {
            head = newNodo;
        } else {
            Nodo runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNodo;
        }
    }
}
