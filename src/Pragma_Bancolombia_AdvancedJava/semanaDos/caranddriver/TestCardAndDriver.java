package Pragma_Bancolombia_AdvancedJava.semanaDos.caranddriver;

public class TestCardAndDriver {
    public static void main(String[] args) {
        Conductor conductor = new Conductor();
        System.out.println("------CONDUCIENDO------");
        for (int i = 0; i < 4; i++) {

            conductor.conducir();
        }
        System.out.println("------PROPULSORES------");
        if (conductor.getGasolina() >= 3) {
            conductor.usarPropulsores();
        }
        System.out.println("------LLENANDO TANQUE------");
        for (int i = 0; i < 4; i++) {
            if (conductor.getGasolina() <= 8) {
                conductor.llenarGasolina();
            }

        }

    }
}
