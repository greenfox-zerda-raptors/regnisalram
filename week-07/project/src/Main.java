import javax.swing.*;
import java.awt.*;

/**
 * Created by regnisalram on 12/5/16.
 */
public class Main extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }

    Main() {
        setUpFrame();
        this.add(new Board());
        setVisible(true);
    }

    void setUpFrame() {
        this.setTitle("Wanderer");
        this.setSize(820, 812);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = 0;

        this.setLocation(xPos, yPos);
    }
}
