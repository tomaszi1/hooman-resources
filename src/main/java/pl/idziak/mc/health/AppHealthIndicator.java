package pl.idziak.mc.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import pl.idziak.mc.config.AppProperties;

import javax.inject.Inject;

@Component
public class AppHealthIndicator implements HealthIndicator {

    @Inject
    private AppProperties properties;

    @Override
    public Health health() {
        return null;
    }
}
