package pokemonAbstractasInterfaces;

public interface IElectrico {
    final String IMPACT_TRUENO = "Impact Trueno";
    final String PUNIO_TRUENO = "puño trueno";
    final String ATACAR_RAYO = "Atacar Rayo";
    final String RAYO_CARGA = "Atacar Rayo Carga";

    void atacarImpactrueno();
    void atacarPunioTrueno();
    void atacarRayo();
    void atacarRayoCarga();
}
