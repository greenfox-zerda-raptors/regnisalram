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
    String fileNameToCheck;
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

        setUpPanel();

        gameSize = 4;

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
                    revealedTiles = 0;
                } else {
                    System.out.println("wrong");
                    firstRevealed.switchRevealed();
                    secondRevealed.switchRevealed();
                    revealedTiles = 0;
                }
            }
        }
        isGameWon(tiles);
    }

//    private void setCleanSlate(Tile clicked) {
//        firstRevealed = null;
//        secondRevealed = null;
//        firstRevealed = clicked;
//        clicked.switchRevealed();
//    }
    private void isGameWon (ArrayList<Tile> tiles) {
        int matchedTiles = 0;
        for (Tile tile : tiles) {
            if (tile.revealed) {
                matchedTiles++;
            }
        }
        if (matchedTiles == gameSize * 2) {
            System.out.println("you won!");
        }

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
