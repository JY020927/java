//##Ŭ���� �ܺο��� �ٸ� Ŭ������ �޼��� ȣ���ϱ�

class A {
	int abc() {
		int a = 7;
		//...
		return a;
	}
	double bcd(int k) {
		return k*1.0;
	}
	int cde(double k) {
		return (int)k;
	}
	void def(int k) {
		if(k>0) {
			System.out.println("���");
			return; //���ϸ� �� �� ���� ��� ������ ���⼭ ��
		} else {
			System.out.println("����� �ƴ�");
		}
		System.out.println("�����մϴ�.");
	}
}


public class Test {
	public static void main(String[] args) {
		
		//#�޼��� ����ϱ�
		//#1.��ü ����
		A a = new A();
		
		//#2.�޼��� ȣ��
		int r = a.abc();
		System.out.println(r); //7
		
		double m = a.bcd(3);
		System.out.println(m); //3.0
		
		int n = a.cde(5.8);
		System.out.println(n); //5
		
		a.def(3);
		a.def(-2);
	}

}
