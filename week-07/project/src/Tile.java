import javax.swing.*;
import java.awt.*;

/**
 * Created by regnisalram on 12/5/16.
 */
abstract public class Tile extends GameObject{

    protected boolean isWalkable;

    public Tile(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }
}
