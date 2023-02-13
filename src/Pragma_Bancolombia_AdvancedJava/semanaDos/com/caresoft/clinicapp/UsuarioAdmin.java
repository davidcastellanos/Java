package Pragma_Bancolombia_AdvancedJava.semanaDos.com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class UsuarioAdmin extends Usuario implements UsuarioCompatibleConHIPAA, AdminCompatibleConHIPAA {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    // PARA HACER: Implementar un constructor que tome un ID y un rol
    public UsuarioAdmin(int employeeID, String role) {
        this.employeeID = employeeID;
        this.role = role;
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        if (securityIncidents.size() > 0) {
            return securityIncidents;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void printSecurityIncidents() {
        AdminCompatibleConHIPAA.super.printSecurityIncidents();
    }

    @Override
    public boolean adminQATest(ArrayList<String> expectedIncidents) {
        return AdminCompatibleConHIPAA.super.adminQATest(expectedIncidents);
    }

    @Override
    public boolean assignPin(int pin) {
        int pinLength = (int) (Math.log10(pin) + 1);
        if (pinLength == 6) {
            this.pin = pin;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (!Objects.equals(this.employeeID, confirmedAuthID)) {
            authIncident();
            return false;
        } else {
            return true;
        }

    }

    public void newIncident(String notes) {
        String report = String.format(
                "Fecha y hora de envío: %s \n, Reportado por ID: %s\n Notas: %s \n",
                new Date(), this.employeeID, notes
        );
        securityIncidents = new ArrayList<>();
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
                "Fecha y hora de envío: %s \n, ID: %s\n Notas: %s \n",
                new Date(), this.employeeID, "FALLÓ EL INTENTO DE AUTORIZACIÓN PARA ESTE USUARIO"
        );
        securityIncidents = new ArrayList<>();
        securityIncidents.add(report);
    }
}
