package tp_test.conf.factory;

import tp_test.domain.NextOfKin;

/**
 * Created by graham on 2015/06/02.
 */
public class NextOfKinFactory {
    public static NextOfKin createNextOfKin(Long id,
                                            String name,
                                            String relation){
        NextOfKin nextOfKin = new NextOfKin
                .Builder(id)
                .name(name)
                .relation(relation)
                .build();
        return nextOfKin;
    }
}
