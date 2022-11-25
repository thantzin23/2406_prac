public class NumbersDemo {
    public static void main(String[] args) {
        int numbers1 =25 ;
        int numbers2 = 99;
        displayTwiceTheNumber( numbers1 ,  numbers2);
        displayNumberFivePlus(numbers1 , numbers2);
        displayNumberSqured(numbers1,numbers2);

    }

    public static void displayTwiceTheNumber(int numbers1 ,int numbers2) {
        System.out.println("Twice the numbers of Numbers1 : "+numbers1+" is "+(numbers1 *2)+" and numbers2 : "+numbers2+" is " + (  numbers2 * 2));

    }

    public static void displayNumberFivePlus(int numbers1 , int number2) {
        System.out.println("Plus Five number to Numbers1 : "+numbers1+" is "+(numbers1 + 5 ) + " and Numbers2: "+ number2+" is "+(number2 + 5));
    }

    public static void displayNumberSqured(int numbers1 , int numbers2) {
        System.out.println("Squre the number of Numbers1 : "+numbers1+" is "+(numbers1 * numbers1) + " and Numbers2 : "+numbers2+" is "+(numbers2 * numbers2) );
    }
}
