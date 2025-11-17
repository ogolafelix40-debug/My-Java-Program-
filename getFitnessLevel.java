import java.util.Scanner;
public class getFitnessLevel {
    static void fitnessLevel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of steps taken:");
        int stepsTaken = input.nextInt();
        if (stepsTaken >= 10000){
            System.out.println("Excellent");
        }
        else if(stepsTaken >= 7000 && stepsTaken < 10000){
            System.out.println("Good");
        }
        else if(stepsTaken >= 4000 && stepsTaken < 7000){
            System.out.println("Average");
        }
        else{
            System.out.println("Poor");
        }
    }
    public static void main(String[] args){
        fitnessLevel();
        fitnessLevel();
    }

}

