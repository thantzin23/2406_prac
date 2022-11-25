public class QuartsToGallon {
    public static void main (String[] args){
        final int QUARTS = 4 ;
        int quarts = 18 ;
        int result_gallon = quarts / QUARTS;
        int result_quarts = quarts % QUARTS;
        System.out.println("A job that needs " +quarts+ " quarts requires " +result_gallon+ " gallons plus " +result_quarts+" quarts." );

    }
}
