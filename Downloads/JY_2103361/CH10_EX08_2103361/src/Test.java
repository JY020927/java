class A{
	int m = 3;
	int n = 5;
}

class B{
	int m = 3;
	int n = 5;
	
	@Override
	public String toString() {
		String str = m + ", " + n;
		return str;
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		System.out.println(a.toString());
		
		B b = new B();
		System.out.println(b);
		System.out.println(b.toString());
	}
}
