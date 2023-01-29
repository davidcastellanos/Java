package varArgs;

public class ImprimirNumeros {

    private static void imprimirNums(int... numeros) {
        System.out.println("Prueba VarARgs");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

    private static void conMasArgumentos(String frase, int... numeros) {
        for (int numero: numeros) {
            System.out.printf("%s %d:\n", frase, numero);
            System.out.println(numero);
        }
    }


    public static void main(String[] args) {
        conMasArgumentos("imprimiendo número", 8, 9, 7, 11, 20, 15, 10, 2);
        imprimirNums(5, 7, 9, 12, 5, 24, 47, 6, 23, 1, 4, 0, 2);
    }
}
