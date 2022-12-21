import java.util.Scanner;
public class AscendingAndDescending {
    public static void main(String[] args) {
        int num1, num2 , num3;
        int low , middle , high ;
        Scanner input = new Scanner(System.in);
        System.out.println("Input your numbers..... ");
        num1 = input.nextInt();
        System.out.println("And one more numbers ....");
        num2 = input.nextInt();
        System.out.println("And the last one .... ");
        num3 = input.nextInt();

        if (num1 <= num2 && num1 <= num3) {
             low = num1;
             if (num2 <= num3)
             {
                 middle = num2;
                 high  = num3;
             }
             else
             {
                 middle = num3;
                 high = num2;
             }
        }

        else
        {
            if (num2 <= num1 && num2 <= num3)
            {
                low = num2;
                if (num1 <= num3)
                {
                    middle = num1;
                    high = num3;
                }
                else
                {
                    middle = num3;
                    high = num1;
                }

            }
            else
            {
                low = num3;
                if (num1 <= num2)
                {
                    middle = num1;
                    high = num2;
                }
                else
                {
                    middle = num2;
                    high = num1;
                }
            }
        }

        System.out.println("Ascending " + low +" " + middle + " "+ high);
        System.out.println("Descending " + high + " " + middle + " " + low);


    }
}
