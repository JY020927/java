class A implements AutoCloseable{
	String resource;
	A(String resource){
		this.resource = resource;
	}
	void abc() throws Exception {
		
	}
	@Override
	public void close() throws Exception {
		System.out.println("close�� ȣ��Ǿ� ���ҽ��� �����Ͽ����ϴ�.");
	}
}

public class Test {
	public static void main(String[] args) {
		
		//���ҽ� �ڵ����� try-catch
		
		try (A a = new A("���ҽ�");){
			a.abc();
		} catch (Exception e) {
			System.out.println("���ܹ߻�");
		}
	
		
	}
}
