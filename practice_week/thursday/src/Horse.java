/**
 * Created by regnisalram on 12/1/16.
 */
public class Horse extends AbstractAnimal {

    public Horse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 20;
    }
}
