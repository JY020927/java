interface A{
	void abc();
}
class B implements A{
	@Override
	public void abc() {
		System.out.println("�ڽ�Ŭ���� ��������");
	}
}

class C {
	void cde(A a) {
		a.abc();
	}
}



public class Test {
	public static void main(String[] args) {
		//#�̼�, cde()�޼��带 ȣ���ϴ� ���� 4����
		
		//@��� 1.
		C c1 = new C();
		A a1 = new B();
		c1.cde(a1);
		
		//@��� 2.
		C c2 = new C();
		c2.cde(new B());
		
		//@��� 3.
		C c3 = new C();
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("�͸��̳�Ŭ���� ����");
			}
		};				
		c3.cde(a2);
		
		//@��� 4.
		C c4 = new C();			
		c4.cde(new A() {
			@Override
			public void abc() {
				System.out.println("�͸��̳�Ŭ���� ����");
			}
		});

	}
}
