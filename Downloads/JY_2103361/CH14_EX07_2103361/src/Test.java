
public class Test {
	public static void main(String[] args) {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			throw new Exception("���ܹ߻�");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			int a = 80;
			if(a<0) {
				throw new Exception("������ �ԷµǾ� ���ܹ߻�");
			}
			else if(a>100) {
				throw new Exception("100���� ū ���� �ԷµǾ� ���ܹ߻�");
			}
			System.out.println("����� ������ " + a);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
