//�޼��� �����ε�
class A{
	void abc() {
		System.out.println("A");
	}
	void abc(int a) {
		System.out.println("B");
	}
	void abc(double b) {
		System.out.println("C");
	}
	void abc(int a, double b) {
		System.out.println("D");
	}	
}

class B{
	void bcd() {
		System.out.println("���");
	}
	void bcd(int a) {
		System.out.println("���");
	}
	void bcd(int a, int b) {
		System.out.println("���");
	}
	void bcd(int a, int b, int c) {
		System.out.println("���");
	}
}

class C{
	void cde(int... a) {
		System.out.println("���");
	}
}
public class Test {
	public static void main(String[] args) {
		// ��ü����
		A a = new A();
		// �޼��� ȣ��
		a.abc();
		a.abc(3);
		a.abc(5.8);
		a.abc(2,0.5);
		
		// ��ü����
		B b = new B();
		// �޼��� ȣ��
		b.bcd();
		b.bcd(2);
		b.bcd(2, 3);
		b.bcd(2, 3, 4);
		
		// ��ü����
		C c = new C();
		// �޼��� ȣ��
		c.cde();
		c.cde(2);
		c.cde(2, 3);
		c.cde(2, 3, 4);
	}

}
