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
			
			System.out.println("this.a"); //오류
			System.out.println("this.b"); //7
			System.out.println("this.c"); //8
			
			System.out.println("A.this.a"); //3
			System.out.println("B.this.b"); //5
			System.out.println("C.this.c"); //오류
		}
	}
}
public class Test {
	public static void main(String[] args) {
		//#미션 bcd()메서드를 호출하라.
		
		//#이너클래스 B의 객체를 만들기 위해서는 아우터클래스 A의 객체를 먼저 생성해야함
		A a = new A();
		
		//@bcd()를 호출하기 위해서는 이너클래스 B의 객체를 만들어야 함
		A.B ab=a.new B();
		
		//이너클래스 B의 객체 내부에 bcd()호출
		ab.bcd();
	}
}