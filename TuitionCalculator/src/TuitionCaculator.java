import java.util.*;

public class TuitionCaculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter tuition cost: ");
        while(!input.hasNextDouble()) {
            System.out.println("Invalid input, please try again");
            input.next();
            System.out.print("Enter tuition cost: ");
        }
        double currentTuition = input.nextDouble();

        System.out.print("Enter rate of increase in %: ");
        while(!input.hasNextDouble()) {
            System.out.println("Invalid input, please try again");
            input.next();
            System.out.print("Enter rate of increase in %: ");
        }
        double rateOfIncrease = input.nextDouble() / 100;

        System.out.println("Year" + "\t" + "Tuition");

        double tuition = currentTuition;
        int year = 1;
        System.out.println(year + "\t\t" + tuition);

        while(year < 3){
            tuition = tuition + (tuition * rateOfIncrease);
            year++;
            System.out.println(year + "\t\t" + tuition);
        }

        while(tuition < currentTuition * 2){
            tuition = tuition + (tuition * rateOfIncrease);
            year++;
        }
        System.out.println(year + "\t\t" + tuition);
    }
}
