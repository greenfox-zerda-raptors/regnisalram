package lombok.animals;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.java.Log;
import lombok.foods.Food;

import java.util.logging.Logger;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@EqualsAndHashCode (callSuper = true) @ToString (callSuper = true) @Log
public class Mouse extends AbstractAnimal {

    @Builder
    public Mouse(String name, long weightInGram, double happiness) {
        super(name, weightInGram, happiness);
    }

    public void feed(Food food) {
        super.feed(food);
    }

    public void logOwnInfo() {
        log.info(this.toString());
    }

    protected int getMoveHappinessDecrease() {
        return 3;
    }
}
