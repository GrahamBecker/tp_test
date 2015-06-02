package tp_test.repository;

import tp_test.App;
import tp_test.conf.factory.NextOfKinFactory;
import tp_test.domain.NextOfKin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;



import static org.testng.Assert.*;

/**
 * Created by graham on 2015/06/02.
 */
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class NextOfKinRepositoryTest extends AbstractTestNGSpringContextTests {

    private Long id;
    @Autowired
    private NextOfKinRepository repository;

    @Test
    public void create() throws Exception{
        NextOfKin nextOfKin = NextOfKinFactory
                .createNextOfKin(101L,"George Lucas","Father");

        repository.save(nextOfKin);

        id = nextOfKin.getId();
        Assert.assertNotNull(nextOfKin);

        System.out.println("The Id is : " + id);
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {

        NextOfKin nextOfKin = repository.findOne(id);
        Assert.assertNotNull(nextOfKin);
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
    }

    @Test(dependsOnMethods = "update")
    public void delete() throws Exception {
        NextOfKin nextOfKin = repository.findOne(id);
        repository.delete(nextOfKin);
        NextOfKin deletednextOfKin = repository.findOne(id);
        Assert.assertNull(deletednextOfKin);
    }
}

