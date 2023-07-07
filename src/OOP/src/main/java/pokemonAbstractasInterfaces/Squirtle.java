package pokemonAbstractasInterfaces;

public class Squirtle extends Pokemon implements IAgua {
    private static String nombrePokemon;
    private static int temporadaQueAparece;

    static {
        Squirtle.nombrePokemon = "Squirtle";
        Squirtle.temporadaQueAparece = 1;
    }
    protected Squirtle(int numPokeDex, float pesoPokemon,
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
    public void atacarHidrobomba() {
        System.out.printf("Hola, soy %s y estoy atacando con: %s!", nombrePokemon, HIDRO_BOMBA);
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.printf("Hola, soy %s y estoy atacando con: %s!", nombrePokemon, PISTOLA_AGUA);

    }

    @Override
    public void atacarBurbuja() {
        System.out.printf("Hola, soy %s y estoy atacando con: %s!", nombrePokemon, BURBUJA);

    }

    @Override
    public void atacarHidropulso() {
        System.out.printf("Hola, soy %s y estoy atacando con: %s!", nombrePokemon, HIDRO_PULSO);

    }
}
