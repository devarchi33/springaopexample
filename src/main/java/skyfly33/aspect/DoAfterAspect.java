package skyfly33.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class DoAfterAspect {

	@After("execution(* skyfly33.SimpleService.sayHello(..))")
	public void doAfter(JoinPoint joinPoint) {
		System.out
				.println("***AspectJ*** DoAfter() is running!! intercepted : "
						+ joinPoint.getSignature().getName());
	}
}
