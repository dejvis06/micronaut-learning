package micronaut.learning.ioc.config.rating.type;

import micronaut.learning.ioc.config.rating.RateLimit;

import java.time.Duration;

public class HighRateLimit extends RateLimit {
    public HighRateLimit(Duration duration, int number) {
        super(duration, number);
    }
}
