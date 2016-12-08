import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by regnisalram on 12/5/16.
 */
abstract public class Character extends GameObject{

    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void moveCharacter(String filename, int moveX, int moveY) {
        setPosX(getPosX() + moveX);
        setPosY(getPosY() + moveY);
        try{
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
