package pokemonAbstractasInterfaces;

public abstract class Pokemon {
    private int numPokeDex;
    private String nombrePokemon;
    private float pesoPokemon;
    private char generoPokemon;
    private int temporadaQueAparece;

    protected Pokemon(int numPokeDex, String nombrePokemon, float pesoPokemon,
                      char generoPokemon, int temporadaQueAparece) {
        this.numPokeDex = numPokeDex;
        this.nombrePokemon = nombrePokemon;
        this.pesoPokemon = pesoPokemon;
        this.generoPokemon = generoPokemon;
        this.temporadaQueAparece = temporadaQueAparece;

    }

    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

}
