import com.hx76.pojo.Hello;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "application.xml");
        //对象都在Spring中管理了，要使用直接取出来就可以了。
        Hello hello = (Hello) context.getBean("hello");
        hello.sayHello();
    }
}
