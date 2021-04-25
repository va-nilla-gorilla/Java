// Package containing all associated classes
package petbag;

// Import statements here        
// Import statements here
// Import statements here

// Pet superclass         
public class Pet {
    
    // Pet specific attributes
    private String petType;     // Type of Pet
    private String petName;     // Name of the Pet
    private int petAge;         // Age of the Pet
    
    private int dogSpace;       // Space avail. for Dogs (30 Avail.) 
    // (LOGIC: dogSpace(0:29) = First through the last dogSpace)
    private int catSpace;       // Space avail. for Cats (12 Avail.) 
    // (LOGIC: catSpace(0:11) = First through the last catSpace)
    
    private int daysStay;       // Number of boarding days 
    private double amountDue;   // Final Amount due for boarding
    
    // Constructor to initialize dog and its attributes and methods
    public Pet(String petType, String petName, int petAge, int dogSpace,
            int catSpace, int daysStay, double amountDue) {
        // Initializing Pet variables with default values
        super();
        petType = "Null";
        petName = "Null";
        petAge = -1;
        dogSpace = -1;
        catSpace = -1;
        daysStay = -1;
        amountDue = -1.00;
    }
                                                                                
    // Accessor
    public String getPetType() {                    //REVIEW UML CLASS DIAGRAM
        return petType;                             //
    }
    // Mutator
    public void setPetType(String petType) {        //REVIEW UML CLASS DIAGRAM
        this.petType = petType;                     //
    }
    // Accessor
    public String getPetName() {                    //REVIEW UML CLASS DIAGRAM
        return petName;                             //
    }
    // Mutator
    public void setPetName(String petName) {        //REVIEW UML CLASS DIAGRAM
        this.petName = petName;                     //
    }
    // Accessor
    public int getPetAge() {                        //REVIEW UML CLASS DIAGRAM
        return petAge;                              //
    }
    // Mutator
    public void setPetAge(int petAge) {             //REVIEW UML CLASS DIAGRAM
        this.petAge = petAge;                       //
    }
    // Accessor
    public int getDogSpace() {                      //REVIEW UML CLASS DIAGRAM
        return dogSpace;                            //
    }
    // Mutator
    public void setDogSpace(int dogSpace) {         //REVIEW UML CLASS DIAGRAM
        this.dogSpace = dogSpace;                   //
    }
    // Accessor
    public int getCatSpace() {                      //REVIEW UML CLASS DIAGRAM
        return catSpace;                            //
    }
    // Mutator
    public void setCatSpace(int catSpace) {         //REVIEW UML CLASS DIAGRAM
        this.catSpace = catSpace;                   //
    }
    // Accessor
    public int getDaysStay() {                      //REVIEW UML CLASS DIAGRAM
        return daysStay;                            //
    }
    // Mutator
    public void setDaysStay(int daysStay) {         //REVIEW UML CLASS DIAGRAM
        this.daysStay = daysStay;                   //
    }
    // Accessor
    public double getAmountDue() {                  //REVIEW UML CLASS DIAGRAM
        return amountDue;                           //
    }
    // Mutator
    public void setAmountDue(double amountDue) {    //REVIEW UML CLASS DIAGRAM
        this.amountDue = amountDue;                 //
    }
    
    // STUBBED OUT METHOD FOR CHECKING IN PET
    public void checkIn(int daysStay, String petType) {
    ////////////////////////////IN PROGRESS////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    //////////////////REFER TO PSUEDOCODE & FLOWCHART//////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ////////////////////////////IN PROGRESS////////////////////////////////////
    /*
    
    String petTypeStatus = "Null";
    boolean groomingService = false;
    int lengthOfStay = 0;
    int numOfCatSpaces = 0;
    int numOfDogSpaces = 0;
    int maxNumOfCatSpaces = 12;
    int maxNumOfDogSpaces = 30;
    int[] catArray;
    catArray = new int[12];
    int[] dogArray;
    dogArray = new int[30];
    
    
    */       
    }
    
    // STUBBED OUT METHOD FOR CHECKING OUT PET
    public void checkOut() {
        /*
        * CODE LOGIC
        */
    }
    
    // STUBBED OUT METHOD FOR GETTING PET INFO
    public void getPet(String petType, String petName, int petAge) {
        /*
        * CODE LOGIC
        */
    }
    
    // STUBBED OUT METHOD FOR CREATING NEW PET
    public void createPet(String petType, String petName, int petAge) {
        /*
        * CODE LOGIC
        */
    }
    
    // STUBBED OUT METHOD FOR UPDATING PET
    public void updatePet(String petType, String petName, int petAge) {
        /*
        * CODE LOGIC
        */
    }  
}

  