package tp_test.repository;

import org.springframework.data.repository.CrudRepository;
import tp_test.domain.User;

/**
 * Created by graham on 2015/06/02.
 */
public interface UserRepository extends CrudRepository<User,Long> {
    //public User findByCode(String code);
}
