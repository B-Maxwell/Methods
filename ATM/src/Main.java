public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello welcome to th World Bank!");
        System.out.println("-------------------------------");

        EnhancedATM user = new EnhancedATM(); //Creates an ATM User

        user.enterName();   //Ask user for name
        user.enterChoice(); //Ask user to enter an option

    }
}
