class MyException extends Exception{

	public MyException() {
		super();		
	}

	public MyException(String message) {
		super(message);		
	}	

}

class A{
	
	void abc(int num) throws MyException{
		if(num<70)
			throw new MyException();
	}
	void bcd() {
		try {
			abc(60);
			//�����۽�
			System.out.println("������1");
		} catch (MyException e) {
			//���ܹ߻���
			System.out.println("���ܹ߻�1");
		}
	}
	void cde() {
		try {
			abc(60);
			//�����۽�
			System.out.println("������2");
		} catch (MyException e) {
			//���ܹ߻���
			System.out.println("���ܹ߻�2");
		}
		
	}
	
}


public class Test {
	public static void main(String[] args) {
		
			
		
	}
}
