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
	public String toString() {
		return "m:"+m;
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A("�ȳ�");
		System.out.println(a);
		System.out.println(a.toString());
		
		B b = new B("����");
		System.out.println(b);
		System.out.println(b.toString());
	}

}
