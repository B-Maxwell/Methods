import java.util.Scanner;

/**
 * Created by Ben Maxwell on 2/1/17.
 * This is an enhanced version of the ATM project
 *
 */
public class EnhancedATM {

    String name;
    int balance = 100;
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


    void enterChoice() throws Exception {
        System.out.println("\nHow can we serve you today? (Please select an option 1 - 4) \n1. Check Balance \n2. Withdraw Funds \n3. Deposit Funds \n4. Cancel");
        int option = input.nextInt();

        switch (option) {

            case 1: //Displays balance
                System.out.println("\nYour current balance is " + balance);
                anotherTrans();
                break;

            case 2:
                makeWithdrawal();
                break;

            case 3:
                makeDeposit();
                break;

            case 4: //Exits session
                System.out.println("\nThank you " + name + ". Please come again!");
                break;

            default:
                throw new Exception("\nInvalid option. Please select an option 1 - 4");
        }
    }



    void makeWithdrawal() throws Exception {
        System.out.println("\nYour current balance is $" + balance + ". How much would you like to withdraw?");
        int funds = input.nextInt();
        balance -= funds;

        if (funds > balance) {
            System.out.println("\nSorry, you currently do not enough funds to withdraw that amount.");
        } else {
            System.out.println("\nPlease take your funds from the machine. You new balance is $" + balance);
        }

        anotherTrans();

    }

    void makeDeposit() throws Exception {
        System.out.println("\nYour current balance is $" + balance + ". How much would you like to deposit?");
        int funds = input.nextInt();
        balance += funds;
            System.out.println("\nYou new balance is $" + balance);

            anotherTrans();
    }

    void anotherTrans() throws Exception {
        System.out.println("\nWould you like to make an additional transaction? Y/N");
        String choice = input.next();

        if (choice.toUpperCase().equals("Y")) {

            enterChoice();

        } else {

            System.out.println("\nThank you " + name + ". Please come again!");
        }

    }

}

















