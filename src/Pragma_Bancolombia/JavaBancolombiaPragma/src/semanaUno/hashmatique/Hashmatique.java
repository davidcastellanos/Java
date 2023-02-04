package semanaUno.hashmatique;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    HashMap<String, String> createTrackList() {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("La edad del cielo","No somos más\n" +
                "Que una gota de luz\n" +
                "Una estrella fugaz\n" +
                "Una chispa, tan sólo\n" +
                "En la edad del cielo\n\n");
        trackList.put("Telefonía","Noches en vela\n" +
                "Nombres en clave\n" +
                "Cuentos secretos\n" +
                "Versos galantes\n" +
                "Mil confesiones delirantes\n\n");
        trackList.put("Tocarte","Quiero que el barrio entero sepa de nuestra obsesión\n" +
                "Y presumir de ti besándonos en el balcón\n\n");
        trackList.put("Universos Paralelos","Mi anhelo no está, mi anhelo se fue\n" +
                "Detrás de ti, siguiéndote\n" +
                "Por la avenida\n\n");

        return trackList;

    }

    String findSongByTitle() {
        HashMap<String, String> trackList = createTrackList();
        return trackList.get("La edad del cielo");

    }

    void printAllSongs() {
        HashMap<String, String> trackList = createTrackList();
        Set<String> setTitles = trackList.keySet();

        for (String title : setTitles) {
            System.out.printf("%s: %s\n\n", title, trackList.get(title));

        }
    }




}
