package micronaut.learning.ioc;

import jakarta.inject.Singleton;

@Singleton
public class Vehicle {
    private final Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}