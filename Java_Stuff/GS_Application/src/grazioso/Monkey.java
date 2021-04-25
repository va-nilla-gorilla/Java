/*
 * Description: Project 2
 * Class: IT145
 * Author: Uriah L. Fadum
 * Professor: Joe L. Parker
 * Date: 11/29/2020
 */

// Package containing all associated classes
package grazioso;

import java.util.Date;

// Class Monkey extending RescueAnimal
public class Monkey extends RescueAnimal {
	
	//Monkey specific instance variables
	public static float tailLength;
	public static float bodyHeight;
	public static float bodyLength;
		
	public static String subSpecies;
		
	public static float torsoMeasurement;
	public static float skullMeasurement;
	public static float neckMeasurement;
	
	// Constructor
	public Monkey(String type, String name, String gender, int age, float weight,
				  Date acquisitionDate, Date statusDate, String acquisitionSource, 
				  Boolean reserved, String trainingLocation, Date trainingStart, 
				  String trainingStatus, String inServiceCountry, String inServiceCity, 
				  String inServiceAgency, String inServicePOC, String inServiceEmail, 
				  String inServicePhone, String inServicePostalAddress) {
			super(type, name, gender, age, weight, acquisitionDate, statusDate, 
					acquisitionSource, reserved, trainingLocation, trainingStart, trainingEnd,
					trainingStatus, inServiceCountry, inServiceCity, inServiceAgency,
					inServicePOC, inServiceEmail, inServicePhone, inServicePostalAddress);
			
			// Instance variable default values
			tailLength = 0.0f;
			bodyHeight = 0.0f;
			bodyLength = 0.0f;
			
			subSpecies = "null";
			
			torsoMeasurement = 0.0f;
			skullMeasurement = 0.0f;
			neckMeasurement = 0.0f;
			
		}

		// Accessor Method
		public float getTailLength() {
			return tailLength;
		}

		// Mutator Method
		public void setTailLength(float tailLength) {
			Monkey.tailLength = tailLength;
		}
		
		// Accessor Method
		public float getBodyHeight() {
			return bodyHeight;
		}

		// Mutator Method
		public void setBodyHeight(float bodyHeight) {
			Monkey.bodyHeight = bodyHeight;
		}
		
		// Accessor Method
		public float getBodyLength() {
			return bodyLength;
		}

		// Mutator Method
		public void setBodyLength(float bodyLength) {
			Monkey.bodyLength = bodyLength;
		}	

		// Accessor Method
		public String getSubSpecies() {
			return subSpecies;
		}

		// Mutator Method
		public void setSubSpecies(String subSpecies) {
			Monkey.subSpecies = subSpecies;
		}

		// Accessor Method
		public float getTorsoMeasurement() {
			return torsoMeasurement;
		}

		// Mutator Method
		public void setTorsoMeasurement(float torsoMeasurement) {
			Monkey.torsoMeasurement = torsoMeasurement;
		}

		// Accessor Method
		public float getSkullMeasurement() {
			return skullMeasurement;
		}

		// Mutator Method
		public void setSkullMeasurement(float skullMeasurement) {
			Monkey.skullMeasurement = skullMeasurement;
		}

		// Accessor Method
		public float getNeckMeasurement() {
			return neckMeasurement;
		}

		// Mutator Method
		public void setNeckMeasurement(float neckMeasurement) {
			Monkey.neckMeasurement = neckMeasurement;
		}
		
}