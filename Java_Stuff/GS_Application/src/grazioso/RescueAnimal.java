/*
 * Description: Project 2
 * Class: IT145
 * Author: Uriah L. Fadum
 * Professor: Joe L. Parker
 * Date: 11/29/2020
 */

// Package containing all associated classes
package grazioso;

// Import statements
import java.util.Date;		// Changed from SimpleDateFormat too Date
// Super class RescueAnimal
public class RescueAnimal {

    // Changed animal related Instance variables from private to protected
	
	protected static String type;							//Rescue Animal Type (Dog or Monkey)
	protected static String name;							//Rescue Animal Name						
	protected static String gender;							//Rescue Animal Gender
	protected static int age;								//Rescue Animal Age
	protected static float weight;							//Rescue Animal Weight
	protected static Date acquisitionDate;					//Rescue Animal Acquisition Date
	protected static Date statusDate;						//Rescue Animal Status Date
	protected static String acquisitionSource;				//Rescue Animal Acquisition Source
	protected static Boolean reserved;						//Rescue Animal Reserved or Not 
    
    // Changed training related instance variables from private to protected
	
	protected static String trainingLocation;				//Rescue Animal Training Location
	protected static Date trainingStart;					//Rescue Animal Training Start Date
	protected static Date trainingEnd;						//Rescue Animal Training End Date
	protected static String trainingStatus;					//Rescue Animal Training Status
    
    // Changed location related instance variables from private to protected
	
	protected static String inServiceCountry;				//Rescue Animal Service Country
	protected static String inServiceCity;					//Rescue Animal Service City
	protected static String inServiceAgency;				//Rescue Animal Service Agency
	protected static String inServicePOC;					//Rescue Animal Service Point-of-Contact
	protected static String inServiceEmail;					//Rescue Animal Service Email Address
	protected static String inServicePhone;					//Rescue Animal Service Phone Number
	protected static String inServicePostalAddress;			//Rescue Animal Service Postal Address
	

    // Constructor
    public RescueAnimal(String type, String name, String gender, int age, 
    					float weight, Date acquisitionDate,
    					Date statusDate, String acquisitionSource, Boolean reserved, 
    					String trainingLocation, Date trainingStart, Date trainingEnd,
    					String trainingStatus, String inServiceCountry, String inServiceCity,
    					String inServiceAgency, String inServicePOC, String inServiceEmail,
    					String inServicePhone, String inServicePostalAddress) {
    	
    	// Instance variable default values
    	type = "null";
    	name = "null";
    	gender = "null";
    	age = 0;
    	weight = 0.0f;
		acquisitionDate = null;
		statusDate = null;
		acquisitionSource = "null";
		reserved = false;
		
		
		trainingLocation = "null";
		trainingStart = null;
		trainingEnd = null;
		trainingStatus = "null";
		
		
		inServiceCountry = "null";
		inServiceCity = "null";
		inServiceAgency = "null";
		inServicePOC = "null";
		inServiceEmail = "null";
		inServicePhone = "null";
		inServicePostalAddress = "null";
    }
    
    
    // Accessor Method
	public String getName() {
		return name;
	}
	// Mutator Method
	public void setName(String name) {
		RescueAnimal.name = name;
	}
	// Accessor Method
	public String getType() {
		return type;
	}
	// Mutator Method
	public void setType(String type) {
		RescueAnimal.type = type;
	}
	// Accessor Method
	public String getGender() {
		return gender;
	}
	// Mutator Method
	public void setGender(String gender) {
		RescueAnimal.gender = gender;
	}
	// Accessor Method
	public int getAge() {
		return age;
	}
	// Mutator Method
	public void setAge(int age) {
		RescueAnimal.age = age;
	}
	// Accessor Method
	public float getWeight() {
		return weight;
	}
	// Mutator Method
	public void setWeight(float weight) {
		RescueAnimal.weight = weight;
	}
	
	
	// Accessor Method
	public Date getAcquisitionDate() {
		return acquisitionDate;
	}
	// Mutator Method
	public void setAcquisitionDate(Date date) {
		RescueAnimal.acquisitionDate = date;
	}
	// Accessor Method
	public Date getStatusDate() {
		return statusDate;
	}
	// Mutator Method
	public void setStatusDate(Date statusDate) {
		RescueAnimal.statusDate = statusDate;
	}
	// Accessor Method
	public String getAcquisitionSource() {
		return acquisitionSource;
	}
	// Mutator Method
	public void setAcquisitionSource(String acquisitionSource) {
		RescueAnimal.acquisitionSource = acquisitionSource;
	}
	// Accessor Method
	public Boolean getReserved() {
		return reserved;
	}
	// Mutator Method
	public void setReserved(Boolean reserved) {
		RescueAnimal.reserved = reserved;
	}
	
	
	// Accessor Method
	public String getTrainingLocation() {
		return trainingLocation;
	}
	// Mutator Method
	public void setTrainingLocation(String trainingLocation) {
		RescueAnimal.trainingLocation = trainingLocation;
	}
	// Accessor Method
	public Date getTrainingStart() {
		return trainingStart;
	}
	// Mutator Method
	public void setTrainingStart(Date trainingStart) {
		RescueAnimal.trainingStart = trainingStart;
	}
	// Accessor Method
	public Date getTrainingEnd() {
		return trainingEnd;
	}
	// Mutator Method
	public void setTrainingEnd(Date trainingEnd) {
		RescueAnimal.trainingEnd = trainingEnd;
	}
	// Accessor Method
	public String getTrainingStatus() {
		return trainingStatus;
	}
	// Mutator Method
	public void setTrainingStatus(String trainingStatus) {
		RescueAnimal.trainingStatus = trainingStatus;
	}

	
	// Accessor Method
	public String getInServiceCountry() {
		return inServiceCountry;
	}
	// Mutator Method
	public void setInServiceCountry(String inServiceCountry) {
		RescueAnimal.inServiceCountry = inServiceCountry;
	}
	// Accessor Method
	public String getInServiceCity() {
		return inServiceCity;
	}
	// Mutator Method
	public void setInServiceCity(String inServiceCity) {
		RescueAnimal.inServiceCity = inServiceCity;
	}
	// Accessor Method
	public String getInServiceAgency() {
		return inServiceAgency;
	}
	// Mutator Method
	public void setInServiceAgency(String inServiceAgency) {
		RescueAnimal.inServiceAgency = inServiceAgency;
	}
	// Accessor Method
	public String getInServicePOC() {
		return inServicePOC;
	}
	// Mutator Method
	public void setInServicePOC(String inServicePOC) {
		RescueAnimal.inServicePOC = inServicePOC;
	}
	// Accessor Method
	public String getInServiceEmail() {
		return inServiceEmail;
	}
	// Mutator Method
	public void setInServiceEmail(String inServiceEmail) {
		RescueAnimal.inServiceEmail = inServiceEmail;
	}
	// Accessor Method
	public String getInServicePhone() {
		return inServicePhone;
	}
	// Mutator Method
	public void setInServicePhone(String inServicePhone) {
		RescueAnimal.inServicePhone = inServicePhone;
	}
	// Accessor Method
	public String getInServicePostalAddress() {
		return inServicePostalAddress;
	}
	// Mutator Method
	public void setInServicePostalAddress(String inServicePostalAddress) {
		RescueAnimal.inServicePostalAddress = inServicePostalAddress;
	}

}