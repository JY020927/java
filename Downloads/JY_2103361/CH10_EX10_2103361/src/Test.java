class A {
	String m;
	A(String m){
		this.m=m;
	}
}

class B {
	String m;
	B(String m){
		this.m=m;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.m == ((B)obj).m) {
			return true;
		}
		return false;
	}
}

public class Test {
	public static void main(String[] args) {
		A a1 = new A("¾È³ç");
		A a2 = new A("¾È³ç");
		
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
		B b1 = new B("¾È³ç");
		B b2 = new B("¾È³ç");
		
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}
}
