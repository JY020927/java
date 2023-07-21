public class Test {
	public static void main(String[] args) {
		
		//#1. 각각 생성
		try {
			int a=3;
			int b=1;
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("예외발생");
		}
		
		try {
			int c = Integer.parseInt("10A");
			System.out.println(c);
		}
		catch(NumberFormatException e) {
			System.out.println("예외발생");
		}
		
		//#2. 다중 catch문
		try {
			int a=3;
			int b=1;
			System.out.println(a/b);
			int c = Integer.parseInt("10A");
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("예외발생");
		}		
		catch(NumberFormatException e) {
			System.out.println("예외발생");
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
			System.out.println("예외발생");
		}		
		
	}
}