import java.util.Scanner;

public class Ejercicio1 {
    static boolean esDivisible(int n, int divisor)
    {
        return n%divisor==0;
    }

    static boolean esPrimo(int n)
    {
        int divisores=0;
        int posibleDivisor=1;
        // según lo visto en clases, se agrega control por si es n=1 que no es primo
        if (n!=1){
            while (divisores<=2 && posibleDivisor<=n){
                if (esDivisible(n,posibleDivisor))
                {
                    divisores++;
                }
                posibleDivisor++;
            }
            if (divisores<=2){
                return true;
            }
            else
            {
                return false;
            }
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar el número a comprobar: ");
        numero=scanner.nextInt();
        if (esPrimo(numero)){
            System.out.println("Es un número primo");
        }
        else{
            System.out.println("El número no es primo");
        }
    }
}
