import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by regnisalram on 11/25/16.
 */
public class Tile extends JPanel {

    public boolean revealed = false;
    private Image background, memoryPiece;


    public Tile() {

        background = Toolkit.getDefaultToolkit().createImage("images/totoro_bkgd.jpg").getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        memoryPiece = Toolkit.getDefaultToolkit().createImage("images/catbus.jpg").getScaledInstance(200, 200, Image.SCALE_DEFAULT);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    public void switchRevealed() {
        revealed = !revealed;
        repaint();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        requestFocus();

        graphics.drawImage(revealed ? memoryPiece: background, 0, 0, this);
    }
}

