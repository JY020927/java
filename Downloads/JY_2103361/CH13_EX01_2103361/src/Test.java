class A{
	int a=3;
	int b=5;
	class B { //A$B.class
		int b=7;
		int c=8;
		void bcd() {
			System.out.println("a");
			System.out.println("b");
			System.out.println("c");
			
			System.out.println("this.a"); //����
			System.out.println("this.b"); //7
			System.out.println("this.c"); //8
			
			System.out.println("A.this.a"); //3
			System.out.println("B.this.b"); //5
			System.out.println("C.this.c"); //����
		}
	}
}
public class Test {
	public static void main(String[] args) {
		//#�̼� bcd()�޼��带 ȣ���϶�.
		
		//#�̳�Ŭ���� B�� ��ü�� ����� ���ؼ��� �ƿ���Ŭ���� A�� ��ü�� ���� �����ؾ���
		A a = new A();
		
		//@bcd()�� ȣ���ϱ� ���ؼ��� �̳�Ŭ���� B�� ��ü�� ������ ��
		A.B ab=a.new B();
		
		//�̳�Ŭ���� B�� ��ü ���ο� bcd()ȣ��
		ab.bcd();
	}
}