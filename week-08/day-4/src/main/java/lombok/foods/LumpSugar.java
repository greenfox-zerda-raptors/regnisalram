package lombok.foods;

import lombok.EqualsAndHashCode;
import org.joda.time.LocalDate;

/**
 * Created by kicsen on 2016. 12. 12..
 */
@EqualsAndHashCode
public class LumpSugar extends AbstractHorseFood {
    protected LumpSugar(Long weight, Float qualityMultiplier, LocalDate expirationDate) {
        super("LumpSugar", weight, Long.valueOf(weight.longValue() * 13L), qualityMultiplier, expirationDate);
    }

    public static LumpSugar.LumpSugarBuilder builder() {
        return new LumpSugar.LumpSugarBuilder();
    }

    public String toString() {
        return "LumpSugar(super=" + super.toString() + ")";
    }

    public static class LumpSugarBuilder {
        private Long weight;
        private Float qualityMultiplier;
        private LocalDate expirationDate;

        LumpSugarBuilder() {
        }

        public LumpSugar.LumpSugarBuilder weight(Long weight) {
            this.weight = weight;
            return this;
        }

        public LumpSugar.LumpSugarBuilder qualityMultiplier(Float qualityMultiplier) {
            this.qualityMultiplier = qualityMultiplier;
            return this;
        }

        public LumpSugar.LumpSugarBuilder expirationDate(LocalDate expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public LumpSugar build() {
            return new LumpSugar(this.weight, this.qualityMultiplier, this.expirationDate);
        }

        public String toString() {
            return "LumpSugar.LumpSugarBuilder(weight=" + this.weight + ", qualityMultiplier=" + this.qualityMultiplier + ", expirationDate=" + this.expirationDate + ")";
        }
    }
}
