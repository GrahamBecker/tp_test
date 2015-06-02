package tp_test.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tp_test.domain.User;
import tp_test.services.UserService;

import java.util.List;

/**
 * Created by graham on 2015/06/02.
 */
@RestController
@RequestMapping("/api/**")
public class HomePage {
    @Autowired
    private UserService service;
    @RequestMapping(value = "home",method = RequestMethod.GET)
    public String Index(){
        return "This is a home page";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getUser(){
        User user = new User
                .Builder(201L)
                .fName("Graham")
                .lName("Becker")
                .dob("20/11/1984")
                .build();

        return user;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers(){
        return service.getUsers();
    }

}
