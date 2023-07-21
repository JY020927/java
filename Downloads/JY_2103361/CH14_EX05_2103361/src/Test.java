class A{
	void abc() {
		bcd();
		
		try {
			cde();
		} catch (InterruptedException e) {
			
		}
		
	}
	void bcd() { //직접 예외를 처리
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
	}
	void cde() throws InterruptedException { //예외를 전가
		Thread.sleep(1000);
	}
}


public class Test {
	public static void main(String[] args) {
		
			
		
	}
}
