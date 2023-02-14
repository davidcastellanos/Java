package Pragma_Bancolombia_AdvancedJava.semanaTres.abstractArt;

public abstract class Arte {
    String titulo;
    String autor;
    String descripcion;
    public Arte(String titulo, String autor, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    abstract void verArte();

}
