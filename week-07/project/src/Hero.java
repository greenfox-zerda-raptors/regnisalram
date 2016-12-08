
/**
 * Created by regnisalram on 12/5/16.
 */
public class Hero extends Character{

    String filename = "images/hero-down.png";

    public Hero() {
        this(0, 0);
    }

    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY);
    }

//    @Override
//    public void moveCharacter(String filename, int moveX, int moveY) {
//        super.moveCharacter(this.filename, moveX, moveY);
//
//    }
}
