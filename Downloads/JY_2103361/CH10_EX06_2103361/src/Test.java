class A{
	void abc() {
		System.out.println("�޸��Ҵ�+�ʱ�ȭ �� 100�� �ڵ�");
	}
}

class B extends A{
	void abc() {
		//System.out.println("�޸��Ҵ�+�ʱ�ȭ �� 100�� �ڵ�");
		super.abc();
		System.out.println("�߰� 1�� �ڵ�");
	}
	void bcd() {
		abc();
	}
	void cde() {
		super.abc();
	}
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
		
		b.bcd();
		b.cde();
	}
}
