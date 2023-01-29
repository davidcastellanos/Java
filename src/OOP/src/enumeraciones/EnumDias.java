package enumeraciones;

public enum EnumDias {
    LUNES("Lunes"),
    MARTES("Martes"),
    MIERCOLES("Miércoles"),
    JUEVES("Jueves"),
    VIERNES("Viernes"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    private final String dia;


    EnumDias(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return this.dia;
    }

    @Override
    public String toString() {
        return this.getDia();
    }
}
