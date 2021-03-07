import java.util.*;

public class TuitionCaculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter tuition cost per year: ");
        while(!input.hasNextDouble()) {
            System.out.println("Invalid input, please try again\n.\n.");
            input.next();
            System.out.print("Enter tuition cost per year: ");
        }
        double currentTuition = input.nextDouble();

        System.out.print("Enter rate of increase in % per year: ");
        while(!input.hasNextDouble()) {
            System.out.println("Invalid input, please try again\n.\n.");
            input.next();
            System.out.print("Enter rate of increase in % per year: ");
        }
        double rateOfIncrease = input.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        while(!input.hasNextInt()) {
            System.out.println("Invalid input, please try again\n.\n.");
            input.next();
            System.out.print("Enter number of years: ");
        }
        int numOfYears = input.nextInt();

        System.out.printf("%-10s%-8s", "Year","Tuition\n");

        double tuition = currentTuition;
        int year = 1;

        System.out.printf("%-10d%-8.2f\n", year, tuition);
        while(year < numOfYears){
            tuition = tuition + (tuition * rateOfIncrease);
            year++;
            System.out.printf("%-10d%-8.2f\n", year, tuition);
        }

        while(tuition < currentTuition * 2){
            tuition = tuition + (tuition * rateOfIncrease);
            year++;
        }
        System.out.printf("%-51s%-2d%-22s%-10000.2f", "Your tuition will me more than the initial in year ", year, " and the cost will be ", tuition);
    }
}
