package pokemonAbstractasInterfaces;

public class Charmander extends Pokemon implements IFuego {
    private static String nombrePokemon;
    private static int temporadaQueAparece;

    static {
        Charmander.nombrePokemon = "Charmander";
        Charmander.temporadaQueAparece = 1;
    }

    protected Charmander(int numPokeDex, float pesoPokemon,
                         char generoPokemon) {
        super(numPokeDex,
                nombrePokemon,
                pesoPokemon,
                generoPokemon,
                temporadaQueAparece);
    }


    @Override
    protected void atacarPlacaje() {
        System.out.printf("Hola, soy %s y estoy atacando con Placaje!", nombrePokemon);
    }

    @Override
    protected void atacarAraniazo() {
        System.out.printf("Hola, soy %s y estoy atacando con Arañazo!", nombrePokemon);

    }

    @Override
    protected void atacarMordisco() {
        System.out.printf("Hola, soy %s y estoy atacando con Mordisco!", nombrePokemon);

    }


    @Override
    public void atacarPunioFuego() {
        System.out.printf("Hola, soy %s y estoy atacando con: %s!", nombrePokemon, PUNIO_FUEGO);
    }

    @Override
    public void atacarAscuas() {
        System.out.printf("Hola, soy %s y estoy atacando con: %s!", nombrePokemon, ASCUAS);

    }

    @Override
    public void atacarLanzallamas() {
        System.out.printf("Hola, soy %s y estoy atacando con: %s!", nombrePokemon, LANZA_LLAMAS);

    }
}
