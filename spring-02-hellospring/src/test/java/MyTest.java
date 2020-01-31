import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author spw
 * @create 2020-01-31 11:58
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    }
}
