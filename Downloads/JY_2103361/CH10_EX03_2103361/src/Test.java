class A{}
class B extends A{}
class C extends B{}
class D extends C{}

public class Test {
	public static void main(String[] args) {
		B bc = new C();
		
		System.out.println(bc instanceof A);
		System.out.println(bc instanceof B);
		System.out.println(bc instanceof C);
		System.out.println(bc instanceof D);
		
		String str ="�ȳ�";
		System.out.println(str instanceof String); //true
		System.out.println("�ȳ�" instanceof String); //true
	}
}
