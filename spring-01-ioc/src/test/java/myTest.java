import com.hx76.dao.UserDao;
import com.hx76.dao.UserDaoImpl;
import com.hx76.dao.UserDaoMysqlImpl;
import com.hx76.service.UserService;
import com.hx76.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "application.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUserName();
    }
    public static void main(String[] args) {
        test1();
        //用户实际调用dao层，不接触dao层
        UserServiceImpl userService = new UserServiceImpl();

        userService.setDao(new UserDaoMysqlImpl());
        userService.getUserName();

    }
}
