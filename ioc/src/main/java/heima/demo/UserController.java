package heima.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import heima.servie.UserService;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContent.xml");
//        UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        userService.save();
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoImpl());
//        userService.save();
    }
}
