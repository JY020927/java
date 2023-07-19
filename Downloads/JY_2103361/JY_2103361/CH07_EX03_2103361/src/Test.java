//##클래스 내부에서 같은 멤버 메서드 호출하기
public class Test {
	public static void main(String[] args) {
		abc();
		
		System.out.println(bcd(3.8));
		
		double k = cde(3, 3.5);
		System.out.println(k);
		
	}
	
	static void abc() {
		System.out.println("안녕");
	}
	static int bcd(double k) {
		return (int)(k*3.5);
	}
	static double cde(int a, double b) {
		return a+b;
	}

}
