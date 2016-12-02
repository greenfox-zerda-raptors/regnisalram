import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by regnisalram on 11/25/16.
 */
public class App extends JFrame implements MouseListener {

    private JPanel panel;
    private ArrayList<Tile> tiles = new ArrayList<>();
    int gameSize;
    int revealedTiles = 0;
    

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

        gameSize = 6;

        panel.setLayout(new GridLayout(2, 0));

        for (String gamePiece : getTilesType(gameSize)) {
            tiles.add(new Tile(gamePiece));
            tiles.add(new Tile(gamePiece));
        }

        Collections.shuffle(tiles);

        for (Tile tile : tiles) {
            panel.add(tile);
            tile.addMouseListener(this);
        }

        pack();
        setVisible(true);
    }

    private ArrayList<String> getTilesType(int gameSize) {
        ArrayList<String> gamePieceFileNames = getImageFileNames();
        Collections.shuffle(gamePieceFileNames);
        ArrayList<String> tilesNeeded = new ArrayList<>();

        for (int i = 0; i < gameSize; i++) {
            tilesNeeded.add(gamePieceFileNames.get(i));
        }
        return tilesNeeded;
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

    private void checkMatch() {

    }

    private ArrayList<String> getImageFileNames() {
        ArrayList<String> fileNames = new ArrayList<>();
        File directory = new File("images/gamepieces");
        for (String file : directory.list())  {
            fileNames.add(file);
        }
        return fileNames;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (revealedTiles < 2) {
            ((Tile) e.getSource()).switchRevealed();
            revealedTiles++;
        } else if (revealedTiles == 2) {
//            if (((Tile) e.getSource()).gamePieceName.equals())

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}