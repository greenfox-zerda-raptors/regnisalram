import java.awt.*;
import java.util.ArrayList;

/**
 * Created by regnisalram on 12/9/16.
 */
public class Map {

    ArrayList<GameObject> gameObjects;
    int[][] originalBoard;

    public Map() {
        gameObjects = new ArrayList<>();
        originalBoard = new int[][]{
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
    }

    public void draw(Graphics graphics) {
        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
    }
}
