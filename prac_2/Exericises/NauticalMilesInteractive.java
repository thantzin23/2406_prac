import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final float KILOMETER = 1.852f;
        final float MILES = 1.150779f;

        float nautical_miles ;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter your Nautical Miles!");
        nautical_miles = inputDevice.nextFloat();
        float result_miles = nautical_miles * MILES;
        float result_kilometer = nautical_miles * KILOMETER;

        System.out.println("Nautical Miles = "+ result_miles);
    }
}
