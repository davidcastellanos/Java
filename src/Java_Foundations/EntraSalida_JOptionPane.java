package Java_Foundations;

import javax.swing.*;

public class EntraSalida_JOptionPane {
    public static void main(String[] args) {
        String miString;
        int miEntero;
        char miLetra;
        double miDecimal;

        miString = JOptionPane.showInputDialog("Digíte un String: ");
        System.out.println(miString);
        JOptionPane.showMessageDialog(null, "La salida de estring es: " + miString);

        miEntero = Integer.parseInt(JOptionPane.showInputDialog("Digíte un número entero: "));
        System.out.println(miEntero);
        JOptionPane.showMessageDialog(null, "La salida de entero es: " + miEntero);

        miLetra = JOptionPane.showInputDialog("Digita un carácter: ").charAt(0);
        System.out.println(miLetra);
        JOptionPane.showMessageDialog(null, "La salida de carácter es: " + miLetra);

        miDecimal = Double.parseDouble(JOptionPane.showInputDialog("Digita un número decimal: "));
        System.out.println(miDecimal);
        JOptionPane.showMessageDialog(null, "La salida de decimal es: " + miDecimal);



    }
}
