class A{
	void abc() throws ClassNotFoundException {
		bcd();
	}
	void bcd() throws ClassNotFoundException {
		cde();
	}
	void cde( ) throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object2");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.abc();
			System.out.println("예외미발생");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();			
		}
		System.out.println("프로그램 계속 진행");
	}
}