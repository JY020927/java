//필드와 지역변수

class A {
	int m;
	double p;
	B q;
	int n;
	void work1() {
		int k = 3;
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j=5;
		System.out.println(i+j);
	}
}
class B{
	
}
public class Test {
	public static void main(String[] args) {
		//#1. 객체 생성
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		a.work1();
	}

}
