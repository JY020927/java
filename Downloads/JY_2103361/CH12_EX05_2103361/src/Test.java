interface A{
	void abc();
	default void bcd() {
		System.out.println("�������̽� ����Ʈ �޼���");
	}
	static void cde() {
		System.out.println("�������̽� ����(static) �޼���");
	}
}

class B implements A{	
	public void abc() {
		System.out.println("Ŭ���� B�� abc()");
	}
	public void bcd() {
		System.out.println("Ŭ���� B�� bcd()");
	}
}

public class Test {
	public static void main(String[] args) {
		
		//�����޼��� ����ϱ�
		A.cde();
		//����Ʈ �޼��� ����ϱ� (�ڽ�Ŭ������ ����)
		A a = new B();
		a.abc();
		a.bcd();
		
		
	}
}