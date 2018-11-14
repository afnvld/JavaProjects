package MavenDemo;

import org.junit.Test;

public class TestAbstract extends Abstractioon {
	
	@Test
	public void test() {
		setAge(6);
		super.sayHello();
		sayHello();
		System.out.println(age);
	}
	
	public void sayHello() {
		System.out.println("Say Hello World");
	}
}
