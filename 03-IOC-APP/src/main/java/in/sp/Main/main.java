package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.bean.Student;
import in.sp.resource.springConfic;
public class main {

	public static void main(String[] args) {
		//ApplicationContext context=new AnnotionConfigurationContext(springConfic.class);
		ApplicationContext context = new AnnotationConfigApplicationContext(springConfic.class);
		
		Student std;
		std=context.getBean(Student.class);
		std.display();
	}

}
