package Model;

import java.util.ArrayList;

public class Prescription {
    protected String prescriptionDate;
    protected ArrayList<String> medicine;
    protected ArrayList<String> dosage;
    protected String doctorID;
    protected String patientId;
    protected String prescriptionID;
    protected String doctorNotes;

    /**
     * This is the default constructor for the Prescription class
     * @param prescriptionDate sets the date the prescription was given
     * @param medicine sets the medication name of the prescription
     * @param dosage sets the dosage of the medication
     * @param doctorID sets the ID of the doctor that prescribed the medication
     * @param patientId sets the ID of the patient receiving the medication
     * @param prescriptionID sets the ID of the prescription
     * @param doctorNotes sets the notes recorded by the doctor when giving the prescription
     */
    
    public Prescription(String prescriptionDate, ArrayList<String> medicine, ArrayList<String> dosage, String doctorID, String patientId, String prescriptionID, String doctorNotes) {
        this.prescriptionDate = prescriptionDate;
        this.medicine = medicine;
        this.dosage = dosage;
        this.doctorID = doctorID;
        this.patientId = patientId;
        this.prescriptionID = prescriptionID;
        this.doctorNotes = doctorNotes;
    }
    
    /**
     * @return the prescriptionDate
     */
    public String getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * @param prescriptionDate the prescriptionDate to set
     */
    public void setPrescriptionDate(String prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    /**
     * @return the medicine
     */
    public ArrayList<String> getMedicine() {
        return medicine;
    }

    /**
     * @param medicine the medicine to set
     */
    public void setMedicine(ArrayList<String> medicine) {
        this.medicine = medicine;
    }

    /**
     * @return the dosage
     */
    public ArrayList<String> getDosage() {
        return dosage;
    }

    /**
     * @param dosage the dosage to set
     */
    public void setDosage(ArrayList<String> dosage) {
        this.dosage = dosage;
    }

    /**
     * @return the doctorID
     */
    public String getDoctorID() {
        return doctorID;
    }

    /**
     * @param doctorID the doctorID to set
     */
    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    /**
     * @return the patientId
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * @return the prescriptionID
     */
    public String getPrescriptionID() {
        return prescriptionID;
    }

    /**
     * @param prescriptionID the prescriptionID to set
     */
    public void setPrescriptionID(String prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    /**
     * @return the doctorNotes
     */
    public String getDoctorNotes() {
        return doctorNotes;
    }

    /**
     * @param doctorNotes the doctorNotes to set
     */
    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }
}