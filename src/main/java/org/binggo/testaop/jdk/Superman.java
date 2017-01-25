package org.binggo.testaop.jdk;

public class Superman implements Flyable {
	
	private String name = "superman";

	public void fly() {
		System.out.println(String.format("%s is flying", name));
	}

	public void spreadWings() {
		System.out.println(String.format("%s is spread its wings", name));
	}

	public void sing() {
		System.out.println(String.format("%s is singing", name));
	}

}
