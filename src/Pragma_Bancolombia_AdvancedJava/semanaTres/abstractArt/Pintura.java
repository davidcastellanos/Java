package Pragma_Bancolombia_AdvancedJava.semanaTres.abstractArt;

public class Pintura extends Arte {
    String tipoPintura;
    public Pintura (String titulo, String autor, String descripcion, String tipoPintura) {
        super(titulo, autor, descripcion);
        this.tipoPintura = tipoPintura;

    }

    @Override
    void verArte() {
        System.out.printf("Título: %s,\nAutor: %s,\nDescripción: %s,\nTipo Pintura: %s,\n",
                this.titulo, this.autor, this.descripcion, this.tipoPintura);
    }
}
