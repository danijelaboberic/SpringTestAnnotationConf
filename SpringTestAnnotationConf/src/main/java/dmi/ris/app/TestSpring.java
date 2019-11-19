package dmi.ris.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import dmi.ris.config.AppConfig;

public class TestSpring {

	public static void main(String[] args){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);		 
		Student s= ctx.getBean(Student.class);
		s.setIme("Marko Markovic");
		s.predstaviSe();
	}


}
