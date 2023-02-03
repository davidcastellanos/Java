package semanaUno.clase2;

public class HelloWorld {
    String name = "David";

    String hola() {
        return "Hola";
    }

    String hola(String name) {
        name = this.name;
        return "Hola " + name;
    }
}
