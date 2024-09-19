package com.registration.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


 @Entity

public class Vaccine {
  
    @Id 
 private String citizenId;
 private String citizenName;
 private String vaccineName;
 private String vaccineCenterId;
 private String vaccinationCenterAdress;
 public Vaccine() {
		super();
	}
public Vaccine(String citizenId, String citizenName, String vaccineName, String vaccineCenterId,          
		String vaccinationCenterAdress) {
	super();
	this.citizenId = citizenId;
	this.citizenName = citizenName;
	this.vaccineName = vaccineName;
	this.vaccineCenterId = vaccineCenterId;
	this.vaccinationCenterAdress = vaccinationCenterAdress;
}
public String getCitizenId() {
	return citizenId;
}
public void setCitizenId(String citizenId) {
	this.citizenId = citizenId;
}
public String getCitizenName() {
	return citizenName;
}
public void setCitizenName(String citizenName) {
	this.citizenName = citizenName;
}
public String getVaccineName() {
	return vaccineName;
}
public void setVaccineName(String vaccineName) {
	this.vaccineName = vaccineName;
}
public String getVaccineCenterId() {
	return vaccineCenterId;
}
public void setVaccineCenterId(String vaccineCenterId) {
	this.vaccineCenterId = vaccineCenterId;
}
public String getVaccinationCenterAdress() {
	return vaccinationCenterAdress;
}
public void setVaccinationCenterAdress(String vaccinationCenterAdress) {
	this.vaccinationCenterAdress = vaccinationCenterAdress;
}
@Override
public String toString() {
	return "Vaccine [citizenId=" + citizenId + ", citizenName=" + citizenName + ", vaccineName=" + vaccineName
			+ ", vaccineCenterId=" + vaccineCenterId + ", vaccinationCenterAdress=" + vaccinationCenterAdress
			+ ", getCitizenId()=" + getCitizenId() + ", getCitizenName()=" + getCitizenName() + ", getVaccineName()="
			+ getVaccineName() + ", getVaccineCenterId()=" + getVaccineCenterId() + ", getVaccinationCenterAdress()="
			+ getVaccinationCenterAdress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

 
}
