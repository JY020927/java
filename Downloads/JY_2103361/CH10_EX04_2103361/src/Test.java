class A{
	void print() {
		System.out.println("A");
	}
}
class B{
	void print() {
		System.out.println("B");
	}
}

public class Test {
	public static void main(String[] args) {
		//#1
		A aa = new A();
		aa.print(); //A
		
		//#2.
		B bb = new B();
		bb.print(); //B
		
		//#3.
		B ab = new B();
		ab.print(); //B
	}
}
