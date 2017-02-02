import java.util.Scanner;

/**
 * Created by Ben Maxwell on 2/1/17.
 * This class mimics the basic ATM project
 *
 */
public class ATM {

    String name;
    Scanner input = new Scanner(System.in);

    //Ask the user to enter their name
    void enterName() throws Exception {

        System.out.println("Please enter your name: ");
        name = input.nextLine();

        if (name.isEmpty()) {
            throw new Exception("Please enter a name! Input cannot be blank");
        } else {
            System.out.println("\nWelcome, " + name + "!");
        }
    }

    //Ask user to enter an option
    void enterChoice() throws Exception {

        System.out.println("\nHow can we serve you today? (Please select an option 1 -3) \n1. Check Balance \n2. Withdraw Funds \n3. Cancel");
        int option = input.nextInt();

        switch (option) {

            case 1: //Checks Balance
                System.out.println("Your current balance is $100");
                break;

            case 2: //Makes withdrawal
                System.out.println("\nHow much would you like to withdraw?");
                int funds = input.nextInt();

                if (funds > 100) {
                    System.out.println("Sorry, you currently do not enough funds to withdraw that amount.");
                } else {
                    System.out.println("\nPlease take your funds from the machine.");
                }

                break;

            case 3: //Exits session
                System.out.println("\nThank you" + name + ". Please come again!");
                break;

            default: //Throws exception
                throw new Exception("\nInvalid option. Please select an option 1 - 3");
        }


    }


}


