package org.binggo.testaop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class PersonInterceptor implements MethodInterceptor {

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		doBefore();
		Object result = proxy.invokeSuper(obj, args);
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
