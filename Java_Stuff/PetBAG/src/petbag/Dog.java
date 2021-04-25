// Package containing all associated classes
package petbag;

// Import statements here        
// Import statements here
// Import statements here

// Extending the Pet superclass to include a subclass Dog
public class Dog extends Pet {
    // Dog specific instance variables/attributes
    private int dogSpaceNbr;
    private double dogWeight;
    private String grooming;
                                                                                                    
    // Constructor to initialize dog and its attributes and methods
    public Dog(String petType, String petName, int petAge, int dogSpace,
               int catSpace, int daysStay, double amountDue) {
        // Calling Pet superclass attributes
        super(petType, petName, petAge, dogSpace, 
              catSpace, daysStay, amountDue);
        // Instance variable default values
        dogSpaceNbr = -1;
        dogWeight = -1;
        grooming = "Null";
    }
    
    // Accessor
    public int getDogSpaceNbr() {                   //REVIEW UML CLASS DIAGRAM 
        return dogSpaceNbr;                         //
    }
    
    // Mutator
    public void setDogSpaceNbr(int dogSpaceNbr) {   //REVIEW UML CLASS DIAGRAM 
        this.dogSpaceNbr = dogSpaceNbr;             //
    }
    
    // Accessor
    public double getDogWeight() {                  //REVIEW UML CLASS DIAGRAM 
        return dogWeight;                           //
    }
    
    // Mutator
    public void setDogWeight(double dogWeight) {    //REVIEW UML CLASS DIAGRAM 
        this.dogWeight = dogWeight;                 //
    }
    
    // Accessor
    public String getGrooming() {                   //REVIEW UML CLASS DIAGRAM 
        return grooming;                            //
    }
    
    // Mutator
    public String setGrooming(String grooming) {    //REVIEW UML CLASS DIAGRAM
        return grooming;                            // 
    }
}

