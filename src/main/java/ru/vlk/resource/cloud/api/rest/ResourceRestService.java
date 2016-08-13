package ru.vlk.resource.cloud.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import ru.vlk.resource.cloud.api.model.Resource;
import ru.vlk.resource.cloud.api.rest.beans.ResourceBean;
import ru.vlk.resource.cloud.api.rest.beans.converters.ResourceBeanConverter;
import ru.vlk.resource.cloud.api.rest.beans.converters.ResourceConverter;
import ru.vlk.resource.cloud.api.service.ResourceService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;

@Component
@Path("/resource")
public class ResourceRestService {

    @Autowired
    private ResourceService resourceService;

    @GET
    @Produces("application/json")
    public Page<ResourceBean> findAll(@Context Pageable page) {
        Page<Resource> resources = resourceService.findAll(page);
        return convert(resources);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ResourceBean saveResource(ResourceBean resourceBean) {
        Resource resource = new ResourceConverter().convert(resourceBean);
        resource = resourceService.save(resource);
        return new ResourceBeanConverter().convert(resource);
    }

    private Page<ResourceBean> convert(Page<Resource> resources) {
        return resources.map(new ResourceBeanConverter());
    }
}
