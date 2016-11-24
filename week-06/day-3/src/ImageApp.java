import javax.swing.*;
import java.awt.*;

/**
 * Created by regnisalram on 11/23/16.
 */
public class ImageApp extends JFrame {

    private JPanel panel;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageApp();
            }
        });
    }

    public ImageApp () {

        setUpPanel();
//        paintComponent();

    }

//    public void paintComponent(Graphics graphics) {
//        super.paintComponent(graphics);
//        requestFocus();
//        graphics.drawImage(warhol.img)
//    }

    public void setUpPanel() {

        this.setTitle("Custom Image App");
        this.setVisible(true);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        tk.createImage("warhol.jpg");
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = (dimension.height/2 - this.getHeight()/2);

        this.setLocation(xPos, yPos);

        panel = new JPanel();
        this.add(panel);
    }
}
