//1. package
//2. import
//3. class(외부 클래스는 절대로 public를 붙일 수 없다)

class A{
	int m;
	void printData() {
		System.out.println("안녕"+m);
	}
}

public class Test {
	public static void main(String[] args) {
		//객체 생성
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1.m); //필드값 강제 초기화 0
		System.out.println(a2.m); //필드값 강제 초기화 0
		a1.printData(); //메서드 호출
		a2.printData(); //메서드 호출
		a1.m=5;
		a2.m=7;
		System.out.println(a1.m);
		System.out.println(a2.m);
		a1.printData(); //메서드 호출
		a2.printData(); //메서드 호출
	}
	
	//1. 필드
	//2. 메서드
	//3. 생성자
	//4. 이너클래스


}
