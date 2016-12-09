import java.awt.*;

/**
 * Created by regnisalram on 12/5/16.
 */
public class Wall extends Tile {

    public Wall(int posX, int posY) {
        super("images/wall.png", posX, posY);
        isWalkable = false;
    }
}
