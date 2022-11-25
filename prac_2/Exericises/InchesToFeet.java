public class InchesToFeet {
    public static void main(String[] args) {
        final int INCHES = 12;
        int inches = 86;

        int result_feet = inches / INCHES;
        int result_inches = inches % INCHES;

        System.out.println(inches+" inches has "+result_feet+" feet and "+result_inches+" inches.");


    }
}
