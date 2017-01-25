package org.binggo.testaop.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibAop {
	
	public static void TestCglibAop() {
		Person person = new Person();
		PersonInterceptor personInterceptor  = new PersonInterceptor();
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(person.getClass());
		enhancer.setCallback(personInterceptor);
		
		Person proxy = (Person) enhancer.create();
		proxy.work();
		proxy.eat();
		proxy.walk();
		proxy.callInternal();
	}

}
