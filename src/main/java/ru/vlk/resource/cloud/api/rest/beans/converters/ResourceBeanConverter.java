package ru.vlk.resource.cloud.api.rest.beans.converters;

import org.springframework.core.convert.converter.Converter;
import ru.vlk.resource.cloud.api.model.Resource;
import ru.vlk.resource.cloud.api.rest.beans.ResourceBean;

public class ResourceBeanConverter implements Converter<Resource, ResourceBean> {

    @Override
    public ResourceBean convert(Resource resource) {
        ResourceBean resourceBean = new ResourceBean();
        resourceBean.setName(resource.getName());
        resourceBean.setLink(resource.getLink());
        resourceBean.setDescription(resource.getDescription());
        return resourceBean;
    }
}
