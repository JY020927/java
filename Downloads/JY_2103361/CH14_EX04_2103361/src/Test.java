class A implements AutoCloseable{
	String resource;
	A(String resource){
		this.resource = resource;
	}
	void abc() throws Exception {
		
	}
	@Override
	public void close() throws Exception {
		System.out.println("close가 호출되어 리소스를 해제하였습니다.");
	}
}

public class Test {
	public static void main(String[] args) {
		
		//리소스 자동해제 try-catch
		
		try (A a = new A("리소스");){
			a.abc();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	
		
	}
}
