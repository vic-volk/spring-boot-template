package ru.vlk.resource.cloud.api.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/echo")
public class SampleResource {

    @GET
    public String echo() {
        return "Hello!";
    }
}
