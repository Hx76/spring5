import com.hx76.config.Config;
import com.hx76.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                Config.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.toString());
    }
}
