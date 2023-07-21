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
			//정상동작시
			System.out.println("정상동작1");
		} catch (MyException e) {
			//예외발생시
			System.out.println("예외발생1");
		}
	}
	void cde() {
		try {
			abc(60);
			//정상동작시
			System.out.println("정상동작2");
		} catch (MyException e) {
			//예외발생시
			System.out.println("예외발생2");
		}
		
	}
	
}


public class Test {
	public static void main(String[] args) {
		
			
		
	}
}
