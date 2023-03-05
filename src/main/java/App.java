import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecond =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(beanSecond));
        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat catSecond = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.equals(beanSecond));
    }
}