package heima.dao.impl;

import heima.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("无参构造");
    }

    public void init() {
        System.out.println("初始化方法");
    }
    public void destroy() {
        System.out.println("销毁方法");
    }
    @Override
    public void save() {
        System.out.println("save running....");
    }
}
