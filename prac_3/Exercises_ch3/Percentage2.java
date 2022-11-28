import java.util.Scanner;

public class Percentage2 {
    public static void main(String[] args) {
        double userpercentage1 ;
        double userpercentage2 ;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter your high percentage number!");
        userpercentage1 = inputDevice.nextDouble();
        System.out.println("Enter your lower percentage number!");
        userpercentage2 = inputDevice.nextDouble();

        double userResult = computePercentage(userpercentage1,userpercentage2);

        System.out.println("");

        System.out.println("The percentage of "+userpercentage1+ " is "+userResult+" similar to "+ userpercentage2);

    }

    public static double computePercentage(double userpercentage1, double userpercentage2) {
        return (userpercentage1 *(100/userpercentage2));
    }
}
