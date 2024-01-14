package micronaut.learning;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import micronaut.learning.ioc.config.rating.RateLimit;
import micronaut.learning.ioc.injection.Vehicle;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

@MicronautTest
public class IOCTests {

    static final Logger logger = LoggerFactory.getLogger(IOCTests.class);

    @Inject
    Collection<RateLimit> rateLimits;

    @Inject
    Vehicle vehicle;

    @Test
    void orderingTes(){
        logger.info("Rate Limits size: {}", rateLimits.size());
        rateLimits.forEach(rateLimit -> logger.info(rateLimit.toString()));
    }

    @Test
    void qualifierTest(){
        logger.info(vehicle.start());
    }
}
