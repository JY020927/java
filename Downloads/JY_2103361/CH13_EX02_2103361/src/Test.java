class A{
	int a=3;
	static int b=5;
	void abc() {}
	static void bcd() {}
	
	static class B { //A$B.class
		int c = 7;
		static int d = 9;
		void bcd1() {
//			System.out.println(a); //static�� �ƴϱ� ������ ����
			System.out.println(b); //
			System.out.println(c); //
			System.out.println(d); //
//			abc(); //static�� �ƴϱ� ������ ����
			bcd();
		}
		static void bcd2() {
//			System.out.println(a); //static�� �ƴϱ� ������ ����
			System.out.println(b); //
//			System.out.println(c); //
			System.out.println(d); //
//			abc(); //static�� �ƴϱ� ������ ����
			bcd();
		}
	}
}
public class Test {
	public static void main(String[] args) {
		//#�̼� bcd1(), bcd2() �޼��带 ȣ���϶�.
		
		//static �̳�Ŭ������ ��ü ����
		A.B ab = new A.B();
		ab.bcd1();
		
		A.B.bcd2();
	}
}

