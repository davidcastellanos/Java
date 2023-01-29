package sobrecargaYsobreescritura;

public class EjemploSobreCarga {
    int n1;
    int n2;

/* Estoy sobrecargando el constructor, debido a que éste constructor
se ha creado 2 veces con el mismo nombre, difiere en la firma debido a que
uno está sin parámetros, y el otro recibe 2 parámetros*/
    public EjemploSobreCarga(){
        System.out.println("Haré una suma!");
    }

    /*SE USÓ EL MISMO MÉTODO DE UNA MANERA DIFERENTE, SE PASAN DIFERENTES PARAMS
    Y ES PORQUE SEGURAMENTE SE VA A HACER ALGO DIFERENTE AHÍ, POR TANTO, EL RESULTADO SUELE SER TAMBIÉN DIFERENTE*/

    public EjemploSobreCarga(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        System.out.println("Haré una suma!: " + (this.n1 + this.n2));
    }
}
