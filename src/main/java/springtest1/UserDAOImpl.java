package springtest1;

import org.springframework.stereotype.Repository;
import springtest1.dao.UserDAO;


@Repository      //@Repository这是一个dao层的类，由spring托管
                 //@Component
public class UserDAOImpl implements UserDAO {
    @Override
    public void add(String uname) {
        System.out.println("添加了："+uname);
    }

    public UserDAOImpl() {
        System.out.println("UserDAOImpl类的构造");
    }
}
