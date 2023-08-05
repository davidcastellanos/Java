public class VideoJuegoBuilder {
    //VideoJuego videoJuego;
    private static int codigo;
    private String titulo;
    private String consola;
    private int cantidadDeJugadores;
    private String categoria;

    /*public VideoJuegoBuilder videoJuego(VideoJuego videoJuego) {
        this.videoJuego = videoJuego;
        return this;
    }*/



    public VideoJuegoBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public VideoJuegoBuilder consola(String consola) {
        this.consola = consola;
        return this;
    }

    public VideoJuegoBuilder cantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
        return this;
    }

    public VideoJuegoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }


    /*public VideoJuego getVideoJuego() {
        return videoJuego;
    }*/

    public String getTitulo() {
        return titulo;
    }

    public String getConsola() {
        return consola;
    }

    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public VideoJuego build () {
        return VideoJuego.getInstance(this,  ++VideoJuegoBuilder.codigo);
    }
}
