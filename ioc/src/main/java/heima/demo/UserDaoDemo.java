package heima.demo;

import heima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContent.xml");
        ApplicationContext app = new FileSystemXmlApplicationContext("H:\\java_project\\spring_demo\\ioc\\src\\main\\resources\\applicationContent.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();

    }
}
