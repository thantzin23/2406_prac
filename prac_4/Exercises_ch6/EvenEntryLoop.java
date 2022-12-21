import javax.swing.*;
public class EvenEntryLoop {
    public static void main(String[] args) {
        int num ;
        String Entry , Message ;
        final int Quit = 1111 ;

        Entry = JOptionPane.showInputDialog(null,
                "Enter even numbers to entry or " + Quit+ " or to quit !");
        num = Integer.parseInt(Entry);

        while (num !=Quit)
        {
            if (num % 2 == 0 )
                Message = "Good Job!";

            else

               Message = num + "is not a even numbers!";

            JOptionPane.showMessageDialog(null,Message);
            Entry = JOptionPane.showInputDialog(null,"Enter even numbers or " +Quit+"or to quit !");
            num = Integer.parseInt(Entry);

        }

    }
}
