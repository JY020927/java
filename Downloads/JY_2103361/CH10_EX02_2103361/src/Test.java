class A{
	int m=3;
	void abc() {
		System.out.println("A의 메서드");
	}
}
class B extends A{
	int n=3;
	void bcd() {
		System.out.println("B의 메서드");
	}
}
public class Test {
	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();
		
		System.out.println(((B)ab).n);
		((B)ab).bcd();
		
		B bb2 = (B)ab;
		System.out.println(bb2.n);
		bb2.bcd();
	}
}
