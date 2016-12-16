import javax.swing.*;

/**
 * Created by regnisalram on 12/4/16.
 */
public class DialogBox extends JOptionPane {

    public static JPanel panel = new JPanel();

    public static final Integer[] numberOfPairs = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12};

    static ImageIcon icon = new ImageIcon("images/totoro_icon.jpeg");

    public static String getUserName() {
        String userName = JOptionPane.showInputDialog(panel,
                "Hello there!\nWelcome to the game!\nChoose a new username or use the one from earlier to save your score.",
                "Memory Game", JOptionPane.YES_NO_CANCEL_OPTION);

        if (userName.equals("")) {
            userName = null;
        }
        return userName;
    }

    public static int infoBox() {
        int gameSize = (int) JOptionPane.showInputDialog(panel,
                "How many pairs would you like to look for?",
                "Memory Game",
                JOptionPane.OK_OPTION,
                icon,
                numberOfPairs,
                numberOfPairs[0]);
        return gameSize;
    }
}
