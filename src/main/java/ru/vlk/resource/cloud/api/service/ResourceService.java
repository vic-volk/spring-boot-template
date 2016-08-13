package ru.vlk.resource.cloud.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.vlk.resource.cloud.api.model.Resource;
import ru.vlk.resource.cloud.api.repository.ResourceRepository;

@Service
public class ResourceService {

    @Autowired
    private ResourceRepository resourceRepository;

    public Page<Resource> findAll(Pageable pageable) {
        return resourceRepository.findAll(pageable);
    }

    public Resource save(Resource resource) {
        return resourceRepository.save(resource);
    }
}
