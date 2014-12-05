package skyfly33.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DoBeforeAspect {

	@Before("execution(* skyfly33.SimpleService.sayHello(..))")
	public void doBefore(JoinPoint joinPoint) {

		System.out
				.println("***AspectJ*** DoBefor() is running!! intercepted : "
						+ joinPoint.getSignature().getName());
	}
}
