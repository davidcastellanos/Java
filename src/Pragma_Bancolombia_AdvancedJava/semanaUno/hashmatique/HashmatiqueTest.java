package Pragma_Bancolombia_AdvancedJava.semanaUno.hashmatique;

import java.util.Scanner;
import java.util.HashMap;

public class HashmatiqueTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashmatique hashmatique = new Hashmatique();
        System.out.println("Agrega el número de canciones a incluir en el Track:");
        int numOfTracks = scanner.nextInt();

        HashMap<String, String> trackList = hashmatique.createHashMap();

        int i = 1;
        do {
            System.out.println("Agrega el título de la canción:");
            String keyMap = scanner.nextLine();
            System.out.println("Agrega la letra de la canción:");
            String value = scanner.nextLine();
            trackList.put(keyMap, value);
            i++;
        } while (i <= numOfTracks);


        System.out.println(trackList);

    }

}
