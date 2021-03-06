import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by regnisalram on 11/25/16.
 */
public class App extends JFrame implements MouseListener {

    private JPanel panel;
    private ArrayList<Tile> tiles = new ArrayList<>();

    User currentPlayer;
    String userName;
    Database usersAndGames;

    int numberOfPairs;
    int revealedTiles = 0;

    static int clicks = 0;
    int gamePoints = 100;

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

        userName = DialogBox.getUserName();

        numberOfPairs = DialogBox.infoBox();

        putUserInDatabase();

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

    private void putUserInDatabase() {
        usersAndGames = new Database();
        try {
            usersAndGames.setUp();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        currentPlayer = new User(userName);
        try {
            usersAndGames.createUserIfNotExists(currentPlayer);
        } catch (SQLException e) {

        }
    }

    private void setUpPanel() {

        this.setTitle("Memory Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        panel = new JPanel();
        this.add(panel);
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
                } else {
                    System.out.println("nope");
                    firstRevealed.switchRevealed();
                    secondRevealed.switchRevealed();
                }
                setCleanSlate(clicked);
            }
            clicks++;
        }
        isGameWon(tiles);
    }

    private void setCleanSlate(Tile clicked) {
        firstRevealed = clicked;
        firstRevealed.switchRevealed();
        revealedTiles = 1;
    }

    private int countGamePoints() {
        int minimumClicks = numberOfPairs * 2;
        gamePoints -= (clicks - minimumClicks);
        return gamePoints;

    }

    private void isGameWon (ArrayList<Tile> tiles) {
        int matchedTiles = 0;
        for (Tile tile : tiles) {
            if (tile.revealed) {
                matchedTiles++;
            }
        }
        if (matchedTiles == numberOfPairs * 2) {
            putGameInDatabase();
            System.out.println("you won! your got " + countGamePoints() + " points");
            new LeaderBoard(usersAndGames, numberOfPairs);
        }
    }

    private void putGameInDatabase() {

        PlayedGame currentGame = new PlayedGame(numberOfPairs, countGamePoints(), currentPlayer);
        try {
            usersAndGames.storePlayedGame(currentGame);
        } catch (SQLException e) {
            System.out.println("This game won't be saved since you didn't specify your username.");
        }
    }

    private int getNumberOfRows() {
        int rows = 0;
        switch (numberOfPairs) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 11: rows = 2;
                break;
            case 6:
            case 9: rows = 3;
                break;
            case 8:
            case 10:
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
