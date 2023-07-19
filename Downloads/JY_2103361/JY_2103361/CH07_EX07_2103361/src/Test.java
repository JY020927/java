//this Å°¿öµå

class A{
	int m;
	int n;
	void init1(int a, int b) {
		m=a;
		n=b;
	}
	void init2(int m, int n) {
		this.m=m;
		this.n=n;
	}
}
 
public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.init1(3, 4);
		System.out.println(a.m);
		System.out.println(a.n);
		a.init2(5,6);
		System.out.println(a.m);
		System.out.println(a.n);
	}

}