import java.util.Scanner;

public class QuartsToGallonInteractive {
    public static void main(String[] args) {
        final int QUARTS = 4;
        int quarts ;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the numbers of Quarts!");
        quarts = inputDevice.nextInt();

        int result_quarts = quarts % QUARTS;
        int result_gallon = quarts/ QUARTS;
        System.out.println("A job that needs " +quarts+ " quarts requires " +result_gallon+ " gallons plus " +result_quarts+" quarts." );

    }

}
