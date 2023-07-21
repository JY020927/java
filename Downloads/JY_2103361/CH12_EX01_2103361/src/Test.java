//眠惑努贰胶鸥涝狼 按眉 积己
abstract class A{
	abstract void abc();
}

//#规过1-1
class B extends A{
	@Override
	void abc() {
		System.out.println("B");
	}
}


public class Test {
	public static void main(String[] args) {
		
		//#规过1-2
		A a = new B();
		
		//#规过2
		A a2 = new A() {
			void abc() {
				System.out.println("B");
			}
		};
	}
}
