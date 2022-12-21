import java.util.*;
public class BabyNameComparsion {
    public static void main(String[] args) {
        String name1 , name2 , name3 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name for name >>>>");
        name1 = input.nextLine();
        System.out.println("Enter a second name >>>>");
        name2 = input.nextLine();
        System.out.println("Enter last name >>>>");
        name3 = input.nextLine();
        System.out.println("The combind names are :");
        System.out.println(name1 +" "+ name2);
        System.out.println(name1 +" "+ name3);
        System.out.println(name2 +" "+ name1);
        System.out.println(name2 +" "+ name3);
        System.out.println(name3 +" "+ name1);
        System.out.println(name3 +" "+ name2);
    }
}
