public class Billing {
    final static double Tax = 0.08d;

    public static void main(String[] args) {
        double bill ;
        bill = computeBill(12.56);{
            System.out.println("The total cost for photobook is  $ " + bill);
        }

        bill = computeBill(34.56,8);{
            System.out.println("The total cost for 8 photobook is  $ "+ bill );
        }

        bill = computeBill(67.56,6,15.0);{
            System.out.println("The total cost for 6 photobook with coupon 15.0 $ is $" + bill );
        }
    }

    public static double computeBill(double price){
        double bill = price + price * Tax;
        return  bill ;
    }

    public static double computeBill(double price , int quantity){
        double bill = price * quantity;
        bill = bill + bill * Tax;
        return bill;
    }

    public static double computeBill(double price , int quantity, double coupon) {
        double bill = price * quantity;
        bill = bill - coupon;
        bill = bill + bill * Tax;
        return bill ;
    }
}
