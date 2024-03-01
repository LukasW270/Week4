import java.util.*;
public class DivAndMod {
    public static void main(String[] args){
        int integer1;
        int integer2;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        integer1 = input.nextInt();
        
        System.out.print("Enter a second integer: ");
        integer2 = input.nextInt();
        
        input.close();

        double division = integer1*1.0/integer2;
        double mod = integer1%integer2;

        double division2 = integer2*1.0/integer1;
        double mod2 = integer2%integer1;

        System.out.println("");

        System.out.println(integer1 + " / " + integer2 + " = " + division);
        System.out.println(integer1 + " % " + integer2 + " = " + mod);

        System.out.println("");

        System.out.println(integer2 + " / " + integer1 + " = " + division2);
        System.out.println(integer2 + " % " + integer1 + " = " + mod2);


    }
}
