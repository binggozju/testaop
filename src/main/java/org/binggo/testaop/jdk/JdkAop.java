package org.binggo.testaop.jdk;

import java.lang.reflect.Proxy;

public class JdkAop {
	
	public static void TestJdkAop() {
		Superman target = new Superman();
		LogHandler logHandler = new LogHandler(target);
		
		Flyable proxy = (Flyable) Proxy.newProxyInstance(
				target.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), 
				logHandler
			);
		
		System.out.println(String.format("the proxy class: %s", proxy.getClass().getName()));
		proxy.spreadWings();
		//proxy.fly();
	}

}
