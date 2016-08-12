package ru.vlk.resource.cloud.api.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import ru.vlk.resource.cloud.api.SampleResource;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(SampleResource.class);
    }
}
