package springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springtest1.Config;
import springtest1.biz.UserBiz;
import springtest1.biz.UserBizImpl;
import springtest1.dao.UserDAO;

public class App1 {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
//        UserDAO ud= (UserDAO) container.getBean("userDAOImpl");
//        ud.add("张三");

//        UserBiz ub= (UserBiz) container.getBean("userBizImpl");
//        ub.add("王五");
    }
}
