public class FromLetterWriter {
    public static void main(String[] args) {
        displaySalution("Armilly");
        displaySalution("Honey","Karty");

    }

    public static void displaySalution(String lastname){
        System.out.println("Dear Mr. or Ms." + lastname + ",");
    }

    public static void displaySalution(String Fristname , String lastname){
        System.out.println("Dear "+ Fristname +" "+ lastname+",");
    }

    public static void displayLetter(){
        System.out.println("Thank you for your recent order.");
    }
}
