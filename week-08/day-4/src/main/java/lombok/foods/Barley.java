package lombok.foods;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.joda.time.LocalDate;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@EqualsAndHashCode (callSuper = true) @ToString (callSuper = true)
public class Barley extends AbstractHorseFood {
    @Builder
    protected Barley(Long weight, Float qualityMultiplier, LocalDate expirationDate) {
        super("Barley", weight, Long.valueOf(weight.longValue() * 5L), qualityMultiplier, expirationDate);
    }
}
