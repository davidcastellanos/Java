package encapsulamiento.abstraccion;

public class Auto {
    /*Métodos a usar por otras clases.*/
    void encender(){
        pasarCorriente();
        iniciarMarcha();
        verificandoNiveles();
        System.out.println("Encendiendo");

    }
    void acelerar(){
        System.out.println("Acelerando");
    }
    void frenar(){
        System.out.println("Frenando");
    }
    void cambiarVelocidad(){
        System.out.println("Cambiando de velocidad");
    }

/*Detalles de implementación, por eso son privados, no deberían ser INVOCADOS desde
* afuera de la clase, sino desde otros MÉTODOS DENTRO DE LA CLASE.*/
    private void pasarCorriente(){
        System.out.println("Pasando Corriente");
    }
    private void iniciarMarcha(){
        System.out.println("Iniciando Marcha");
    }
    private void verificandoNiveles(){
        System.out.println("Verificando Niveles");
    }

}
