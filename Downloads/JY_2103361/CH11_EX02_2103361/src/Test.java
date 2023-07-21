class A1{
	void abc() {		
	}
}
class B1 extends A1{
	void abc() {	
		System.out.println("오버라이딩됨");
	}
}

abstract class A2{
	abstract void abc();
}
class B2 extends A2{
	@Override
	void abc() {
		System.out.println("오버라이딩됨");
	}
}

public class Test {
	public static void main(String[] args) {
		
	}
}
