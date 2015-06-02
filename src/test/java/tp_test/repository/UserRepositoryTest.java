package tp_test.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import tp_test.App;
import tp_test.conf.factory.UserFactory;
import tp_test.domain.NextOfKin;
import tp_test.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


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

    @Test
    public void create() throws Exception {
            System.out.println( "Hello World");
            User user = new User
                    .Builder(201L)
                    .fName("Graham")
                    .lName("Becker")
                    .dob("20/11/1984")
                    .build();

            repository.save(user);
            id=user.getId();
            Assert.assertNotNull(user.getId());
        }

}