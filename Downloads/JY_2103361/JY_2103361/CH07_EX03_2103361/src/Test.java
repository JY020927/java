//##Ŭ���� ���ο��� ���� ��� �޼��� ȣ���ϱ�
public class Test {
	public static void main(String[] args) {
		abc();
		
		System.out.println(bcd(3.8));
		
		double k = cde(3, 3.5);
		System.out.println(k);
		
	}
	
	static void abc() {
		System.out.println("�ȳ�");
	}
	static int bcd(double k) {
		return (int)(k*3.5);
	}
	static double cde(int a, double b) {
		return a+b;
	}

}
