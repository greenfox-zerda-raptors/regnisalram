import javax.swing.*;
import java.awt.*;

/**
 * Created by regnisalram on 11/24/16.
 */
public class ImagePanel extends JPanel {

    Image image;

    public ImagePanel() {

        image = Toolkit.getDefaultToolkit().createImage("image.jpg");

    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        graphics.drawImage(image, 7, 25, this);

        graphics.setColor(Color.RED);
        graphics.setFont(new Font("Bla", Font.ITALIC, 30));
        graphics.drawString("This is the title of this image", 50, 420);

        graphics.setColor(Color.BLUE);
        graphics.fillRect(50, 50, 100, 100);

        graphics.setColor(Color.RED);
        graphics.fillOval(50, 50, 100, 100);

        graphics.setColor(Color.BLUE);
        graphics.fillRect(65, 65, 71, 71);

        graphics.setColor(Color.RED);
        graphics.fillOval(65, 65, 70, 70);


    }
}
