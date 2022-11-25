public class NauticalMiles {
    public static void main(String[] args) {
        final float KILOMETER = 1.852f;
        float MILES = 1.150779f;

        float nautical_mile = 12.0f;

        float result_kilometer = nautical_mile * KILOMETER;
        float result_miles = nautical_mile * MILES ;
        System.out.println("Kilometer = "+result_kilometer);
        System.out.println("Miles = "+result_miles);

    }
}
