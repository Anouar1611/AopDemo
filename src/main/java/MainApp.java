import Mypackage.FacrtoryService;
import Mypackage.ServiceShape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
        ServiceShape serviceShape = ctx.getBean("serviceShape",ServiceShape.class);
        //FacrtoryService facrtoryService = new FacrtoryService();
        //ServiceShape serviceShape = (ServiceShape) facrtoryService.getBean("serviceShape");//This is the called object and the target object is the bean in the container Spring
        serviceShape.getCircle().getName();

    }
}
