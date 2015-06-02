package tp_test.conf.factory;

import org.junit.Test;
import org.testng.Assert;
import tp_test.domain.NextOfKin;

import static org.junit.Assert.*;

/**
 * Created by graham on 2015/06/02.
 */
public class NextOfKinFactoryTest {

    Long id = 101L;
    @Test
    public void testCreateNextOfKin() throws Exception {
        NextOfKin nextOfKin = NextOfKinFactory
                .createNextOfKin(101L,"George Lucas","Father");

        Assert.assertEquals(id,nextOfKin.getId());
        Assert.assertEquals("George Lucas",nextOfKin.getName());
        Assert.assertEquals("Father",nextOfKin.getRelation());
    }

}