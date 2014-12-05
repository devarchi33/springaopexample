package skyfly33.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.AfterThrowing;

@Aspect
public class DoAfterThrowingAspect {

	@AfterThrowing(pointcut = "execution(* skyfly33.SimpleService.checkName(..))", throwing = "error")
	public void doAfterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out
				.println("***AspectJ*** DoAfterThrowing() is running!! intercepted : "
						+ joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);
		System.out.println("*****");
	}
}
