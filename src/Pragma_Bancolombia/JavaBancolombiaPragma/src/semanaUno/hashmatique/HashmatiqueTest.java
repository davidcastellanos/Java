package semanaUno.hashmatique;

public class HashmatiqueTest {
    public static void main(String[] args) {
        Hashmatique hashmatique = new Hashmatique();
        System.out.println(hashmatique.createTrackList());;
        System.out.println("------------------------------");
        System.out.println("La edad del cielo: \n" + hashmatique.findSongByTitle());
        System.out.println("------------------------------");
        hashmatique.printAllSongs();

    }
}
