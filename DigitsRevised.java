import java.util.*;
public class DigitsRevised {
    public static void main(String[] args){

        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your three digit number: ");
        number = input.nextInt();
        input.close();

        int hundreds = (number - (number%100))/100;
        int tens = (number%100-number%10)/10;
        int ones = number%10;

        

        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The ones digit is: " + ones);
    }
}