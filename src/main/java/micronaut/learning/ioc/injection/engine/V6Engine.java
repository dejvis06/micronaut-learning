package micronaut.learning.ioc.injection.engine;

import jakarta.inject.Qualifier;
import jakarta.inject.Singleton;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import micronaut.learning.ioc.injection.engine.V6Engine.V6;

@Singleton
@V6
public class V6Engine implements Engine {
    @Override
    public String start() {
        return "Starting V6";
    }

    @Override
    public int getCylinders() {
        return 6;
    }

    @Qualifier
    @Retention(RUNTIME)
    public @interface V6{
    }
}
