package ru.vlk.resource.cloud.api.rest.beans.converters;

import org.springframework.core.convert.converter.Converter;
import ru.vlk.resource.cloud.api.model.Resource;
import ru.vlk.resource.cloud.api.rest.beans.ResourceBean;

public class ResourceConverter implements Converter<ResourceBean, Resource> {

    @Override
    public Resource convert(ResourceBean resourceBean) {
        return new Resource(resourceBean.getName(), resourceBean.getLink(),
                resourceBean.getDescription(), resourceBean.getLabel());
    }
}
