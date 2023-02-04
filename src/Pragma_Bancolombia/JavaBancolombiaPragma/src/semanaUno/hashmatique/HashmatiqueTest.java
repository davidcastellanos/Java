package semanaUno.hashmatique;

public class HashmatiqueTest {
    public static void main(String[] args) {
        Hashmatique hashmatique = new Hashmatique();
        hashmatique.createTrackList();
        System.out.println("------------------------------");
        System.out.println(hashmatique.findSongByTitle());
        System.out.println("------------------------------");
        hashmatique.printAllSongs();

    }
}
