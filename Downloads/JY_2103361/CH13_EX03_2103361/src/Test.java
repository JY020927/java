class A{
	int a=3; //�ʵ�
	void abc() {
		int b=5; //��������
		
		class B { //�����̳�Ŭ����  A$1B.class
			void bcd() {
				System.out.println(a);
				System.out.println(b);				
				a=7;
//				b=9; //�̹� final�� �ٲ���� ������ �� ����Ұ�
			}
		}
		
		//�����̳�Ŭ������ ����� �� �ִ� ������ ����
		B bb = new B();
		bb.bcd();
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
