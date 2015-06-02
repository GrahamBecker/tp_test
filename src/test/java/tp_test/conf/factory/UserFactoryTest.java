package tp_test.conf.factory;

import org.junit.Test;
import org.testng.Assert;
import tp_test.domain.NextOfKin;
import tp_test.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by graham on 2015/06/02.
 */
public class UserFactoryTest {

    @Test
    public void testCreateUser() throws Exception {

        Long id = 25L;

        List<NextOfKin> nextOfKins = new ArrayList<NextOfKin>();
        Map<String,String> values = new HashMap<String,String>();

        values.put("fname","Graham");
        values.put("lname", "Becker");

        User user = UserFactory.createUser(25L,"20/11/1984",values,nextOfKins);

        Assert.assertEquals(id, user.getId());
        Assert.assertEquals("20/11/1984", user.getDob());
        Assert.assertEquals("Graham", user.getfName());
        Assert.assertEquals("Becker", user.getlName());
    }
}