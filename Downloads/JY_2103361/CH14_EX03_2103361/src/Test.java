public class Test {
	public static void main(String[] args) {
		
		//#1. ���� ����
		try {
			int a=3;
			int b=1;
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("���ܹ߻�");
		}
		
		try {
			int c = Integer.parseInt("10A");
			System.out.println(c);
		}
		catch(NumberFormatException e) {
			System.out.println("���ܹ߻�");
		}
		
		//#2. ���� catch��
		try {
			int a=3;
			int b=1;
			System.out.println(a/b);
			int c = Integer.parseInt("10A");
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("���ܹ߻�");
		}		
		catch(NumberFormatException e) {
			System.out.println("���ܹ߻�");
		}
		
		//#3. 
		try {
			int a=3;
			int b=1;
			System.out.println(a/b);
			int c = Integer.parseInt("10A");
			System.out.println(c);
		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("���ܹ߻�");
		}		
		
	}
}