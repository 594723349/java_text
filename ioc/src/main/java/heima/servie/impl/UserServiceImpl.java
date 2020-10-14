package heima.servie.impl;

import heima.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import heima.servie.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
//    @Autowired
    @Resource(name="userDao")
    private UserDao userDao;
    @Value("${jdbc.driver}")
    private String driver;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    public UserServiceImpl() {

    }

    @Override
    public void save() {
        System.out.println("UserServiceImpl创建");
        System.out.println(driver);
        userDao.save();
    }
}
