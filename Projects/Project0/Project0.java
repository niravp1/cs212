package Projects.Project0;
import javax.swing.JOptionPane;

public class Project0 {
    public static void main(String args[]) {
        String sentence;
        // loop continues so user can type multiple sentences until "stop" is typed
        while (true) {

            sentence = JOptionPane.showInputDialog("Please enter a sentence: ");
            // end program when stop is typed (our termination condition)
            if (sentence.equalsIgnoreCase("stop"))
                break;

            int uppercaseEcount = 0;
            int lowercaseEcount = 0;

            for (int i = 0; i < sentence.length(); i++) {
                // check for 'E' and 'e' seperately because problem has case sensitivity
                if (sentence.charAt(i) == 'E')
                    uppercaseEcount++;
                else if (sentence.charAt(i) == 'e')
                    lowercaseEcount++;
            }
            JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowercaseEcount + ". \n"
                    + "Number of upper case e's: " + uppercaseEcount + ".");
        }
    }
}
