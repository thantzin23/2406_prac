import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.println("Enter your numbers >>>>>>" );
        num = input.nextInt();

        if (isEven(num))
            System.out.println(num + " is Even !");
        else
            System.out.println(num + " is Odd !");

    }
    public static boolean isEven(int num){
        boolean result;
        result = num % 2 == 0;
        return result;
    }

}
