package tp_test.conf.factory;

import tp_test.domain.NextOfKin;
import tp_test.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Created by graham on 2015/06/02.
 */
public class UserFactory {

    public static User createUser(Long id,
                                  String dob,
                                  Map<String,String> values,
                                  List<NextOfKin> nextOfKins){

        User user = new User
                .Builder(id)
                .fName(values.get("fname"))
                .lName(values.get("lname"))
                .dob(dob)
                .nextOfKins(nextOfKins)
                .build();
        return user;
    }
}
