public class Percentage {
    public static void main(String[] args) {
        double percentage1 = 2.0d;
        double percentage2 = 5.0d;

        double result_percentage1 = computePercentage(percentage1,percentage2);

        System.out.println("The percentage of "+percentage1+ " is "+result_percentage1+" similar to "+ percentage2);

    }

    public static double computePercentage(double percentage1, double percentage2) {
       return (percentage1*(100/percentage2)) ;
    }
}
