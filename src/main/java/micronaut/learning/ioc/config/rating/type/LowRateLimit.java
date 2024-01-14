package micronaut.learning.ioc.config.rating.type;

import micronaut.learning.ioc.config.rating.RateLimit;

import java.time.Duration;

public class LowRateLimit extends RateLimit {
    public LowRateLimit(Duration duration, int number) {
        super(duration, number);
    }
}
