package Pragma_Bancolombia_AdvancedJava.semanaUno.alfredBot;
import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }

    public String guestGreeting(String name) {
        // TU CÓDIGO AQUÍ
        return String.format("Hola, %s, Encantado de verte.", name);
    }

    public String dateAnnouncement() {
        // TU CÓDIGO AQUÍ
        Date fechaActual = new Date();
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy G 'a las' HH:mm:ss z");
        String resultadoFecha = df.format(fechaActual);

        return String.format("Actualmente es %s", resultadoFecha);
    }

    public String respondBeforeAlexis(String conversation) {
        // TU CÓDIGO AQUÍ

        return conversation.contains("Alexis") ? "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso"
                : conversation.contains("Alfred") ? "A su servicio. Como desee, naturalmente" :  "Bien. Y con eso, me retiraré";
    }

    // BONUS NINJA
    // Ver las especificaciones para sobrecargar el método guessGreeting
    public String guestGreeting(String name, String superheroe) {
        return String.format("Hola, %s alias %s, Encantado de verte.", name, superheroe);
    }

    //="comment from-rainbow">// BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!

    public String botAlfredQuote(String name) {
        return String.format("\"Quizás de eso se trata %s. No de ganar. Si no que de fallar...\"", name);
    }
}

