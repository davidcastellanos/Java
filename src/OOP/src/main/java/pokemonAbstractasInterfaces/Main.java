package pokemonAbstractasInterfaces;

public class Main {
    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu(9, 3.69f, 'M');
        System.out.println("Pikachu: Uso de métodos de clase abstracta");
        pikachu.atacarPlacaje();
        System.out.println();
        pikachu.atacarAraniazo();
        System.out.println();
        pikachu.atacarMordisco();
        System.out.println();
        System.out.println();
        System.out.println("Pikachu: Uso de métodos de interfaces");
        pikachu.atacarImpactrueno();
        System.out.println();
        pikachu.atacarPunioTrueno();
        System.out.println();
        pikachu.atacarRayo();
        System.out.println();
        pikachu.atacarRayoCarga();
        System.out.println();

        System.out.println("--------------------------------------------");
        Bulbasaur bulbasaur = new Bulbasaur(6, 4.0f, 'M');
        System.out.println("Bulbasaur: Uso de métodos de clase abstracta");
        bulbasaur.atacarPlacaje();
        System.out.println();
        bulbasaur.atacarAraniazo();
        System.out.println();
        bulbasaur.atacarMordisco();
        System.out.println();
        System.out.println();
        System.out.println("Bulbasaur: Uso de métodos de interfaces");
        bulbasaur.atacarParalizar();
        System.out.println();
        bulbasaur.atacarDrenaje();
        System.out.println();
        bulbasaur.atacarHojaAfilada();
        System.out.println();
        bulbasaur.atacarLatigoCepa();
        System.out.println();

        System.out.println("--------------------------------------------");
        Charmander charmander = new Charmander(3, 3.3f, 'M');
        System.out.println("Charmander: Uso de métodos de clase abstracta");
        charmander.atacarPlacaje();
        System.out.println();
        charmander.atacarAraniazo();
        System.out.println();
        charmander.atacarMordisco();
        System.out.println();
        System.out.println();
        System.out.println("Charmander: Uso de métodos de interfaces");
        charmander.atacarPunioFuego();
        System.out.println();
        charmander.atacarAscuas();
        System.out.println();
        charmander.atacarLanzallamas();
        System.out.println();

        System.out.println("--------------------------------------------");
        Squirtle squirtle = new Squirtle(36, 9.0f, 'M');
        System.out.println("Squirtle: Uso de métodos de clase abstracta");
        squirtle.atacarPlacaje();
        System.out.println();
        squirtle.atacarAraniazo();
        System.out.println();
        squirtle.atacarMordisco();
        System.out.println();
        System.out.println();
        System.out.println("Squirtle: Uso de métodos de interfaces");
        squirtle.atacarHidrobomba();
        System.out.println();
        squirtle.atacarPistolaAgua();
        System.out.println();
        squirtle.atacarBurbuja();
        System.out.println();
        squirtle.atacarHidropulso();
        System.out.println();


    }
}
