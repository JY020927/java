class A{
	void abc() {
		bcd();
		
		try {
			cde();
		} catch (InterruptedException e) {
			
		}
		
	}
	void bcd() { //���� ���ܸ� ó��
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
	}
	void cde() throws InterruptedException { //���ܸ� ����
		Thread.sleep(1000);
	}
}


public class Test {
	public static void main(String[] args) {
		
			
		
	}
}
