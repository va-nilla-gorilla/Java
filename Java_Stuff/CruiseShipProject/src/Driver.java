/***
 * Description: Project 3
 * Description: Complete printShipList("Active") Method
 * Description: Complete addShip() Method
 * Description: Complete addCruise Method
 * Description: Complete main() Method
 * Description:
 * 
 * Class: IT145
 * Author: Uriah L. Fadum
 * Professor: Joe L. Parker
 * Date: 12/13/2020
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    // instance variables
    private static ArrayList<Ship> shipList = new ArrayList<Ship>();
    private static ArrayList<Cruise> cruiseList = new ArrayList<Cruise>();
    private static ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
	private static Scanner newShipInput;
	private static Scanner newCruiseInput;
	private static Scanner newPassengerInput;
	private static Scanner scnr;

    public static void main(String[] args) {

        initializeShipList();       // initial ships
        initializeCruiseList();     // initial cruises
        initializePassengerList();  // initial passengers

        	
        	scnr = new Scanner(System.in);
            String menuSelection = "";
            // Loop that accepts and validates user input
            do {
            	displayMenu();
            	menuSelection = scnr.next().toUpperCase();
            	
            	switch (menuSelection) {
         	   	case "1": addShip(shipList); break;
       	   		case "2": editShip(); break;
       	   		case "3": addCruise(cruiseList); break;
       	   		case "4": editCruise(); break;
       	   		case "5": addPassenger(passengerList); break;
       	   		case "6": editPassenger(); break;
       	   		case "A": printShipList("name"); break;
       	   		case "B": printShipList("active"); break;
       	   		case "C": printShipList("full"); break;
       	   		case "D": printCruiseList("list"); break;
       	   		case "E": printCruiseList("details"); break;
       	   		case "F": printPassengerList(); break;
       	   		case "X": System.out.print("\nExiting application...\n" 
       	   				+ "\n" 
       	   				+ "Have a nice day!\n"); 
       	   				  System.exit(0);
       	   		default: System.out.println("Invalid entry. Please try again...\n");
         	   	}
            } while (menuSelection != "X");
    }       
    // Edited due to the creation of add2ShipList method
    // hard coded ship data for testing
    // Initialize ship list
    public static void initializeShipList() {
        add2ShipList("Candy Cane", 20, 40, 10, 60, true);
        add2ShipList("Peppermint Stick", 10, 20, 5, 40, true);
        add2ShipList("Bon Bon", 12, 18, 2, 24, false);
        add2ShipList("Candy Corn", 12, 18, 2, 24, false);
    }
    // Edited due to the creation of add2CruiseList method
    // hard coded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
    	add2CruiseList("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
    }
    // Edited due to the creation of add2PassengerList method
    // hard coded cruise data for testing
    // Initialize passenger list
    public static void initializePassengerList() {
        add2PassengerList("Neo Anderson", "Southern Swirl", "STE");
        add2PassengerList("Trinity", "Southern Swirl", "STE");
        add2PassengerList("Morpheus", "Southern Swirl", "BAL");       
    }
    // custom method to add ships to the shipList ArrayList
    public static void add2ShipList(String tName, int tBalcony, int tOceanView,
                           int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }   
    // Created custom method to add cruises to the cruiseList ArrayList
    public static void add2CruiseList(String tCruiseName, String tShipName, String tDeparture,
    							 String tDestination, String tReturn) {
    	Cruise newCruise = new Cruise(tCruiseName, tShipName, tDeparture, tDestination, tReturn);
    	cruiseList.add(newCruise);
    }   
    // Created custom menu to add passengers to the passengerList ArrayList
    public static void add2PassengerList(String pName, String pCruise, String pRoomType) {
    	Passenger newPassenger = new Passenger(pName, pCruise, pRoomType);
    	passengerList.add(newPassenger);
    } 
    // Print ship list method
    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships
        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") {
            System.out.println("\n\nSHIP LIST - Active");
            
            // Iterate through the ship list to get in-service ships
            for (int i = 0; i < shipList.size(); i++) {					
                if (shipList.get(i).getInService() == true) {
                	System.out.println(shipList.get(i).getShipName());                
                }
            } 
        } else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();
        } else
            System.out.println("\n\nError: List type not defined.");
    }
    // Print cruise list method
    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("----------------------------------------"
            		+ "--------------------------------------------------");
            System.out.println("                                      "
            		+ "|----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           "
            		+ "DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n---------------------------------------"
            		+ "--------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
    }   
    // Print passenger list method
    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }
    // display text-based menu
    // Edited print statements to reflect proper menu layout when displayed
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t    Luxury Ocean Cruise Outings");					
        System.out.println("\t\t    System Menu\n");								
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[X] Exit System");										
        System.out.println("\nEnter a menu selection: ");
    }
    // Add ship method
    public static void addShip(ArrayList<Ship> shipList) {   	
    	// Try - Catch block to validate user input and handle 
    	// InputMismatchExceptions when adding rooms & setting
    	// ship in-service selection   	
    	try {
    		newShipInput = new Scanner(System.in);
            System.out.println("Enter the new ship's name: ");
            String newShipName = newShipInput.nextLine();
            // ensure new ship name does not already exist
            for (Ship eachShip: shipList) {           	
                if (eachShip.getShipName().equalsIgnoreCase(newShipName)) {
                    System.out.println("That ship is already in the system. Exiting to menu...\n");
                    return; // quits addShip() method processing
                }
            }           
            // get number of balcony rooms
            System.out.println("Enter number of balcony rooms (BAL): ");
            int balconyRooms = newShipInput.nextInt();
            // Condition to handle negative integer input
            if (balconyRooms < 0) {
            	System.out.println("Invalid entry. Exiting to menu...\n");
            	return;
            }
            // get number of ocean view rooms
            System.out.println("Enter number of ocean view rooms (OV): ");
            int oceanViewRooms = newShipInput.nextInt();
            // Condition to handle negative integer input
            if (oceanViewRooms < 0) {
            	System.out.println("Invalid entry. Exiting to menu...\n");
            	return;
            }
            // get number of suite rooms
            System.out.println("Enter number of suite rooms (STE): ");
            int suiteRooms = newShipInput.nextInt();
            // Condition to handle negative integer input
            if (suiteRooms < 0) {
            	System.out.println("Invalid entry. Exiting to menu...\n");
            	return;
            }           
            // get number of interior rooms
            System.out.println("Enter number of interior rooms (INT): ");
            int interiorRooms = newShipInput.nextInt();
            // Condition to handle negative integer input
            if (interiorRooms < 0) {
            	System.out.println("Invalid entry. Exiting to menu...\n");
            	return;
            }
            // Option to place ship in service
            System.out.println("Is the ship in-service?\n"
            					+ "1 - Yes\n"
            					+ "2 - No\n");
            int inService = newShipInput.nextInt();
            boolean shipInService = false;
            // Condition to set shipInService and handle incorrect input
            if (inService == 1) {
            	System.out.println("Placing ship in-service.");
            	shipInService = true;
            }
            else if (inService == 2) {
            	System.out.println("Placing ship not in-service.");
            	shipInService = false;
            }
            else {
            	System.out.println("Invalid Entry. Placing ship in default: Not in-service");
            	shipInService = false;
            }
            // If all verifications passed then add ship to array list via custom method
            add2ShipList(newShipName, balconyRooms, oceanViewRooms, suiteRooms, interiorRooms, shipInService);
    	}catch (InputMismatchException e) {
    		System.out.println("Invalid entry. Exiting to menu...\n");
    	}   
    } 
    // Edit an existing ship
    public static void editShip() {  	
        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.\n");
    }     
    // Add cruise method
    public static void addCruise(ArrayList<Cruise> cruiseList) {
    	
    		newCruiseInput = new Scanner(System.in);
            System.out.println("Enter the new cruise's name: ");
            String newCruiseName = newCruiseInput.nextLine();
            // ensure new cruise name does not already exist
            for (Cruise eachCruise: cruiseList) {
                if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
                    System.out.println("That cruise is already in the system. Exiting to menu...\n");
                    return; // quits addCruise() method processing
                }
            }
            // Enter cruise ship name
            System.out.println("Enter the cruise ship name: ");
            String newCruiseShipName = newCruiseInput.nextLine();
            // Verification to check if ship is in service.
            for (Ship eachShip: shipList) {
            	if (eachShip.getShipName().equalsIgnoreCase(newCruiseShipName)
            		&& eachShip.getInService() == true) {           		
            		// Verification to check if ship is already assigned to a cruise
            		for (Cruise eachCruise: cruiseList) {
            			if (eachCruise.getCruiseShipName().equalsIgnoreCase(newCruiseShipName)) {            				
            				// Exits to main menu if ship is already 
            				// in-service & assigned to different cruise
                    		System.out.println("Ship already in service with different cruise.\n"); 
                			System.out.println("Exiting to main menu.\n");
                			return;	
            			}
            			else {
            				break; // Breaks out of nested verification loop
            			}
            		}	
            	}
            	// Verification to check if ship is not in service
            	else if (eachShip.getShipName().equalsIgnoreCase(newCruiseShipName)
            			 && eachShip.getInService() == false) {
            		// Automatically places ship into service if not in-service
            		System.out.println("Ship is now placed in service.");
            		eachShip.setInService(true);
            		System.out.println("\n");break;	
            	}
            }
            // Enter departure port									
            System.out.println("Enter the departure port: ");		
            String newDeparturePort = newCruiseInput.nextLine();	// Could auto-capitalize first letter of port city
            // Enter destination port
            System.out.println("Enter the destination: ");			
            String newDestination = newCruiseInput.nextLine();		// Could auto-capitalize first letter of port city            
            // Enter return port
            System.out.println("Enter the return port: ");			
            String newReturnPort = newCruiseInput.nextLine();		// Could auto-capitalize first letter of port city           
            // Verification of valid ports using custom method 
            // If all verifications pass then cruise is added too cruise array list
            if (isValidPort(newDeparturePort) == true && isValidPort(newDestination) == true 
            	&& isValidPort(newReturnPort) == true) {
            	add2CruiseList(newCruiseName, newCruiseShipName, newDeparturePort, newDestination,
                		newReturnPort);
            }            
            else if (isValidPort(newDeparturePort) == false || isValidPort(newDestination) == false
                	|| isValidPort(newReturnPort) == false) {
            	System.out.println("\nInvalid input.");
            	System.out.println("\nCruise not added. Exiting to main menu...");
            }            	
    }   
    // Edit an existing cruise
    public static void editCruise() {
        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");
    }  
    // Add a New Passenger
    public static void addPassenger(ArrayList<Passenger> passengerList) {

        newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = newPassengerInput.nextLine();			// Could auto-capitalize first letter of name
        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }
        // get cruise name for passenger
        System.out.println("Enter cruise name: ");
        String newCruiseName = newPassengerInput.nextLine();			// Could auto-capitalize first letter of cruise
        
        // ensure cruise exists
        boolean foundCruise = false;
        for (Cruise eachCruise: cruiseList) {
            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
                 foundCruise = true;
                 break;
            }
        }
       
        if (foundCruise != true) {
            System.out.println("That cruise does not exist in the system. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
        // Get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT): ");
        String room = newPassengerInput.nextLine();
        // Validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
        	// Validate passenger name
        	if (isValidName(newPassengerName) == true) {
        		// If all validation passed - add passenger
            	// Edited due to the creation of add2Passenger list method
                add2PassengerList(newPassengerName, newCruiseName, room.toUpperCase());	
        	}
        	else if (isValidName(newPassengerName) != true) {
        		System.out.println("Invalid input.");
        		System.out.println("Passenger not added. Exiting to menu...");
        		return; // quits addPassenger() method processing
        	}           
        } 
        else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }   
    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");
    }
    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }   
    // Custom method to verify city using regular expression
    // Still working on making the regex pattern more precise
    public static boolean isValidPort(String port) {
    	return port.matches("^([a-zA-Z\\u0080-\\u024F]+(?:(\\. )|-| |'))*[a-zA-Z\\u0080-\\u024F]*$");   	
    }
    // Custom method to verify names using regular expression
    // Still working on making the regex pattern more precise
    public static boolean isValidName(String name) {
    	return name.matches("^[\\p{L}\\s.’\\-,]+$");
    }

}