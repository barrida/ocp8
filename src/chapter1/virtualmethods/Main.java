package chapter1.virtualmethods;

abstract class A {
	String var = "variable A";

	public void print() {
		System.out.println(var);
	}

	public void start() {
		foo();
	}

	public void foo() {
		System.out.println("Class A");
	}
}

class B extends A {
	String var = "variable B";

	public void foo() {
		System.out.println("Class B");
	}
}

class C extends B {
	public void foo() {
		System.out.println("Class C");
	}
}

public class Main {

	public static void main(String[] args) {
		A a = new B();
		a.start();
		a.print();
		
		B b = new C();
		b.start();
		
	}

}
