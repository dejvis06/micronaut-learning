package micronaut.learning;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;
import micronaut.learning.ioc.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = Micronaut.run(Application.class, args);
        getBean(applicationContext);
    }

    private static void getBean(ApplicationContext applicationContext) {
        Vehicle vehicle = applicationContext.getBean(Vehicle.class);
        logger.info(vehicle.start());
    }
}