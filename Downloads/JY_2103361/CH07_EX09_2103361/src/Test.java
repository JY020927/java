
class A {
	int m;
	int n;
	
	void init(int m, int n) {
		m=m;
		n=n;
	}
}

class B {
	int m;
	int n;
	
	void init(int m, int n) {
		this.m=m;
		this.n=n;
	}
}

public class Test {
	public static void main(String[] args) {
		
		//#1. �ʵ��� �������� ���� ���� ���(this Ű���带 ������� ���� ���)
		A a = new A();
		a.init(2,  3);
		System.out.println(a.m); //0
		System.out.println(a.n); //0
		
		//#2. �ʵ��� �������� ���� ���� ���(this Ű���带 ���� ����ϴ� ���)
		B b = new B();
		a.init(2,  3);
		System.out.println(a.m); //2
		System.out.println(a.n); //3
	}

}
