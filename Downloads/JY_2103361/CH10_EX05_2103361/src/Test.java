class A{
	int m=3;
	static int n=4;
	void abc() {
		System.out.println("A Ŭ������ instance �޼���");
	}
	static void bcd() {
		System.out.println("A Ŭ������ static �޼���");
	}
}

class B extends A{
	int m=5;
	static int n=6;
	void abc() {
		System.out.println("B Ŭ������ instance �޼���");
	}
	static void bcd() {
		System.out.println("B Ŭ������ static �޼���");
	}
}
public class Test {
	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa.m);
		System.out.println(aa.n);
		aa.abc();
		aa.bcd();	
		
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
				
		A ab = new B();
		System.out.println(ab.m);
		System.out.println(ab.n);
		ab.abc();
		ab.bcd();
	}
}
