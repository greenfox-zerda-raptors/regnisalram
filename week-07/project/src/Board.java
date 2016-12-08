import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by regnisalram on 12/7/16.
 */
public class Board extends JComponent implements KeyListener{

    ArrayList<GameObject> gameObjects;
    Hero hero = new Hero();

    public Board() {
        addKeyListener(this);
        gameObjects = new ArrayList<>();
        int[][] originalBoard = new int[][]{
                {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
                {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 1, 1, 1, 1}
        };
        for (int row = 0; row < originalBoard.length; row++) {
            for (int column = 0; column < originalBoard[row].length; column++) {
                if (originalBoard[row][column] == 0) {
                    gameObjects.add(new Wall(column, row));
                } else {
                    gameObjects.add(new Floor(column, row));
                }
            }
        }
        setPreferredSize(new Dimension(720, 792));
        setFocusable(true);
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
        hero.draw(graphics);

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                hero.moveCharacter("images/hero-up.png", 0, -1);
                // handle up
                break;
            case KeyEvent.VK_DOWN:
                hero.moveCharacter("images/hero-down.png", 0, 1);
                break;
            case KeyEvent.VK_LEFT:
                hero.moveCharacter("images/hero-left.png", -1, 0);
                // handle left
                break;
            case KeyEvent.VK_RIGHT:
                hero.moveCharacter("images/hero-right.png", 1, 0);
                // handle right
                break;
        }
        repaint();
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }
}
