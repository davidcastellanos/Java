package Pragma_Bancolombia_AdvancedJava.semanaTres.abstractArt;

import java.util.ArrayList;
import java.util.Random;

public class Museo {
    public static void main(String[] args) {
        ArrayList<Arte> museo = new ArrayList<Arte> ();
        Pintura pintura1 = new Pintura("Salvator Mundi", "Leonardeschi y Leonardo da Vinci",
                "Cristo como Salvator Mundi", "Pintura al óleo");
        Pintura pintura2 = new Pintura("La Gioconda", "Leonardo da Vinci",
                "retrato de Lisa Gherardini, esposa de Francesco del Giocondo", "Pintura al óleo");
        Pintura pintura3 = new Pintura("Las meninas", "Diego Velázquez",
                "Las meninas o La familia de Felipe IV", "Pintura al óleo");

        Escultura escultura1 = new Escultura("El rapto de Proserpina", "Gian Lorenzo Bernini",
                "Proserpina (Perséfone en la mitología griega) siendo raptada por Plutón (Hades en la mitología griega), soberano de los infiernos.", "mármol");

        Escultura escultura2 = new Escultura("Pudicizia (la velata)", "Antonio Corradini",
                "Modestia con Velo, Castidad Velada, o la Verdad Velada,", "mármol");

        museo.add(pintura1);
        museo.add(pintura2);
        museo.add(pintura3);
        museo.add(escultura1);
        museo.add(escultura2);

        Random random = new Random();

        int aleatoriumIndex = random.nextInt(0, 5);
        System.out.println("aleatoriumIndex = " + aleatoriumIndex);
        museo.get(aleatoriumIndex).verArte();
    }
}
