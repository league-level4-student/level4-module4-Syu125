package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	void addPatient(Patient p) {
		patients.add(p);
	}

	ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	ArrayList<Patient> getPatients() {
		return patients;

	}

	void assignPatient(Patient p) throws Exception {
		if (patients.size() < 3) {
			patients.add(p);
		} else {
			System.out.println("exception thrown");
			throw new DoctorFullException();
		}

	}

	void assignPatientsToDoctors() throws Exception {
		int count = 0;
		for (Patient p : patients) {
			try {
				doctors.get(count).assignPatient(p);
			}catch(DoctorFullException dfe) {
				count++;
				doctors.get(count).assignPatient(p);
			}
		}
	}
}
