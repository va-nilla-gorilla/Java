/*
 * Description: Project 2
 * Class: IT145
 * Author: Uriah L. Fadum
 * Professor: Joe L. Parker
 * Date: 11/29/2020
 */


// Package containing all associated classes
package grazioso;																						

//Import Statements
import java.util.ArrayList;																				
import java.util.Arrays;																				
import java.util.Date;																																									
import java.util.Scanner;																															
import java.text.ParseException;																		
import java.text.SimpleDateFormat;																		
// Class Driver extending RescueAnimal
public class Driver extends RescueAnimal {																
	
	
	// Constructor 
    public Driver(String type, String name, String gender, int age, float weight, Date acquisitionDate, Date statusDate,
			String acquisitionSource, Boolean reserved, String trainingLocation, Date trainingStart,
			String trainingStatus, String inServiceCountry, String inServiceCity, String inServiceAgency,
			String inServicePOC, String inServiceEmail, String inServicePhone, String inServicePostalAddress) {
		super(type, name, gender, age, weight, acquisitionDate, statusDate, acquisitionSource, reserved, trainingLocation,
				trainingStart, trainingEnd, trainingStatus, inServiceCountry, inServiceCity, inServiceAgency, inServicePOC, inServiceEmail,
				inServicePhone, inServicePostalAddress);
	}

	// Main method
	public static void main(String[]args) {	
		
		// Array list to store rescue animals
    	ArrayList<RescueAnimal> animalArray = new ArrayList<>();								
    	
    	// Create New Dog	 ----> REFER TO INTAKE METHOD FOR CREATION OF NEW DOG
    	
    	
    	// Create New Monkey ----> REFER TO INTAKE METHOD FOR CREATION OF NEW MONKEY
    	
    	// Created new scanner to accept user input
    	Scanner scnr = new Scanner(System.in);
    	// Created menu for selection of function
    	String mainMenu = "-------------------------------------------------------------\n"
    					+ "|                 *** Select An Option ***                  |\n"
    					+ "-------------------------------------------------------------\n"
    					+ "| 1 - Process request for new rescue animal                 |\n"
    					+ "| 2 - Update existing rescue animal information             |\n"
    					+ "| 3 - Display rescue animal location and training info      |\n"
    					+ "| 4 - Intake new rescue animal candidate                    |\n"
    					+ "| 5 - Transfer animal to farm or inservice                  |\n"
    					+ "| 6 - Process EOS/EOL reports                               |\n"
    					+ "| 7 - Display animals based on location & training phase    |\n"
    					+ "| 8 - Quit application                                      |\n"
    					+ "-------------------------------------------------------------";
    	// Initializing userSelection as an integer selection
    	int userSelection;
    	// Displays title of application
    	System.out.println("-------------------------------------------------------------\n"
						 + "|       *** Grazioso Rescue Animal Application ***          |\n"
						 + "-------------------------------------------------------------\n");
    	// Displays main menu allowing user to select a rescue animal function
    	System.out.println(mainMenu);
    	// Taking Keyboard input
    	userSelection = scnr.nextInt();
    	// While loop with nested while loop to handle exceptions and function selection
    	while (userSelection != 8) {
    		//
    		while (userSelection > 8 || userSelection < 1) {
    			System.out.println("");
    			System.out.println("-------------------------------------------------------------\n"
    							 + "|                 *** Invalid Selection ***                 |\n"
    							 + "-------------------------------------------------------------\n");
    			System.out.println("");
    			System.out.println(mainMenu);
    			userSelection = scnr.nextInt();
    		}    		
    		if (userSelection == 1) {
    			rescueAnimalRequest();
    			break;
    		}   		
    		if (userSelection == 2) {
    			updateRescueAnimal();
    			break;
    		}    		
    		if (userSelection == 3) {
    			animalsInService();
    			break;
    		}   		
    		if (userSelection == 4) {
    			rescueAnimalIntake(animalArray);
    			break;
    		}   		
    		if (userSelection == 5) {
    			rescueAnimalTransfer();
    			break;
    		}   		
    		if (userSelection == 6) {
    			rescueAnimalProcessing();
    			break;
    		}    			
    		if (userSelection == 7) {
    			rescueAnimalPhaseStatus(); 
    			break;
    		}
    		}
    	// Prints statement showing user function is complete
    	System.out.println("");
    	System.out.println("--------------------------------------------------------------------\n"
				 		 + "|*** Thank You For Using The Grazioso Rescue Animal Application ***|\n"
				 		 + "--------------------------------------------------------------------\n");
    	// Closing scanner
    	scnr.close();
    	}
	// Method to add/in-take animals
	public static void rescueAnimalIntake(ArrayList <RescueAnimal> animalArray) {
		//
		Scanner scnr = new Scanner(System.in);
		
		
		
		// Acceptable Dog Breeds list for user input
		String acceptableBreeds[] = {" 1 - American-pit-bull-terrier\n",
					 "2 - Beagle\n", "3 - Belgian-Malinois\n",
					 "4 - Border-collie\n", "5 - Bloodhound\n", 
					 "6 - Coonhound\n", "7 - English-springer-spaniel\n",
					 "8 - German-sheperd\n", "9 - German-shorthaired-pointer\n", 
					 "10 - Golden-retriever\n", "11 - Labrador-retriever\n",
					 "12 - Nova-scotia-duck-tolling-retriever\n", 
					 "13 - Rough-collie\n", "14 - Smooth-collie "};
	    // Acceptable Monkey subSpecies for user input
	    String acceptableSubSpecies[] = {" 1 - Capuchin\n", "2 - Guenon\n", "3 - Macaque\n", 
	    									 "4 - Marmoset\n", "5 - Squirrel-Monkey\n",
	    									 "6 - Tamarin "}; 
	    // Created animal status list for assigning status (NOT IN USE)
	    String animalStatus[] = {"In-take", "Phase1", "Phase2", "Phase3",
	    							 "Phase4", "Phase5", "Inservice", "Farm"};
	    
	    // Created animal training location list for assigning location (NOT IN USE)
	    String animalTrainingLocation[] = {"1 - Chile\n", "2 - Greece\n", "3 - Japan\n",
	    									   "4 - Madagascar\n", "5 - Singapore\n", "6 - South-Korea\n",
	    									   "7 - Turkey\n", "8 - United-Kingdom\n", "9 - United-States\n"};
	    
	    // Created animal acquisition source list for assigning source
	    String animalAcquisitionSource[] = {"1 - Breeder", "2 - Animal-Shelter"};

	    
		// Created menu for selection	
		String intakeMenu = "-------------------------------------------------------------\n"
						  + "|                 *** Select An Option ***                  |\n"
						  + "-------------------------------------------------------------\n"
						  + "| 1 - In-take Dog                                            |\n"
						  + "| 2 - In-take Monkey                                         |\n"
						  + "| 3 - Quit                                                  |\n"
						  + "-------------------------------------------------------------";
		// Displays in-take greeting
		System.out.println("-------------------------------------------------------------\n"
				 		 + "|         *** Welcome to Rescue Animal In-take ***           |\n"
				 		 + "-------------------------------------------------------------\n");
				// Displays in-take menu
		    	System.out.println(intakeMenu);
		    	// Taking keyboard input
		    	int userInput = scnr.nextInt();
		    	// while loop to allow for selecting a animal and quitting in-take
		    	while (userInput != 3) {
		    		// Nested while loop for exception handling
		    		while (userInput > 3 || userInput < 1) {
		    			System.out.println("-------------------------------------------------------------\n"
   							 			 + "|                 *** Invalid Selection ***                 |\n"
   							 			 + "-------------------------------------------------------------\n");
		    			System.out.println(intakeMenu);
		    			userInput = scnr.nextInt();
		    		}		    		
		    		
		    		if (userInput == 1) {		    			
		    			// Created New Dog
		    			RescueAnimal animal1 = new Dog(type, name, gender, age, weight, acquisitionDate, statusDate, acquisitionSource, reserved, trainingLocation,
		    					trainingStart, trainingStatus, inServiceCountry, inServiceCity, inServiceAgency, inServicePOC, inServiceEmail,
		    					inServicePhone, inServicePostalAddress);		    			
		    			// Setting type
		    			animal1.setType("Dog");		    			
		    			// Directs user to select from list
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|              *** Select Breed From List ***               |\n"
		    							 + "-------------------------------------------------------------\n");
		    			// Prints acceptable breeds list[]
						System.out.println(Arrays.toString(acceptableBreeds));
						System.out.println("");						
						// Taking keyboard input
		    			int selection = scnr.nextInt();
		    			// While loop to set breed according to keyboard input
		    			while (selection > 0 || selection < 15) {
		    				if (selection == 1) {
		    					((Dog) animal1).setBreed("American-pit-bull-terrier");
		    				}
		    				if (selection == 2) {
		    					((Dog) animal1).setBreed("Beagle");
		    				}
		    				if (selection == 3) {
		    					((Dog) animal1).setBreed("Belgian-Malinois");
		    				}
		    				if (selection == 4) {
		    					((Dog) animal1).setBreed("Border-collie");
		    				}
		    				if (selection == 5) {
		    					((Dog) animal1).setBreed("Bloodhound");
		    				}
		    				if (selection == 6) {
		    					((Dog) animal1).setBreed("Coonhound");
		    				}
		    				if (selection == 7) {
		    					((Dog) animal1).setBreed("English-springer-spaniel");
		    				}
		    				if (selection == 8) {
		    					((Dog) animal1).setBreed("German sheperd");
		    				}
		    				if (selection == 9) {
		    					((Dog) animal1).setBreed("German-shorthaired-pointer");
		    				}
		    				if (selection == 10) {
		    					((Dog) animal1).setBreed("Golden-retriever");
		    				}
		    				if (selection == 11) {
		    					((Dog) animal1).setBreed("Labrador-retriever");
		    				}
		    				if (selection == 12) {
		    					((Dog) animal1).setBreed("Nova-scotia-duck-tolling-retriever");
		    				}
		    				if (selection == 13) {
		    					((Dog) animal1).setBreed("Rough-collie");
		    				}
		    				if (selection == 14) {
		    					((Dog) animal1).setBreed("Smooth-collie");
		    				}
		    				
		    				break;
		    			}
		    			// Directs user to enter name
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|                  *** Enter Dog Name ***                   |\n"
		    							 + "-------------------------------------------------------------\n");
		    			// Taking keyboard input
		    			String dogName = scnr.next();
		    			// Setting dog name from keyboard input
		    			animal1.setName(dogName);		    			
		    			// Directs user to enter gender
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|                 *** Enter Dog Gender ***                  |\n"
		    							 + "-------------------------------------------------------------\n");
		    			// Taking keyboard input
		    			String dogGender =scnr.next();
		    			// Setting dog gender from keyboard input
		    			animal1.setGender(dogGender);		    			
		    			//Directing user to enter age
		    			System.out.println("-------------------------------------------------------------\n"
   							 			 + "|                   *** Enter Dog Age ***                   |\n"
   							 			 + "-------------------------------------------------------------\n");
		    			// Taking keyboard input  
		    			int dogAge = scnr.nextInt();
		    			// Setting dog age from keyboard input
		    			animal1.setAge(dogAge);		    			
		    			// Directs user to enter weight
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|                  *** Enter Dog Weight ***                   |\n"
		    							 + "-------------------------------------------------------------\n");
		    			// Taking keyboard input
		    			float dogWeight = scnr.nextFloat();
		    			// Setting dog weight from keyboard input
		    			animal1.setWeight(dogWeight);
		    			// Directs user select acquisition source from list[]
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|             *** Select Acquisition Source ***             |\n"
		    							 + "-------------------------------------------------------------\n");
		    			// Displays acceptable breed list
		    			System.out.println(Arrays.toString(animalAcquisitionSource));
		    			System.out.println("");
		    			// Taking keyboard input
		    			int input = scnr.nextInt();
		    			// While loop to set acquisition source
		    			while (input > 0 || input < 3) {
		    				if (input == 1) {
		    					animal1.setAcquisitionSource("Breeder");
		    				}
		    				if (input == 2) {
		    					animal1.setAcquisitionSource("Shelter");
		    				}
		    				break;
		    			}
		    			
		    			// Setting status to in-take (Maybe should change trainingStatus in RescueAnimal from "null" to "in-take" for the default)
		    			animal1.setTrainingStatus("In-take");		    			
		    			// Setting reserved status to false
		    			animal1.setReserved(false);		    			
		    			// Directs user to enter date of acquisition
		    			System.out.println("-------------------------------------------------------------\n"
   							 			 + "|     *** Enter the date of acquisition (MM/dd/yyyy) ***    |\n"
   							 			 + "-------------------------------------------------------------\n");
		    			String expectedPattern = "MM/dd/yyyy";
		    			SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
		    			String userInput1 = scnr.next();
		    			Date date;
						try {
							date = formatter.parse(userInput1);
							animal1.setAcquisitionDate(date);						
						} catch (ParseException e) {
							
							e.printStackTrace();							
						}
		    			// Adding animal to animal array list
		    			animalArray.add(0, animal1);
		    			// Print statements to verify variable values
		    			System.out.println("");
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|    *** Displays dog added too animals array list[] ***    |\n"
		    							 + "-------------------------------------------------------------\n");
		    			System.out.println(animalArray);
		    			System.out.println("");
		    			System.out.println("Displays dog in Dog class: ");
		    			System.out.println(animal1);
		    			System.out.println("");
		    			System.out.println("-------------------------------------------------------------\n"
   							 			 + "|                     *** Dog Info ***                      |\n"
   							 			 + "-------------------------------------------------------------");
		    			System.out.println("Name: " + ((Dog) animal1).getName());
		    			System.out.println("Type: " + ((Dog) animal1).getType());
		    			System.out.println("Gender: " + ((Dog) animal1).getGender());
		    			System.out.println("Age: " + ((Dog) animal1).getAge());
		    			System.out.println("Weight: " + ((Dog) animal1).getWeight());
		    			System.out.println("Breed: " + ((Dog) animal1).getBreed());
		    			System.out.println("Acquisition Date: " + ((Dog) animal1).getAcquisitionDate());
		    			System.out.println("Acquisition Source: " + ((Dog) animal1).getAcquisitionSource());
		    			System.out.println("Training Status: " + ((Dog) animal1).getTrainingStatus());		    			
		    			//
		    			System.out.println("Reserved: " + reserved);		    			
		    			//
		    			System.out.println("-------------------------------------------------------------\n"
   							 			 + "|     *** Would You Like To Intake Another Animal? ***      |\n"
   							 			 + "-------------------------------------------------------------\n");
			        	String additionMenu = "-------------------------------------------------------------\n"
			        						+ "|                 *** Select An Option ***                  |\n"
			        						+ "-------------------------------------------------------------\n"
			        						+ "| 1 - Intake                                                |\n"
			        						+ "| 2 - Quit                                                  |\n"        						
			        						+ "-------------------------------------------------------------";
			        	
			        	//
			        	System.out.print(additionMenu);
			        	System.out.println("");
			        	int userChoice = scnr.nextInt();
			        	//
			        	if (userChoice == 1) {
			        		rescueAnimalIntake(animalArray);
			        	}			        	
			        	else {
			        		break;			            	
			        	}
		    			break;
		    		}		    		
		    		// COMMENTS FOR MONKEY MIRROR DOG WITH THE EXCEPTION OF EXTRA MONKEY VARIABLES
		    		if (userInput == 2) {
		    			
		    			// Created New Monkey
		    			RescueAnimal animal2 = new Monkey(type, name, gender, age, weight, acquisitionDate, statusDate, acquisitionSource, reserved, trainingLocation,
		    					trainingStart, trainingStatus, inServiceCountry, inServiceCity, inServiceAgency, inServicePOC, inServiceEmail,
		    					inServicePhone, inServicePostalAddress);
		    			//
		    			animal2.setType("Monkey");		    			
		    			//
		    			System.out.println("-------------------------------------------------------------\n"
   							 			 + "|           *** Select Sub Species From List ***            |\n"
   							 			 + "-------------------------------------------------------------\n");
						System.out.println(Arrays.toString(acceptableSubSpecies));
		    			int choice = scnr.nextInt();		    			
		    			//
		    			while (choice > 0 || choice < 7) {
		    				if (choice == 1) {
		    					((Monkey) animal2).setSubSpecies("Capuchin");
		    				}
		    				if (choice == 2) {
		    					((Monkey) animal2).setSubSpecies("Guenon");
		    				}
		    				if (choice == 3) {
		    					((Monkey) animal2).setSubSpecies("Macaque");
		    				}
		    				if (choice == 4) {
		    					((Monkey) animal2).setSubSpecies("Marmoset");
		    				}
		    				if (choice == 5) {
		    					((Monkey) animal2).setSubSpecies("Squirrel Monkey");
		    				}
		    				if (choice == 6) {
		    					((Monkey) animal2).setSubSpecies("Tamarin");
		    				}
		    				break;
		    			}		    			
		    			//
		    			System.out.println("Enter the monkeys name");
		    			String monkeyName = scnr.next();
		    			animal2.setName(monkeyName);		    			
		    			//
		    			System.out.println("Enter the monkeys gender");
		    			String monkeyGender = scnr.next();
		    			animal2.setGender(monkeyGender);		    			
		    			//
		    			System.out.println("Enter the monkeys age");
		    			int monkeyAge = scnr.nextInt();
		    			animal2.setAge(monkeyAge);
		    			//
		    			System.out.println("Enter the monkeys weight");
		    			float monkeyWeight = scnr.nextFloat();
		    			animal2.setWeight(monkeyWeight);		    			
		    			//
		    			System.out.println("Enter the monkeys tail length");
		    			float monkeyTaiLength= scnr.nextFloat();
		    			((Monkey) animal2).setTailLength(monkeyTaiLength);		    			
		    			//
		    			System.out.println("Enter the monkeys body height");
		    			float monkeyBodyHeight= scnr.nextFloat();
		    			((Monkey) animal2).setBodyHeight(monkeyBodyHeight);		    			
		    			//
		    			System.out.println("Enter the monkeys body length");
		    			float monkeyBodyLength= scnr.nextFloat();
		    			((Monkey) animal2).setBodyLength(monkeyBodyLength);
		    			//
		    			System.out.println("Enter the monkeys torso measurement");
		    			float monkeyTorsoMeasurement= scnr.nextFloat();
		    			((Monkey) animal2).setTorsoMeasurement(monkeyTorsoMeasurement);		    			
		    			//
		    			System.out.println("Enter the monkeys skull measurement");
		    			float monkeySkullMeasurement= scnr.nextFloat();
		    			((Monkey) animal2).setSkullMeasurement(monkeySkullMeasurement);		    			
		    			//
		    			System.out.println("Enter the monkeys neck measurement");
		    			float monkeyNeckMeasurement= scnr.nextFloat();
		    			((Monkey) animal2).setNeckMeasurement(monkeyNeckMeasurement);		    			
		    			//
		    			System.out.println("");
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|             *** Select Acquisition Source ***             |\n"
		    							 + "-------------------------------------------------------------\n");
		    			System.out.println(Arrays.toString(animalAcquisitionSource));
		    			System.out.println("");
		    			//
		    			int input = scnr.nextInt();
		    			//
		    			while (input > 0 || input < 3) {
		    				if (input == 1) {
		    					animal2.setAcquisitionSource("Breeder");
		    				}
		    				if (input == 2) {
		    					animal2.setAcquisitionSource("Shelter");
		    				}
		    				break;
		    			}		    			
		    			//
		    			animal2.setTrainingStatus("Intake");		    			
		    			//
		    			animal2.setReserved(false);			
		    			//
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|     *** Enter the date of acquisition (MM/dd/yyyy) ***    |\n"
		    							 + "-------------------------------------------------------------\n");
		    				String expectedPattern = "MM/dd/yyyy";
		    				SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
		    				String userInput1 = scnr.next();
		    				Date date;
		    				try {
		    					date = formatter.parse(userInput1);
		    					animal2.setAcquisitionDate(date);					
		    				} catch (ParseException e) {					
		    					e.printStackTrace();					
		    				}
		    			//
		    			animalArray.add(0, animal2);
		    			// Print statements to verify variable values
		    			System.out.println("");
		    			System.out.println("Displays monkey added too animals array list[]");
		    			System.out.println(animalArray);
		    			System.out.println("");
		    			System.out.println("Displays monkey in Monkey class");
		    			System.out.println(animal2);
		    			System.out.println("");
		    			System.out.println("-------------------------------------------------------------\n"
						 				 + "|                   *** Monkey Info ***                     |\n"
						 				 + "-------------------------------------------------------------");
		    			System.out.println("Name: " + animal2.getName());
		    			System.out.println("Type: " + animal2.getType());
		    			System.out.println("Gender: " + animal2.getGender());
		    			System.out.println("Age: " + animal2.getAge());
		    			System.out.println("Weight: " + animal2.getWeight());
		    			System.out.println("Species: " + ((Monkey) animal2).getSubSpecies());
		    			System.out.println("Tail Length: " + ((Monkey) animal2).getTailLength());
		    			System.out.println("Body Height: " + ((Monkey) animal2).getBodyHeight());
		    			System.out.println("Body Length: " + ((Monkey) animal2).getBodyLength());
		    			System.out.println("Torso Measurement: " + ((Monkey) animal2).getTorsoMeasurement());
		    			System.out.println("Skull Measurement: " + ((Monkey) animal2).getSkullMeasurement());
		    			System.out.println("Neck Measurement: " + ((Monkey) animal2).getNeckMeasurement());
		    			System.out.println("Acquisition Date: " + animal2.getAcquisitionDate());
		    			System.out.println("Acquisition Source: " + animal2.getAcquisitionSource());
		    			System.out.println("Training Status: " + animal2.getTrainingStatus());
		    			
		    			System.out.println("Reserved: " + reserved);
		    			
		    			System.out.println("-------------------------------------------------------------\n"
		    							 + "|     *** Would You Like To Intake Another Animal? ***      |\n"
		    							 + "-------------------------------------------------------------\n");
		    			// Prints menu
		    			String additionMenu = "-------------------------------------------------------------\n"
	        								+ "|                 *** Select An Option ***                  |\n"
	        								+ "-------------------------------------------------------------\n"
	        								+ "| 1 - Intake                                                |\n"
	        								+ "| 2 - Quit                                                  |\n"        						
	        								+ "-------------------------------------------------------------";
			        	// Prints menu
			        	System.out.print(additionMenu);
			        	int userChoice = scnr.nextInt();
			        	if (userChoice == 1) {
			        		rescueAnimalIntake(animalArray);
			        	}
			        	else {
			        		break;
			        	}
		    			break;
		    		}
		    		scnr.close();
		    	}
		    	return; 
	}
	// Method to process request for a rescue animal
	public static void rescueAnimalRequest() {
		System.out.println("FIXME IM A BROKEN METHOD!");
		return;
	}
	// Method(s) to update information on existing animals
	public static void updateRescueAnimal() {
		System.out.println("FIXME IM A BROKEN METHOD!");
		return;
	}
	// Method to display in-service animals
	public static void animalsInService() {
		System.out.println("FIXME IM A BROKEN METHOD!");
		return;
	}
	// Method to out process animals for the farm or in-service placement
	public static void rescueAnimalTransfer() {
		System.out.println("FIXME IM A BROKEN METHOD!");
    	return;
	}
    // Process reports from in-service agencies reporting death/retirement
	public static void rescueAnimalProcessing() {
    	System.out.println("FIXME IM A BROKEN METHOD!");
    	return;	
    }
    // Method to display matrix of animals based on location and status/training phase
	public static void rescueAnimalPhaseStatus() {
    	System.out.println("FIXME IM A BROKEN METHOD!");
    	return;
	}
}