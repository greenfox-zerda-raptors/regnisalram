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
    int numberOfPairs;
    int revealedTiles = 0;
    private Tile firstRevealed;
    private Tile secondRevealed;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }

    public App() {

        numberOfPairs = DialogBox.infoBox();

        setUpPanel();

        panel.setLayout(new GridLayout(getNumberOfRows(), 0));

        for (String gamePiece : getTilesType(numberOfPairs)) {
            tiles.add(new Tile(gamePiece));
            tiles.add(new Tile(gamePiece));
        }

        Collections.shuffle(tiles);

        for (Tile tile : tiles) {
            panel.add(tile);
            tile.addMouseListener(this);
        }

        placePanel();
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
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        panel = new JPanel();
        this.add(panel);
    }

    private void placePanel() {
        pack();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = (dimension.height/2 - this.getHeight()/2);

        this.setLocation(xPos, yPos);
        setVisible(true);
    }

    private void checkMatch(Tile clicked) {
        if (clicked.revealed == true) {
            System.out.println("this is already revealed");
        }else if (clicked.revealed == false) {
            if (revealedTiles == 0) {
                firstRevealed = clicked;
                clicked.switchRevealed();
                revealedTiles++;
            } else if (revealedTiles == 1) {
                secondRevealed = clicked;
                clicked.switchRevealed();
                revealedTiles++;
            } else if (revealedTiles == 2) {
                if (firstRevealed.gamePieceName.equals(secondRevealed.gamePieceName)) {
                    System.out.println("these are the same");
                    setCleanSlate(clicked);
                } else {
                    System.out.println("nope");
                    firstRevealed.switchRevealed();
                    secondRevealed.switchRevealed();
                    setCleanSlate(clicked);
                }
            }
        }
        isGameWon(tiles);
    }

    private void setCleanSlate(Tile clicked) {
        firstRevealed = clicked;
        firstRevealed.switchRevealed();
        revealedTiles = 1;
    }

    private void isGameWon (ArrayList<Tile> tiles) {
        int matchedTiles = 0;
        for (Tile tile : tiles) {
            if (tile.revealed) {
                matchedTiles++;
            }
        }
        if (matchedTiles == numberOfPairs * 2) {
            System.out.println("you won!");
        }

    }

    private int getNumberOfRows() {
        int rows = 0;
        switch (numberOfPairs) {
            case 2: rows = 2;
                break;
            case 3: rows = 2;
                break;
            case 4: rows = 2;
                break;
            case 5: rows = 2;
                break;
            case 6: rows = 3;
                break;
            case 7: rows = 2;
                break;
            case 8: rows = 4;
                break;
            case 9: rows = 3;
                break;
            case 10: rows = 4;
                break;
            case 11: rows = 2;
                break;
            case 12: rows = 4;
                break;
        }
        return rows;
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
        checkMatch((Tile) e.getSource());
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
