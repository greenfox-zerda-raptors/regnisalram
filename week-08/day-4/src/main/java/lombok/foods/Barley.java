package lombok.foods;

import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@EqualsAndHashCode (callSuper = true)
public class Barley extends AbstractHorseFood {
    protected Barley(Long weight, Float qualityMultiplier, LocalDate expirationDate) {
        super("Barley", weight, Long.valueOf(weight.longValue() * 5L), qualityMultiplier, expirationDate);
    }

    public static Barley.BarleyBuilder builder() {
        return new Barley.BarleyBuilder();
    }

    public String toString() {
        return "Barley(super=" + super.toString() + ")";
    }

    public static class BarleyBuilder {
        private Long weight;
        private Float qualityMultiplier;
        private LocalDate expirationDate;

        BarleyBuilder() {
        }

        public Barley.BarleyBuilder weight(Long weight) {
            this.weight = weight;
            return this;
        }

        public Barley.BarleyBuilder qualityMultiplier(Float qualityMultiplier) {
            this.qualityMultiplier = qualityMultiplier;
            return this;
        }

        public Barley.BarleyBuilder expirationDate(LocalDate expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Barley build() {
            return new Barley(this.weight, this.qualityMultiplier, this.expirationDate);
        }
    }
}
