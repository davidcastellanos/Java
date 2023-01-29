package composicion;

public class Carro {
    /*
    * Si el método encender() dentro de la clase es ESTÁTICA como ahora, entonces
    * No se necesita crear una instancia de Motor -> NO es necesario crear el objeto
    * basta con referenciarlo para poder usar dicho método*/
    Motor motor;
    /*Si el método encender() dentro de la clase es DE INSTANCIA, entonces
    * Primero hay que instanciar (crear el objeto motor) antes de poder usar el método*/

    //Motor motor2 = new Motor();
    Motor motor2;


    void avanzar() {
        System.out.println("El carro avanza!!\n");
    }


    public static void main(String[] args) {
        Carro micarro = new Carro();
        micarro.motor.encender();
        String pruebaMotor = micarro.motor2.probarMotor();
        System.out.println(pruebaMotor);
        micarro.avanzar();
    }
}
