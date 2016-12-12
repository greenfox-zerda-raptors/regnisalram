/**
 * Created by regnisalram on 12/1/16.
 */
public class Mouse extends AbstractAnimal {

    public Mouse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 2;
    }
}
