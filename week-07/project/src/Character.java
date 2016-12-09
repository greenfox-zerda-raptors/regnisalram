import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by regnisalram on 12/5/16.
 */
abstract public class Character extends GameObject{

    int updatedPosX;
    int updatedPosY;

    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void moveCharacter(String filename, int moveX, int moveY, Map map) {
        updatedPosX = getPosX() + moveX;
        updatedPosY = getPosY() + moveY;
        if (isWalkable(map)) {
            if (!(updatedPosX < 0 || updatedPosX > 9)) {
                    setPosX(updatedPosX);
            }
            if (!(updatedPosY < 0 || updatedPosY > 10)) {
                    setPosY(updatedPosY);
            }
        }

        try{
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isWalkable(Map map) {
        try {
            return map.originalBoard[updatedPosY][updatedPosX] != 0;
        } catch (IndexOutOfBoundsException e) {

        }
        return false;
    }

}
