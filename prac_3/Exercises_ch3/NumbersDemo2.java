import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args) {
        int usernumber;


        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter your Numbers!");
        usernumber = inputDevice.nextInt();


        int twicenumber = displayTwiceTheNumber(usernumber);
        int addnumber = displayNumberFivePlus(usernumber);
        int squrenumber = displayNumberSqured(usernumber);

        System.out.println("Twice the user numbers :" + twicenumber);
        System.out.println("Plus 5 to user numbers :" + addnumber);
        System.out.println("Squre the number :" + squrenumber);
    }

    public static int displayTwiceTheNumber(int twicenumber) {

        return twicenumber * 2;
    }
    public static int displayNumberFivePlus(int addnumber) {
        return  addnumber +5 ;
    }
    public static int displayNumberSqured(int squrenumber) {
        return squrenumber * squrenumber;
    }
}
