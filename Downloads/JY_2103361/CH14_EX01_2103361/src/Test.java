import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args) {
		//일반예외 (checked exception)
		try {
			Thread.sleep(1000); 
		}
		catch(InterruptedException e) {
			System.out.println("예외발생");
		}
		
		try {
			Class cls = Class.forName("java.lang.Object2");
		}
		catch(ClassNotFoundException e) {
			System.out.println("예외발생");
		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			isr.read();
		}
		catch(IOException e) {
			
		}
		
		try {
			FileInputStream fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {			

		}
		
		
		
		
		
		System.out.println("프로그램 계속 진행");
		
		
	}
}
