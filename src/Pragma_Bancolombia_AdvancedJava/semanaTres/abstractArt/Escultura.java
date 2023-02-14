package Pragma_Bancolombia_AdvancedJava.semanaTres.abstractArt;

public class Escultura extends Arte {
    String material;

    public Escultura (String titulo, String autor, String descripcion, String material) {
        super(titulo, autor, descripcion);
        this.material = material;

    }

    @Override
    void verArte() {
        System.out.printf("Título: %s,\nAutor: %s,\nDescripción: %s,\nMaterial: %s,\n",
                this.titulo, this.autor, this.descripcion, this.material);
    }
}
