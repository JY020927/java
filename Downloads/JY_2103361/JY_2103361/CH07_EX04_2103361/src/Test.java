//#call by value(기본 자료형)

public class Test {
	public static void main(String[] args) {
		int a=3;
		int k1 = twice(3);
		System.out.println(a); //3
		int k2 = twice(a);
		System.out.println(a); //3
		
		int k = 5;
		change(k);
		System.out.println(k);
	}
	static int twice(int a) {
		a = a*2;
		System.out.println(a); //6
		return a;
	}
	
	static int change(int k) {
		k=8;
		return k;
	}

}
