package pokemonAbstractasInterfaces;

public class Bulbasaur extends Pokemon implements IPlanta {
    private static String nombrePokemon;
    private static int temporadaQueAparece;


    static {
        Bulbasaur.nombrePokemon = "BulbaSaur";
        Bulbasaur.temporadaQueAparece = 1;
    }
    protected Bulbasaur(int numPokeDex, float pesoPokemon,
                        char generoPokemon) {
        super(numPokeDex,
                nombrePokemon,
                pesoPokemon,
                generoPokemon,
                temporadaQueAparece);

    }


    @Override
    protected void atacarPlacaje() {
        System.out.printf("Hola soy %s y estoy usando: Placaje!", nombrePokemon);
    }

    @Override
    protected void atacarAraniazo() {
        System.out.printf("Hola soy %s y estoy usando: Arañazo!", nombrePokemon);

    }

    @Override
    protected void atacarMordisco() {
        System.out.printf("Hola soy %s y estoy usando: Mordisco!", nombrePokemon);

    }


    @Override
    public void atacarParalizar() {
        System.out.printf("Hola, soy %s y estoy usando: %s!", nombrePokemon, PARALIZAR);
    }

    @Override
    public void atacarDrenaje() {
        System.out.printf("Hola, soy %s y estoy usando: %s!", nombrePokemon, DRENAJE);

    }

    @Override
    public void atacarHojaAfilada() {
        System.out.printf("Hola, soy %s y estoy usando: %s!", nombrePokemon, HOJA_AFILADA);

    }

    @Override
    public void atacarLatigoCepa() {
        System.out.printf("Hola, soy %s y estoy usando: %s!", nombrePokemon, LATIGO_CEPA);

    }
}
