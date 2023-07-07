package pokemonAbstractasInterfaces;

public abstract class Pokemon {
    protected int numPokeDex;
    protected String nombrePokemon;
    protected float pesoPokemon;
    protected char generoPokemon;
    protected int temporadaQueAparece;

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
