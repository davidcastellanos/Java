import java.util.Scanner;

public class Ejercicio1 {
  
    static int cuantosPaquetes (double total)
    {
        int cantPaquetes=0;
        Scanner s = new Scanner(System.in);
        double nro;
        while (total>0){
            System.out.print("Ingrese el siguiente paquete: ");
            nro=s.nextDouble();
            total= total-nro;
            System.out.println("Total restante: "+total);
            cantPaquetes++;
        }

        return cantPaquetes;
    }

    public static void main(String[] args) {
        String nombreCan;
        double cantidadCan;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del can: ");
        nombreCan=scanner.nextLine();
        System.out.print("Ingrese la cantidad de comida: ");
        cantidadCan=scanner.nextDouble();

        System.out.println(nombreCan + " precisa " + cuantosPaquetes(cantidadCan) + " paquetes");
    }
    
}
