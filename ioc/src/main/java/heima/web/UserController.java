package heima.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import heima.servie.UserService;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContent.xml");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
