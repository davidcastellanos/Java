package enumeraciones;

public class TestContinentes {

    public static String cantidadPaisesEnContinente(Continentes continente) {
        return switch (continente) {
            case EUROPA  -> String.format("It is the continent %s! Number of countries: %d", continente, continente.getCantidadPaises());
            case AFRICA  -> String.format("It is the continent %s! Number of countries: %d", continente, continente.getCantidadPaises());
            case ASIA    -> String.format("It is the continent %s! Number of countries: %d", continente, continente.getCantidadPaises());
            case AMERICA -> String.format("It is the continent %s! Number of countries: %d", continente, continente.getCantidadPaises());
            case OCEANIA -> String.format("It is the continent %s! Number of countries: %d", continente, continente.getCantidadPaises());
            default      -> throw new IllegalStateException("Invalid Continent: " + continente + " -> Valor en ENUM pero no evaluado en la switch expression");
        };
    }

    public static void main(String[] args) {
        System.out.println(cantidadPaisesEnContinente(Continentes.EUROPA));
        System.out.println(cantidadPaisesEnContinente(Continentes.AFRICA));
        System.out.println(cantidadPaisesEnContinente(Continentes.AMERICA));
        System.out.println(cantidadPaisesEnContinente(Continentes.ASIA));
        System.out.println(cantidadPaisesEnContinente(Continentes.OCEANIA));
        System.out.println("\"ASIA otra opción\" = " + cantidadPaisesEnContinente(Enum.valueOf(Continentes.class, "ASIA")));
        System.out.println(cantidadPaisesEnContinente(Continentes.OTRO));

        System.out.println("Continentes.AMERICA = " + Continentes.AMERICA);
        System.out.println("Continentes.AMERICA.getCantidadPaises() = " + Continentes.AMERICA.getCantidadPaises());

    }
}
