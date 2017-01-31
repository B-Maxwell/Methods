/**
 * Created by Ben Maxwell on 1/31/17.
 * Established constructor, setters, and getters for this class
 */
public class Animal {

    private String species;
    private boolean isPoisonous;
    private boolean canFly;
    private boolean isEndangered;

    //This is the constructor for the animal class
    public Animal(String species, boolean isPoisonous, boolean canFly, boolean isEndangered) {
        this.species = species;
        this.isPoisonous = isPoisonous;
        this.canFly = canFly;
        this.isEndangered = isEndangered;
    }

    //This sets the animal species
    public void setSpecies(String species) {
        if (species != null) {
            this.species = species;

        } else {

            System.out.println("Please enter a species name!");

        }
    }


    //This gets the animal species
    public String getSpecies() {
        return species;
    }

    //This sets the poison indicator
    public void setPoisonous(boolean poisonous) {

        if (isPoisonous != true && isPoisonous != false) {

            System.out.println("Please enter true or false");

        } else {

            this.isPoisonous = poisonous;

        }
    }

    //This gets the poison indicator
    public boolean getIsPoisonous() {
        return isPoisonous;
    }

    //This sets the flight indicator
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    //This gets the flight indicator
    public boolean getCanFly() {
        return canFly;
    }

    //This sets the endangered indicator
    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    //This gets the endangered indicator
    public boolean getIsEndangered() {
        return isEndangered;
    }


    public static void main(String[] args) {

    }

}




