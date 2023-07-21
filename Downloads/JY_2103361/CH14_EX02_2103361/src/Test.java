import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class A{}
class B extends A{}

public class Test {
	public static void main(String[] args) {
		//실행예외 (unchecked exception = Runtime Exception)
		
		try {
			System.out.println(3/0);		
		}
		catch(ArithmeticException e) {
			
		}
		
		try {
			int a = Integer.parseInt("10!");
		}
		catch(NumberFormatException e) {
			
		}
		
		A a1 = new B();
		B b1 = (B)a1;//정상동작
				
		try {
			A a2 = new A();
			B b2 = (B)a2;//정상동작
		}
		catch(ClassCastException e) {
			
		}
		
		int[] b = {1,2,3};
		System.out.println(b[2]); //정상동작
		try {
			System.out.println(b[3]); //예외발생
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
		String a = "안녕";
		System.out.println(a.charAt(1)); //
		
		try {
			String ab = null;
			System.out.println(ab.charAt(1));
		}
		catch(NullPointerException e) {
			
		}
		
		
		
		System.out.println("프로그램 계속 진행");
		
		
	}
}
