package tp_test.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import tp_test.App;
import tp_test.domain.NextOfKin;
import tp_test.domain.User;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by graham on 2015/06/02.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class UserRepositoryTest {

    Long id;
    @Autowired
    UserRepository repository;
/*
    @Test
    public void testCreate() throws Exception {

       // List<User> users = new ArrayList<User>();
        User user = new User.Builder(31L)
                .fName("Graham")
                .lName("Becker")
                .dob("20/11/1984")
                .build();
        repository.save(user);
        Assert.assertNotNull(user.getId());

        user = repository.findOne(user.getId());
        Assert.assertEquals("Graham",user.getfName());

    }*/

    @Test
    public void create() throws Exception {

        User user = new User
                .Builder(100L)
                .fName("Graham")
                .lName("Becker")
                .dob("20/11/1984")
                .build();

        //repository.save(user);

        id=user.getId();
        Assert.assertNotNull(user.getId());
    }
}