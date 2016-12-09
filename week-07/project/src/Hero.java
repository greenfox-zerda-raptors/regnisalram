
/**
 * Created by regnisalram on 12/5/16.
 */
public class Hero extends Character {

    public Hero() {
        this(0, 0);
    }

    public Hero(int posX, int posY) {
        super("images/hero-down.png", posX, posY);
    }
}
