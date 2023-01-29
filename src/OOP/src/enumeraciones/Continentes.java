package enumeraciones;

public enum Continentes {
    AFRICA(53, "África"),
    EUROPA(46, "Europa"),
    ASIA(44, "Asia"),
    AMERICA(34, "América"),
    OCEANIA(14, "Oceanía"),
    OTRO(0, "Otro");

    private final int cantidadPaises;
    private final String nombreContinente;

    private Continentes(int cantidadPaises, String nombreContinente) {
        this.cantidadPaises = cantidadPaises;
        this.nombreContinente = nombreContinente;
    }

    public int getCantidadPaises() {
        return this.cantidadPaises;
    }

    @Override
    public String toString() {
        return this.nombreContinente;
    }
}
