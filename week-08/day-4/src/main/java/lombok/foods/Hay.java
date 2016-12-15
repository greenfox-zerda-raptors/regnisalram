package lombok.foods;

import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@EqualsAndHashCode
public class Hay extends AbstractHorseFood {
    protected Hay(Long weight, Float qualityMultiplier, LocalDate expirationDate) {
        super("Hay", weight, Long.valueOf(weight.longValue() * 2L), qualityMultiplier, expirationDate);
    }

    public static Hay.HayBuilder builder() {
        return new Hay.HayBuilder();
    }

    public String toString() {
        return "Hay(super=" + super.toString() + ")";
    }

    public static class HayBuilder {
        private Long weight;
        private Float qualityMultiplier;
        private LocalDate expirationDate;

        HayBuilder() {
        }

        public Hay.HayBuilder weight(Long weight) {
            this.weight = weight;
            return this;
        }

        public Hay.HayBuilder qualityMultiplier(Float qualityMultiplier) {
            this.qualityMultiplier = qualityMultiplier;
            return this;
        }

        public Hay.HayBuilder expirationDate(LocalDate expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Hay build() {
            return new Hay(this.weight, this.qualityMultiplier, this.expirationDate);
        }

        public String toString() {
            return "Hay.HayBuilder(weight=" + this.weight + ", qualityMultiplier=" + this.qualityMultiplier + ", expirationDate=" + this.expirationDate + ")";
        }
    }
}
