//this()

class A{
	A(){
		this(2.8);
		System.out.println("A");
	}
	A(int a){
		this(); //
		System.out.println("B");
	}
	A(double b){
		this(1,2); //
		System.out.println("C");
	}
	A(int a, int b){
		System.out.println("D");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A(3); //DCAB
	}
}