import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VideoJuego videoJuego1 = new VideoJuegoBuilder()
                .titulo("PES 17")
                .consola("PlayStation 4")
                .cantidadDeJugadores(2)
                .categoria("Deportes")
                .build();

        /*System.out.println("videoJuego1.getTitulo() = " + videoJuego1.getTitulo());
        System.out.println("videoJuego1.getCodigo() = " + videoJuego1.getCodigo());
        System.out.println("videoJuego1.getConsola() = " + videoJuego1.getConsola());*/

        VideoJuego videoJuego2 = new VideoJuegoBuilder()
                .titulo("Ninja Gaiden")
                .consola("XBOX")
                .cantidadDeJugadores(1)
                .categoria("Aventura")
                .build();

        /*System.out.println("videoJuego2.getTitulo() = " + videoJuego2.getTitulo());
        System.out.println("videoJuego2.getCodigo() = " + videoJuego2.getCodigo());
        System.out.println("videoJuego2.getConsola() = " + videoJuego2.getConsola());*/

        VideoJuego videoJuego3 = new VideoJuegoBuilder()
                .titulo("Golden Eye")
                .consola("Nintendo 64")
                .cantidadDeJugadores(5)
                .categoria("Guerra")
                .build();

        VideoJuego videoJuego4 = new VideoJuegoBuilder()
                .titulo("Call Of Duty")
                .consola("PlayStation 5")
                .cantidadDeJugadores(4)
                .categoria("Guerra")
                .build();

        /*System.out.println();
        System.out.println(videoJuego3.getCodigo());
        System.out.println();*/

        VideoJuego videoJuego5 = new VideoJuegoBuilder()
                .titulo("Mario Kart")
                .consola("Nintendo 64")
                .cantidadDeJugadores(6)
                .categoria("Deportes")
                .build();

        VideoJuego videoJuego6 = new VideoJuegoBuilder()
                .titulo("Halo")
                .consola("XBOX X")
                .cantidadDeJugadores(6)
                .categoria("Guerra")
                .build();

        /*AGREGANDO VIDEOJUEGOS A LA LISTA*/
        List<VideoJuego> videoJuegoList = new ArrayList<>();
        videoJuegoList.add(videoJuego1);
        videoJuegoList.add(videoJuego2);
        videoJuegoList.add(videoJuego3);
        videoJuegoList.add(videoJuego4);
        videoJuegoList.add(videoJuego5);
        videoJuegoList.add(videoJuego6);

        System.out.println("---MOSTRANDO EN CONSOLA LISTA COMPLETA DE VIDEOJUEGOS---");
        for (VideoJuego v: videoJuegoList) {
            System.out.println(v);
        }


        /*Cambiando datos*/
        System.out.println();
        System.out.println("---Cambiando datos---");
        videoJuego2.setTitulo("El Señor de los Anillos");
        videoJuego2.setCantidadDeJugadores(2);

        videoJuego1.setTitulo("EL PADRINO");
        videoJuego1.setCantidadDeJugadores(1);
        for (VideoJuego v: videoJuegoList) {
            System.out.println(v);
        }

        /*MOSTRANDO EN CONSOLA SÓLO NINTENDO 64*/
        System.out.println();
        System.out.println("---MOSTRANDO EN CONSOLA SÓLO NINTENDO 64---");
        for (VideoJuego v: videoJuegoList) {
            if (v.getConsola().equals("Nintendo 64")) {
                System.out.println(v);
            }

        }


    }
}
