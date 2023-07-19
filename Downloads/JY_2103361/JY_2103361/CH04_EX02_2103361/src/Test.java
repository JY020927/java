
public class Test {
	public static void main(String[] args) {
		//switch
		int a=9;
		switch(a) {
		case 10:
			System.out.println("A");
		case 9:
			System.out.println("B");
		case 8:
			System.out.println("C");
		case 7:
			System.out.println("D");
		default:
			System.out.println("F");
		}
		
		//#2. switch
		char b='C';
		switch(b) {
		case 'A':
			System.out.println("A");
		case 'B':
			System.out.println("B");
		case 'C':
			System.out.println("C");
		case 'D':
			System.out.println("D");
		default:
			System.out.println("F");
		}
		
		//#3. switch
		String c="¾È³ç";
		switch(c) {
		case "¹æ°¡":
			System.out.println("A");
		case "¾È³ç":
			System.out.println("B");
		case "¶¯Å¥":
			System.out.println("C");
		case "°¨»ç":
			System.out.println("D");
		default:
			System.out.println("F");
		}
	}
}
