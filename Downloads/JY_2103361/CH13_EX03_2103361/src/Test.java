class A{
	int a=3; //필드
	void abc() {
		int b=5; //지역변수
		
		class B { //지역이너클래스  A$1B.class
			void bcd() {
				System.out.println(a);
				System.out.println(b);				
				a=7;
//				b=9; //이미 final로 바뀌었기 때문에 값 변경불가
			}
		}
		
		//지역이너클래스를 사용할 수 있는 유일한 지점
		B bb = new B();
		bb.bcd();
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
