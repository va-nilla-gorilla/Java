// Package containing all associated classes
package petbag;

// Import statements here
// Import statements here
// Import statements here

// Extending the Pet superclass to include a subclass Cat
public class Cat extends Pet {
    // Cat specific instance variables/attributes
    private int catSpaceNbr;
    private double catWeight;
    
    // Constructor to initialize dog and its attributes and methods
    public Cat(String petType, String petName, int petAge, int dogSpace,
                int catSpace, int daysStay, double amountDue) {
        
        // Calling Pet superclass attributes
        super(petType, petName, petAge, dogSpace,
                catSpace, daysStay, amountDue);
               
        // Initializing Cat variables with default values
        catSpaceNbr = -1;
        catWeight = -1.00;
    }
    // Accessor
    public int getCatSpaceNbr() {                   //REVIEW UML CLASS DIAGRAM
        return catSpaceNbr;                         //
    }
    // Mutator
    public void setCatSpaceNbr(int catSpaceNbr) {   //REVIEW UML CLASS DIAGRAM
        this.catSpaceNbr = catSpaceNbr;             //
    }
    // Accessor
    public double getCatWeight() {                  //REVIEW UML CLASS DIAGRAM
        return catWeight;                           //
    }
    // Mutator
    public void setCatWeight(double catWeight) {    //REVIEW UML CLASS DIAGRAM
        this.catWeight = catWeight;                 //
    }   
}
