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

// Class Dog extending RescueAnimal
public class Dog extends RescueAnimal {
	
	// Constructor
		public Dog(String type, String name, String gender, int age, float weight,
					  Date acquisitionDate, Date statusDate, String acquisitionSource, 
					  Boolean reserved, String trainingLocation, Date trainingStart, 
					  String trainingStatus, String inServiceCountry, String inServiceCity, 
					  String inServiceAgency, String inServicePOC, String inServiceEmail, 
					  String inServicePhone, String inServicePostalAddress) {
				super(type, name, gender, age, weight, acquisitionDate, statusDate, 
						acquisitionSource, reserved, trainingLocation, trainingStart, trainingEnd,
						trainingStatus, inServiceCountry, inServiceCity, inServiceAgency,
						inServicePOC, inServiceEmail, inServicePhone, inServicePostalAddress);
	}

	//Dog specific instance variable
    public static String breed;

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}