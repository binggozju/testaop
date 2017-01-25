package org.binggo.testaop;

import org.binggo.testaop.cglib.CglibAop;
import org.binggo.testaop.javassist.JavassistAop;
import org.binggo.testaop.jdk.JdkAop;

public class App {
	
    public static void main( String[] args )
    {
        // jdk aop
    	JdkAop.TestJdkAop();
    	
    	// cglib aop
    	CglibAop.TestCglibAop();
    	
    	// javassist aop
    	JavassistAop.TestJavassistAop();
    }
}
