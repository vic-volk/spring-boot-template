package ru.vlk.resource.cloud.api.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import ru.vlk.resource.cloud.api.jersey.filter.CORSResponseFilter;
import ru.vlk.resource.cloud.api.rest.ResourceRestService;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(ResourceRestService.class);
        register(CORSResponseFilter.class);
    }
}
