package DogApp;

public class Corgi extends Dog {

    // additional instance variables
    int weight;
    int age;


    // constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // invoke Dog class (super class) constructor
        super(type, breed, name);
        weight = pounds;
        age = years;
    }

    // mutator methods
    public void setWeight(int pounds) {
        weight = pounds;
    }
    
    public void setAge(int years) {
        years = age;
    }


    // override toString() method to include additional dog information
    @Override
    public String toString() {
        return (super.toString() + "\nThe Corgi is " + age +
                " years old and weighs " + weight + " pounds.");
    }

}
