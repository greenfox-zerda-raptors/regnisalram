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

        this.setPreferredSize(new Dimension(150, 150));

        this.gamePieceName = gamePieceName;

        background = Toolkit.getDefaultToolkit().createImage("images/totoro_bkgd.jpg").getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        memoryPiece = Toolkit.getDefaultToolkit().createImage("images/gamepieces/" + gamePieceName).getScaledInstance(150, 150, Image.SCALE_DEFAULT);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
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

