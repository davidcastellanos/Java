package Pragma_Bancolombia_AdvancedJava.semanaDos.caranddriver;

public class Conductor extends Automovil {

    public Conductor() {
        super();
    }
    void conducir() {
        System.out.println("Conduciendo el Automóvil...");
        reducirGasolina(1);
        System.out.printf("Gasolina restante: %d/%s\n", getGasolina(), getCapacity());
    }

    void usarPropulsores() {
        System.out.println("Usando propulsores...");
        reducirGasolina(3);
        System.out.printf("Gasolina restante: %d/%s\n", getGasolina(), getCapacity());

    }

    void llenarGasolina() {
        System.out.println("LLenando Gasolina de tu Automóvil....");
        agregarGasolina(2);
        System.out.printf("Gasolina restante: %d/%s\n", getGasolina(), getCapacity());

    }


}
