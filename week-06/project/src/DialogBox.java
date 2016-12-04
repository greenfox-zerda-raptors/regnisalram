import javax.swing.*;

/**
 * Created by regnisalram on 12/4/16.
 */
public class DialogBox extends JOptionPane {

    public static JPanel panel = new JPanel();

    public static final Integer[] numberOfPairs = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12};

    public static int infoBox() {
        int gameSize = (int) JOptionPane.showInputDialog(panel,
                "Hello there!\n Welcome to the game!\n How many pairs would you like to look for?",
                "Memory Game",
                JOptionPane.QUESTION_MESSAGE,
                null,
                numberOfPairs,
                numberOfPairs[0]);
        return gameSize;
    }
}
