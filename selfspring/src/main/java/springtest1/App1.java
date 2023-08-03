package springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springtest1.dao.UserDao;

public class App1 {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
        UserDao ud= (UserDao) container.getBean("userDaoImpl");
        ud.add("张三");
    }
}
