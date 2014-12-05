package skyfly33.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.JoinPoint;

@Aspect
public class DoAfterReturningAspect {

	@AfterReturning(pointcut = "execution(* skyfly33.SimpleService.sayHello(..))", returning = "result")
	public void doAfterReturning(JoinPoint joinPoint, Object result) {
		System.out
				.println("***AspectJ*** DoAfterReturning() is running!! intercepted : "
						+ joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
	}

}
