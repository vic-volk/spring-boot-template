package ru.vlk.resource.cloud.api.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.vlk.resource.cloud.api.rest.ResourceRestService;
import ru.vlk.resource.cloud.api.rest.beans.ResourceBean;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ResourceRestServiceTest {

    @Autowired
    private ResourceRestService resourceRestService;

    @Test
    public void testAddResource() {
        ResourceBean resourceBean = new ResourceBean();
        resourceBean.setDescription("example");
        resourceBean.setLabel("example");
        resourceBean.setLink("http://test.example.com");
        resourceBean.setName("Test resource");

        resourceRestService.saveResource(resourceBean);
    }
}
