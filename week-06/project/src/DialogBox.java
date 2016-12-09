import javax.swing.*;

/**
 * Created by regnisalram on 12/4/16.
 */
public class DialogBox extends JOptionPane {

    public static JPanel panel = new JPanel();

    public static final Integer[] numberOfPairs = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12};

    static ImageIcon icon = new ImageIcon("images/totoro_icon.jpeg");

    public static int infoBox() {
            int gameSize = (int) JOptionPane.showInputDialog(panel,
                    "Hello there!\nWelcome to the game!\nHow many pairs would you like to look for?",
                    "Memory Game",
                    JOptionPane.YES_OPTION,
                    icon,
                    numberOfPairs,
                    numberOfPairs[0]);
            return gameSize;
    }
}
