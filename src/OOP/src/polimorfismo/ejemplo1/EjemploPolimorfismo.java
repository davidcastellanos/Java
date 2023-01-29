package polimorfismo.ejemplo1;

public class EjemploPolimorfismo {
/*    El poliformismo permite que a través de la herencia se pueda crear un objeto
            con diferentes referencias, O de distinto tipo,
             perro es perro, perro es animal, perro es Objeto...*/
    public static void main(String[] args) {
        Object animal1 = new Animal();
        Animal animal2  = new Animal();
        //AVE
        Animal ave1 = new Animal();
        Animal ave2 = new Ave();
        Ave ave3 = new Ave();
        Object ave4 = new Ave();
        //PERRO
        Animal perro1 = new Animal();
        Animal perro2 = new Perro();
        Perro perro3 = new Perro();
        Object perro4 = new Perro();
        //GATO
        Animal gato1 = new Animal();
        Animal gato2 = new Gato();
        Gato gato3 = new Gato();
        Object gato4 = new Gato();
        //AGUILA
        Object aguila1 = new Aguila();
        Animal aguila2 = new Animal();
        Animal aguila4 = new Aguila();
        Ave aguila5 = new Ave();
        Ave aguila6 = new Aguila();
        Aguila aguila7 = new Aguila();

    }
}
