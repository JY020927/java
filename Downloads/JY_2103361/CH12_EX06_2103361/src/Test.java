interface A {
	default void abc() {
		System.out.println("A");
	}
}

interface B {
	default void abc() {
		System.out.println("B");
	}
}

class C {
	void abc() {
		System.out.println("C");
	}
}

class D extends C implements A,B {
	public void abc() {
		System.out.println("D");
	}
	void ddd() {
		abc();
		super.abc();
		A.super.abc();
		B.super.abc();
	}
}

public class Test {

}
