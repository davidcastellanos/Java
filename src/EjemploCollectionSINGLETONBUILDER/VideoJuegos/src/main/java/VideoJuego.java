public class VideoJuego {
    private static VideoJuego instance;
    private int codigo;
    private String titulo;
    private String consola;
    private int cantidadDeJugadores;
    private String categoria;

    private VideoJuego(VideoJuegoBuilder videoJuegoBuilder, int codigo) {
        this.codigo = codigo;
        this.titulo = videoJuegoBuilder.getTitulo();
        this.consola = videoJuegoBuilder.getConsola();
        this.cantidadDeJugadores = videoJuegoBuilder.getCantidadDeJugadores();
        this.categoria = videoJuegoBuilder.getCategoria();
    }

    public static VideoJuego getInstance(VideoJuegoBuilder videoJuegoBuilder, int codigo) {
        instance = new VideoJuego(videoJuegoBuilder, codigo);
        return instance;
    }


    public int getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public String getCategoria() {
        return categoria;
    }


    @Override
    public String toString() {
        return "VideoJuego{" +
                "codigo='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", consola='" + getConsola() + '\'' +
                ", cantidadDeJugadores=" + getCantidadDeJugadores() +
                ", categoria='" + getCategoria() + '\'' +
                '}';
    }
}
