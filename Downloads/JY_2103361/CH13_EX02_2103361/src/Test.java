class A{
	int a=3;
	static int b=5;
	void abc() {}
	static void bcd() {}
	
	static class B { //A$B.class
		int c = 7;
		static int d = 9;
		void bcd1() {
//			System.out.println(a); //static이 아니기 때문에 오류
			System.out.println(b); //
			System.out.println(c); //
			System.out.println(d); //
//			abc(); //static이 아니기 때문에 오류
			bcd();
		}
		static void bcd2() {
//			System.out.println(a); //static이 아니기 때문에 오류
			System.out.println(b); //
//			System.out.println(c); //
			System.out.println(d); //
//			abc(); //static이 아니기 때문에 오류
			bcd();
		}
	}
}
public class Test {
	public static void main(String[] args) {
		//#미션 bcd1(), bcd2() 메서드를 호출하라.
		
		//static 이너클래스이 객체 생성
		A.B ab = new A.B();
		ab.bcd1();
		
		A.B.bcd2();
	}
}

