package test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//	어노테이션을 붙이고 component scan 을 이용해서 bean 으로 등록
@Aspect
@Component
public class PrintLogAspect {
	
	@Around("execution(public void insert())")
	public Object printLog(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("비즈니스 로직을 수행하기 직전입니다.");
		Object obj = joinPoint.proceed(); //로직 수행
		System.out.println("비즈니스 로직을 수행했습니다.");
		return obj;
	}
	
	@Around("execution(public void select())")
	//메소드를 하나 더 만들어서 select 메소드에 적용해 보세요.
	public Object printLog2(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("비즈니스 로직을 수행 전");
		Object obj = joinPoint.proceed(); //로직 수행
		System.out.println("비즈니스 로직을 수행 후");
		return obj;
	}
}
