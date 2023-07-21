
public class Test {
	public static void main(String[] args) {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			throw new Exception("예외발생");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			int a = 80;
			if(a<0) {
				throw new Exception("음수가 입력되어 예외발생");
			}
			else if(a>100) {
				throw new Exception("100보다 큰 수가 입력되어 예외발생");
			}
			System.out.println("당신의 점수는 " + a);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
