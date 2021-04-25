// Package containing all associated classes
package DogApp;

// Import statements here  
// Import statements here  
// Import statements here  


// Subclass Driver 
public class Driver {

    // Main class for DogApp package
    public static void main(String[] args) {
        
        
        // Dog Data
        Corgi corgi = new Corgi("cattle herding", "Pembroke Welsh Corgi", "Java",
        38,5);
        
        corgi.setTopTrick("ringing the bell to go outside");
        
        System.out.println(corgi.toString());
    }
}
