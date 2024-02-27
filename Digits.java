public class Digits {
    public static void main(String[] args){
        int number;
        number = 526;
        int hundreds = (number - (number%100))/100;
        int tens = (number%100-number%10)/10;
        int ones = number%10;

        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The ones digit is: " + ones);
    }
}
