package Pragma_Bancolombia_AdvancedJava.semanaDos.com.caresoft.clinicapp;

public interface UsuarioCompatibleConHIPAA {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}
