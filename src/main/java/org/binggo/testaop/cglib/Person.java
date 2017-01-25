package org.binggo.testaop.cglib;

public class Person {
	
	public void work() {
		System.out.println("i am working");
	}
	
	// cann't be delegated
	public final void eat() {
		System.out.println("i am eating");
	}
	
	void walk() {
		System.out.println("i am walking");
	}
	
	public void callInternal() {
		internal();
	}
	
	private void internal() {
		System.out.println("internal call");
	}

}
