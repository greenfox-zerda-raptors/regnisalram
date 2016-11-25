import javax.swing.*;
import java.awt.*;

/**
 * Created by regnisalram on 11/25/16.
 */
public class Tile extends JPanel {

    public boolean revealed = false;
    private Image background, memoryPiece;
    String gamePieceName;


    public Tile(String gamePieceName) {

        this.setPreferredSize(new Dimension(200, 200));

        this.gamePieceName = gamePieceName;

        background = Toolkit.getDefaultToolkit().createImage("images/totoro_bkgd.jpg").getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        memoryPiece = Toolkit.getDefaultToolkit().createImage("images/gamepieces/" + gamePieceName).getScaledInstance(200, 200, Image.SCALE_DEFAULT);

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

