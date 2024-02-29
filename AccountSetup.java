import java.util.*;
public class AccountSetup {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name:\t");
        String name = input.nextLine();

        System.out.print("Enter your password:\t");
        String password = input.nextLine();

        input.close();

        System.out.println("Your name is " + name);
        System.out.println("Your password is " + password);

    }
}
