package Pragma_Bancolombia_AdvancedJava.semanaTres.calculatorI;

public class TestCalculatorI {
    public static void main(String[] args) {

        //SUMA
        System.out.println("-------SUMA-------");
        CalculatorI calculatorI = new CalculatorI();
        calculatorI.setOperandoUno(10.5);
        calculatorI.setOperacion("+");
        calculatorI.setOperandoDos(5.2);
        System.out.println("calculatorI.getResultados() = " + calculatorI.getResultados());

        //RESTA
        System.out.println("-------RESTA-------");
        CalculatorI calculatorI2 = new CalculatorI();
        calculatorI2.setOperandoUno(10.5);
        calculatorI2.setOperacion("-");
        calculatorI2.setOperandoDos(5.2);
        System.out.println("calculatorI.getResultados() = " + calculatorI2.getResultados());

        System.out.println("-------OPERACION ERRÓNEA-------");
        CalculatorI calculatorI3 = new CalculatorI();
        calculatorI3.setOperandoUno(10.5);
        calculatorI3.setOperacion("q");
        calculatorI3.setOperandoDos(5.2);
        System.out.println("calculatorI.getResultados() = " + calculatorI3.getResultados());
    }
}
