package Pragma_Bancolombia_AdvancedJava.semanaTres.calculatorI;
import java.io.Serializable;

public class CalculatorI implements Serializable {
    private double operandoUno;
    private double operandoDos;
    private String operacion = "";
    public CalculatorI() {
    }

    public CalculatorI(double operandoUno, String operacion, double operandoDos) {
        this.operandoUno = operandoUno;
        if (operacion.equals("+") || operacion.equals("-")) {
            this.operacion = operacion;
        } else {
            System.out.println("Operación no válida, pruebe con + ó -");
        }
        this.operandoDos = operandoDos;
    }

    public void setOperandoUno(double operandoUno) {
        this.operandoUno = operandoUno;
    }

   public void setOperandoDos(double operandoDos) {
        this.operandoDos = operandoDos;
    }

    public void setOperacion(String operacion) {
        if (operacion.equals("+") || operacion.equals("-")) {
            this.operacion = operacion;
        } else {
            System.out.println("Operación no válida, pruebe con + ó -");
        }

    }

    double realizarOperacion() {
        double result = 0;
        result = switch (operacion) {
                case "+" -> this.operandoUno + this.operandoDos;
                case "-" -> this.operandoUno - this.operandoDos;
                default -> throw new RuntimeException("Operación no válida haga SUMA o RESTA!");
        };

        return result;
    }

    String getResultados() {
        StringBuilder result = new StringBuilder("Su operación realizada fue: ");
        if (operacion.equals("+")) {
            result.append("SUMA\n");
        } else if (operacion.equals("-")){
            result.append("RESTA\n");
        } else {
            result.append("NINGUNA\n");
        }
        result.append(String.format("El resultado final fue: %.2f", realizarOperacion()));

        return String.valueOf(result);
    }
}
