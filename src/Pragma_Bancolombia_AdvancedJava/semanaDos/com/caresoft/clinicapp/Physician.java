package Pragma_Bancolombia_AdvancedJava.semanaDos.com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Physician extends Usuario implements UsuarioCompatibleConHIPAA{
    private ArrayList<String> patientNotes;

    // PARA HACER: Constructor que tome un ID
    public Physician(int id) {
        this.id = id;
    }
    @Override
    public boolean assignPin(int pin) {
        //int pinLength = String.valueOf(pin).length();
        int pinLength = (int) (Math.log10(pin) + 1);
        if (pinLength == 4) {
            this.pin = pin;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (Objects.equals(confirmedAuthID, this.id)) {
            return true;
        } else {
            return false;
        }

    }

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format("Fecha y hora de envío: %s \n", date);
        report += String.format("Reportado por ID: %s\n", this.id);
        report += String.format("Nombre del paciente: %s\n", patientName);
        report += String.format("Notas: %s \n", notes);
        this.patientNotes.add(report);
    }

    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
