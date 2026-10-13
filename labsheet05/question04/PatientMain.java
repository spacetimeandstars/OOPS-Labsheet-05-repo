package labsheet05.question04;

class Patient {
    int patientId;
    String patientName;
    int age;

    public Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + patientId + ", Name: " + patientName + ", Age: " + age);
    }
}

class PatientManager {
    public void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Asha", 21),
            new Patient(2, "Ravi", 34),
            new Patient(3, "Meera", 28),
            new Patient(4, "Kiran", 45),
            new Patient(5, "Nimal", 52)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}