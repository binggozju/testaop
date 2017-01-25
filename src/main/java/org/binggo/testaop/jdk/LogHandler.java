package org.binggo.testaop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
	
	private Object target;
	
	public LogHandler(Object target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		doBefore();
		
		System.out.println(String.format("executing %s", method.getName()));
		Object result = method.invoke(target, args);
		
		doAfter();
		return result;
	}
	
	private void doBefore() {
		System.out.println("executing doBefore");
	}
	
	private void doAfter() {
		System.out.println("executing doAfter");
	}

}
