package micronaut.learning.ioc.config.rating;

import java.time.Duration;

public abstract class RateLimit {

    private final Duration duration;
    private final int number;

    protected RateLimit(Duration duration, int number) {
        this.duration = duration;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "duration=" + duration +
                ", number=" + number +
                '}';
    }
}
