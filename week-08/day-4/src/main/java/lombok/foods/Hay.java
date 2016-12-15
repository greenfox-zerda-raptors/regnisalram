package lombok.foods;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.joda.time.LocalDate;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@EqualsAndHashCode (callSuper = true) @ToString (callSuper = true)
public class Hay extends AbstractHorseFood {
    @Builder
    protected Hay(Long weight, Float qualityMultiplier, LocalDate expirationDate) {
        super("Hay", weight, Long.valueOf(weight.longValue() * 2L), qualityMultiplier, expirationDate);
    }
}
