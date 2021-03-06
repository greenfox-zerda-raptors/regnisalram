import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by regnisalram on 12/7/16.
 */
public class Game extends JComponent implements KeyListener{

    Hero hero;
    Map originalMap;
    ArrayList<Character> enemies;

    public Game() {
        addKeyListener(this);

        originalMap = new Map();
        drawEnemies();
        hero = new Hero();

        setPreferredSize(new Dimension(720, 792));
        setFocusable(true);
        setVisible(true);
    }

    public void drawEnemies() {
        enemies = new ArrayList<>();

        enemies.add(new Skeleton(6, 0));
        enemies.add(new Skeleton(2, 3));
        enemies.add(new Skeleton(7, 10));

        enemies.add(new Boss(4, 10));
    }

    @Override
    public void paint(Graphics graphics) {
        originalMap.draw(graphics);
        for (Character enemy : enemies) {
            enemy.draw(graphics);
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
                hero.moveCharacter("images/hero-up.png", 0, -1, originalMap);
                break;
            case KeyEvent.VK_DOWN:
                hero.moveCharacter("images/hero-down.png", 0, 1, originalMap);
                break;
            case KeyEvent.VK_LEFT:
                hero.moveCharacter("images/hero-left.png", -1, 0, originalMap);
                break;
            case KeyEvent.VK_RIGHT:
                hero.moveCharacter("images/hero-right.png", 1, 0, originalMap);
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
