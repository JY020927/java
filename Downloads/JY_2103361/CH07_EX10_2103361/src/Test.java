//this(�������� �Ű�����) ������Ư¡�� �ǹ� : �ڽ��� ���� Ŭ������ �ٸ� ������ ȣ��
//#1. Ŭ������ ����
class A {
	A() {
		System.out.println("ù��° ������");
	}
	A(int a){
		this(); //�������� ù �ٿ��� �� �� �ִ�.
		System.out.println("�ι�° ������");
	}
//	void abc() {
//		this(); //�Ұ���
//	}
}

public class Test {
	public static void main(String[] args) {
		
		//#2. ��ü ����
		A a1 = new A(); //ù��° ������
		System.out.println();
		A a2 = new A(3); //ù��° ������ -> �ι�° ������
	}

}
