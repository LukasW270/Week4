import java.util.*;
public class GradeAvg {
    public static void main(String[] args){
        double grade1;
        double grade2;
        double grade3;
        double grade4;
        double grade5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade 1: ");
        grade1 = input.nextDouble();

        System.out.print("Enter grade 2: ");
        grade2 = input.nextDouble();

        System.out.print("Enter grade 3: ");
        grade3 = input.nextDouble();

        System.out.print("Enter grade 4: ");
        grade4 = input.nextDouble();

        System.out.print("Enter grade 5: ");
        grade5 = input.nextDouble();
        System.out.println("");

        input.close();

        double gradeTotal = (grade1 + grade2 + grade3 + grade4 + grade5);
        double gradeAverage = gradeTotal/5;

        System.out.println("Your grade average is " + gradeAverage);
    }
}
