import javax.swing.*;
import java.awt.*;

/**
 * Created by regnisalram on 11/25/16.
 */
public class Tile extends JPanel {

    private boolean revealed = false;
    public Image background, memoryPiece;

    public Tile() {

        if (!revealed) {
            background = Toolkit.getDefaultToolkit().createImage("images/totoro_bkgd.jpg").getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        } else if (revealed) {
            memoryPiece = Toolkit.getDefaultToolkit().createImage("images/catbus.jpg").getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        }
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();
        graphics.drawImage(background, 0, 0, this);
        graphics.drawImage(memoryPiece, 0, 0, this);
    }
}

