import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        final int INCHES = 12 ;
        int inches;

        Scanner inputDevices = new Scanner(System.in);
        System.out.println("Enter your Inches convert to feet !");
        inches = inputDevices.nextInt();
        int result_feet = inches / INCHES;
        int result_inches = inches % INCHES;

        System.out.println(inches+" inches has "+result_feet+" feet and "+result_inches+" inches.");
    }
}
