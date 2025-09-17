import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println(name + " is consulting " + p.name);
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }
}

public class PatientDemo {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d = new Doctor("Dr. Alice");
        Patient p = new Patient("John");
        d.consult(p);
    }
}
