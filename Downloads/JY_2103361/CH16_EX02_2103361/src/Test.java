//#���׸��޼���

class A{
	<T> void abc(T t) {
		System.out.println(t.); 
		System.out.println(t.length()); //#���� Object �޼��常 ��밡��
	}
	<T> T bcd(T t) {
		return t;
	}
	<T extends String> void cde(T t){
		System.out.println(t); 
		System.out.println(t.length()); //#������: �ü��ִ� �ֻ��� Ŭ������ String Ŭ������ �޼��� ��밡�� 
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		
		a.<String>abc("�ȳ��ϼ���");
		a.abc("�ȳ��ϼ���"); //�����Ϸ��� �Ű������� �����Ͽ� <String> ���Խ�����
		
		a.<Integer>abc(30);
		a.abc(30);
		
		a.<Double>abc(5.8);
		a.abc(5.8);
		
	}
}