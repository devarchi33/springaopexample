package skyfly33;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		SimpleService ss = (SimpleService) ctx.getBean("simpleServiceBean");

		ss.printName();
		System.out.println("----------------");

		try {
			ss.checkName();
		} catch (Exception e) {
			System.out
					.println("SimpleService checkName() : Exception thrown..");
		}		
		System.out.println("----------------");
		
		ss.sayHello("skyfly33");
		System.out.println("----------------");
		
		ctx.close();

	}
}
