package com.david.mundopc.app;

import com.david.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        //DispositivoEntrada dispositivoEntrada1 = new DispositivoEntrada("SVG", "MICROSOFT");
        Mouse mouse1 = new Mouse("USB", "Logitech");
        Teclado teclado1 = new Teclado("USB", "HP");
        Monitor monitor1 = new Monitor("SAMSUNG", 19.2);
        Computadora computadora1 = new Computadora("LENOVO IDEAPAD", monitor1, teclado1, mouse1);
        Computadora computadora2 = new Computadora("ASUS", monitor1, teclado1, mouse1);
        Computadora computadora3 = new Computadora("HP", monitor1, teclado1, mouse1);
        Computadora computadora4 = new Computadora("HP", monitor1, teclado1, mouse1);
        Computadora computadora5 = new Computadora("HP", monitor1, teclado1, mouse1);
        Computadora computadora6 = new Computadora("HP", monitor1, teclado1, mouse1);
        Computadora computadora7 = new Computadora("HP", monitor1, teclado1, mouse1);
        Computadora computadora8 = new Computadora("HP", monitor1, teclado1, mouse1);
        Computadora computadora9 = new Computadora("HP", monitor1, teclado1, mouse1);
        Computadora computadora10 = new Computadora("HP", monitor1, teclado1, mouse1);
        Computadora computadora11 = new Computadora("HP", monitor1, teclado1, mouse1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora3);
        orden1.agregarComputadora(computadora4);
        orden1.agregarComputadora(computadora5);
        orden1.agregarComputadora(computadora6);
        orden1.agregarComputadora(computadora7);
        orden1.agregarComputadora(computadora8);
        orden1.agregarComputadora(computadora9);
        orden1.agregarComputadora(computadora10);
        orden1.agregarComputadora(computadora11);
        orden1.mostrarOrden();


    }

}
