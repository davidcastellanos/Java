package enumeraciones;

public class Main {
    public static void main(String[] args) {
        System.out.println(EnumDias.SABADO.getDia());
        // con el override de toString, imprime minúscula, sin necesidad de poner el método getter:
        System.out.println(EnumDias.DOMINGO);
    }
}
