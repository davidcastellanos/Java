package polimorfismo.ejemplo2;

public class EjemploFiguras {
    public double sumarAreas(Figura[] figuras) {

        double sumaTotal = 0.0;

        for (Figura figura: figuras) {
            double areaFigura = figura.calcularArea();
            System.out.printf("areaFiguraCalculada de figura de color %s = %f\n", figura.getColor(), areaFigura);
            sumaTotal += areaFigura;
        }
        return sumaTotal;
    }


    public static void main(String[] args) {

        Figura[] arrayFiguras = {new Cuadrado("Verde", 10.5), new Circulo("Rojo", 11.1), new Rectangulo("Azul", 10.2, 11.6)};
        EjemploFiguras ejemploFiguras = new EjemploFiguras();
        double resultado = ejemploFiguras.sumarAreas(arrayFiguras);
        System.out.println("resultado = " + resultado);

    }
}
