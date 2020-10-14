package text;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import heima.servie.UserService;

public class SpringTest {
    @Test
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContent.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
