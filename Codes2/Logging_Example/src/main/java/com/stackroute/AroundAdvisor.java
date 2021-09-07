package com.stackroute;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//import org.springframework.aop.AfterReturningAdvice;
//import org.springframework.aop.MethodBeforeAdvice;
//aspect
public class AroundAdvisor implements MethodInterceptor {

//	@Override
//	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
//		System.out.println("after advice");
//		
//	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj;
		System.out.println("before advice");
		obj=invocation.proceed();
		System.out.println("After  advice");
		return obj;
	}
	
     //Advice(event handler)
//
//	public void before(Method method, Object[] args, Object target) throws Throwable {
//		System.out.println("we are inside advice, you are going to execute "+method.getName()+" method");
//		
//	}

}
