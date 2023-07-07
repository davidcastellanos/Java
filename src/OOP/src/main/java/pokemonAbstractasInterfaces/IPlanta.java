package pokemonAbstractasInterfaces;

public interface IPlanta {
    final String PARALIZAR = "Paralizar";
    final String DRENAJE = "Drenaje";
    final String HOJA_AFILADA = "Hoja Afilada";
    final String LATIGO_CEPA = "Látigo Cepa";
    void atacarParalizar();
    void atacarDrenaje();
    void atacarHojaAfilada();
    void atacarLatigoCepa();
}
