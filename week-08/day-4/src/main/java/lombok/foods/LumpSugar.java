package lombok.foods;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.joda.time.LocalDate;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@EqualsAndHashCode (callSuper = true) @ToString (callSuper = true)
public class LumpSugar extends AbstractHorseFood {
    @Builder
    protected LumpSugar(Long weight, Float qualityMultiplier, LocalDate expirationDate) {
        super("LumpSugar", weight, Long.valueOf(weight.longValue() * 13L), qualityMultiplier, expirationDate);
    }
}
