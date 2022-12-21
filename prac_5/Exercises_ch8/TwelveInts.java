public class TwelveInts {
    public static void main(String[] args) {
        int[] numbers = {23,34,35,36,45,48, 57,60,72,79,85,91};
        int i ;
        for (i = 0 ; i < numbers.length;  i++)
            System.out.println(numbers[i] +" ");
        System.out.println();

        for (i = numbers.length - 1; i >=0 ; i-- )
            System.out.println(numbers[i] + " ");
        System.out.println();
    }
}
