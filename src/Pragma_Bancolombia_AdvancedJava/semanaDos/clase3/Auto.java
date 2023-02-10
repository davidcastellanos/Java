package Pragma_Bancolombia_AdvancedJava.semanaDos.clase3;

public class Auto implements Acelerable {


    @Override
    public void acelerar() {
        Acelerable.super.acelerar();
    }

    @Override
    public void desacelerar() {
        System.out.println(Acelerable.hola);

    }


}
