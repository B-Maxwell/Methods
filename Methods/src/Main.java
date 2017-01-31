import java.util.Scanner;

/*
The section below will test the animal class  - constructors, setters, and getters
 */

//---------------------------------------------------------------------------------
public class Main {

    public static void main(String[] args) {

        //This will test the animal class
        Animal a1 = new Animal("Panda Bear", false, false, false);

        System.out.println("Constructor created parameters:");
        System.out.println("-------------------------------");

        //Display the initial parameters that were provided
        System.out.println("Species: \t\t" + a1.getSpecies() + "\nIs Poisonous?\t" + a1.getIsPoisonous() + "\nCan fly?\t\t" + a1.getCanFly() + "\nEndangered?\t\t" + a1.getIsEndangered());


        //This is test the getter and setter of the animal class
        a1.setSpecies("Cobra");
        a1.setPoisonous(true);
        a1.setCanFly(false);
        a1.setEndangered(false);

        //Display the parameters that were provided via setter & getter
        System.out.println("\n\nSetter & Getter created parameters:");
        System.out.println("-------------------------------");

        //Display the initial parameters that were provided
        System.out.println("Species: \t\t" + a1.getSpecies() + "\nIs Poisonous?\t" + a1.getIsPoisonous() + "\nCan fly?\t\t" + a1.getCanFly() + "\nEndangered?\t\t" + a1.getIsEndangered());


        //Collect user input for get and set
        Scanner in = new Scanner(System.in);

        System.out.println("\n\nPlease enter the species name:");
        a1.setSpecies(in.next());
        System.out.println("Is this species poisonous (true or false):");
        a1.setPoisonous(in.nextBoolean());
        System.out.println("Can this species fly (true or false):");
        a1.setCanFly(in.nextBoolean());
        System.out.println("Is this species endangered (true or false):");
        a1.setPoisonous(in.nextBoolean());


        //Display user generated parameters
        System.out.println("\n\nUser generated Setter & Getter parameters:");
        System.out.println("-------------------------------");

        //Display the initial parameters that were provided
        System.out.println("Species: \t\t" + a1.getSpecies() + "\nIs Poisonous?\t" + a1.getIsPoisonous() + "\nCan fly?\t\t" + a1.getCanFly() + "\nEndangered?\t\t" + a1.getIsEndangered());


    }
}
//---------------------------------------------------------------------------------
