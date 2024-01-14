package micronaut.learning.ioc.config.rating;

import io.micronaut.context.annotation.Factory;
import io.micronaut.core.annotation.Order;

import jakarta.inject.Singleton;
import micronaut.learning.ioc.config.rating.type.HighRateLimit;
import micronaut.learning.ioc.config.rating.type.LowRateLimit;

import java.time.Duration;

@Factory
public class RateLimitsFactory {

    @Singleton
    @Order(20)
    LowRateLimit rateLimit2() {
        return new LowRateLimit(Duration.ofMinutes(50), 100);
    }

    @Singleton
    @Order(10)
    HighRateLimit rateLimit1() {
        return new HighRateLimit(Duration.ofMinutes(50), 1000);
    }
}
