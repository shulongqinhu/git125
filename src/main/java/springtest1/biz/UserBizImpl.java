package springtest1.biz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import springtest1.dao.UserDAO;

import javax.annotation.Resource;

@Service
public class UserBizImpl implements UserBiz{

//    @Resource(name = "userDAOIpl")   //由spring容器根据id名为useDAOImpl到容器中找实例，并注入

    @Autowired                     //根据类型完成注入，在spring容器中根据类型UserDAO接口找实例
    @Qualifier("userDAOImpl")
    private UserDAO userdao;

    public UserBizImpl() {
        System.out.println("UserBizImpl构造");
    }

    @Override
    public void add(String uname) {
        userdao.add(uname);
    }
}
