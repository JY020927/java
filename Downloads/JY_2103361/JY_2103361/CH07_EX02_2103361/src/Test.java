//##클래스 외부에서 다른 클래스의 메서드 호출하기

class A {
	int abc() {
		int a = 7;
		//...
		return a;
	}
	double bcd(int k) {
		return k*1.0;
	}
	int cde(double k) {
		return (int)k;
	}
	void def(int k) {
		if(k>0) {
			System.out.println("양수");
			return; //리턴만 올 수 있음 양수 들어오면 여기서 끝
		} else {
			System.out.println("양수가 아님");
		}
		System.out.println("종료합니다.");
	}
}


public class Test {
	public static void main(String[] args) {
		
		//#메서드 사용하기
		//#1.객체 생성
		A a = new A();
		
		//#2.메서드 호출
		int r = a.abc();
		System.out.println(r); //7
		
		double m = a.bcd(3);
		System.out.println(m); //3.0
		
		int n = a.cde(5.8);
		System.out.println(n); //5
		
		a.def(3);
		a.def(-2);
	}

}
