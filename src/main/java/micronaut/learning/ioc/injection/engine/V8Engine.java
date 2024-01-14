package micronaut.learning.ioc.injection.engine;

import jakarta.inject.Qualifier;
import jakarta.inject.Singleton;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import micronaut.learning.ioc.injection.engine.V8Engine.V8;

@Singleton
@V8
public class V8Engine implements Engine {
    private int cylinders = 8;

    @Override
    public String start() {
        return "Starting V8";
    }

    @Override
    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Qualifier
    @Retention(RUNTIME)
    public @interface V8{
    }
}
