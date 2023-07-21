//#제네릭메서드

class A{
	<T> void abc(T t) {
		System.out.println(t.); 
		System.out.println(t.length()); //#오류 Object 메서드만 사용가능
	}
	<T> T bcd(T t) {
		return t;
	}
	<T extends String> void cde(T t){
		System.out.println(t); 
		System.out.println(t.length()); //#정상동작: 올수있는 최상위 클래스인 String 클래스의 메서드 사용가능 
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		
		a.<String>abc("안녕하세요");
		a.abc("안녕하세요"); //컴파일러가 매개변수로 유추하여 <String> 삽입시켜줌
		
		a.<Integer>abc(30);
		a.abc(30);
		
		a.<Double>abc(5.8);
		a.abc(5.8);
		
	}
}