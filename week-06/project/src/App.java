import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by regnisalram on 11/25/16.
 */
public class App extends JFrame implements ActionListener{

    private JPanel panel;
    private ArrayList<Tile> tiles = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }

    public App() {

        setUpPanel();

        panel.setLayout(new GridLayout(2, 2));

        for (int i = 0; i < 4; i++) {
            tiles.add(new Tile());
        }

        for (Tile tile : tiles) {
            panel.add(tile);

        }

        setVisible(true);
    }

    private void setUpPanel() {

        this.setTitle("Memory Game");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = (dimension.height/2 - this.getHeight()/2);

        this.setLocation(xPos, yPos);

        panel = new JPanel();
        this.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
