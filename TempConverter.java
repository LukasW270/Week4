import java.util.*;
public class TempConverter {
    public static void main(String[] args){
        double fahrenheitTemp;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit temperature: ");
        fahrenheitTemp = input.nextDouble();

        input.close();

        double celsiusTemp = (fahrenheitTemp-32)*5/9;

        System.out.println("The Celsius temperature is " + celsiusTemp);
    }
}
