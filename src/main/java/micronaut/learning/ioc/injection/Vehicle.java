package micronaut.learning.ioc.injection;

import jakarta.inject.Singleton;
import micronaut.learning.ioc.injection.engine.Engine;
import micronaut.learning.ioc.injection.engine.V8Engine.V8;

@Singleton
public class Vehicle {
    private final Engine engine;

    public Vehicle(/*@Named("v6")*/@V8 Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}