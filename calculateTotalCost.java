import java.util.Scanner;
public class calculateTotalCost { 
    static void Totalcost() {
     Scanner input = new Scanner(System.in);

     System.out.println("Enter the accomodation cost:Ksh");
     double accomodationCost = input.nextDouble();
     System.out.println("Enter the cost of the meals:Ksh");
     double mealCost = input.nextDouble();
     System.out.println("Enter activity cost:Ksh");
     double activityCost = input.nextDouble();

     double totalCost = accomodationCost + mealCost + activityCost;

     System.out.println("------------------------------------------");
     System.out.println("The Total Vacation Cost is:Ksh " + totalCost);
     System.out.println("-------------------------------------------");

    }
    public static void main(String[] args) {
        Totalcost();
        Totalcost();
    }



}