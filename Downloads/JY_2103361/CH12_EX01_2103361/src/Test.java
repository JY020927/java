//�߻�Ŭ����Ÿ���� ��ü ����
abstract class A{
	abstract void abc();
}

//#���1-1
class B extends A{
	@Override
	void abc() {
		System.out.println("B");
	}
}


public class Test {
	public static void main(String[] args) {
		
		//#���1-2
		A a = new B();
		
		//#���2
		A a2 = new A() {
			void abc() {
				System.out.println("B");
			}
		};
	}
}
