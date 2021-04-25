package DogApp;

public class Dog {

    // instance variables
    private String type;
    private String breed;
    private String name;
    private String topTrick;
    
    // constructor
    public Dog (String type, String breed, String name) {
        this.type = type;
        this.breed = breed;
        this.name = name;    
    }

    // methods
    public void setTopTrick(String trick) {
        topTrick = trick;
    }
    


    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is: " +
                topTrick + ".";
        return temp;
    }

}
