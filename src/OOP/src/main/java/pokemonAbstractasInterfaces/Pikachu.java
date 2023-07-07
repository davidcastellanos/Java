package pokemonAbstractasInterfaces;

/**
 * pikachu
 */
public class Pikachu extends Pokemon implements IElectrico {

    private static String nombrePokemon;
    private static int temporadaQueAparece;

    static {
        Pikachu.nombrePokemon = "Pikachu";
        Pikachu.temporadaQueAparece = 1;
    }
    protected Pikachu(int numPokeDex, float pesoPokemon,
                      char generoPokemon) {

        super(numPokeDex, nombrePokemon, pesoPokemon, generoPokemon, temporadaQueAparece);
    }

    @Override
    public void atacarPlacaje() {
        System.out.printf("Hola soy %s y estoy atacando con Placaje!", nombrePokemon);

    }

    @Override
    public void atacarAraniazo() {
        System.out.printf("Hola soy %s y estoy atacando con Arañazo!", nombrePokemon);


    }

    @Override
    public void atacarMordisco() {
        System.out.printf("Hola soy %s y estoy atacando con Mordisco!", nombrePokemon);
    }

    @Override
    public void atacarImpactrueno() {
        System.out.printf("Hola soy %s y estoy atacando con %s!", nombrePokemon, IMPACT_TRUENO);

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.printf("Hola soy %s y estoy atacando con %s!", nombrePokemon, PUNIO_TRUENO);


    }

    @Override
    public void atacarRayo() {
        System.out.printf("Hola soy %s y estoy atacando con %s!", nombrePokemon, ATACAR_RAYO);

    }

    @Override
    public void atacarRayoCarga() {
        System.out.printf("Hola soy %s y estoy atacando con %s!", nombrePokemon, RAYO_CARGA);

    }
}
