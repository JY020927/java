class A{
	//1.�����տ� final�� �ٴ� ���
	int a=3;
	final int b=5;
	
	//2.�޼���տ� final�� �ٴ� ���
	void abc() {
		System.out.println("A");
	}
	final void bcd() {
		System.out.println("B");
	}
}
class B extends A{
	void abc() {
		System.out.println("A");
	}
//	void bcd() { //final �޼���� �������̵� �Ұ�
//		System.out.println("B");
//	}
}

//3.Ŭ�����տ� final�� �ٴ� ���
final class C{ }
//class D extends C {} //final Ŭ������ ��� �Ұ�



public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.a=7;
//		a.b=9; //final �ʵ��̱� ������ �� ���� �Ұ�
	}
}
