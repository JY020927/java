
public class Test {
	public static void main(String[] args) {
		//#1. switch
		int a=9;
		switch(a) {
		case 10:
			System.out.println("A");
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
		
		//#2. switch
		switch(a) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
		
		//#4. if
		if(a>=9) {
			System.out.println("A");
		}
		else if (a==8) {
			System.out.println("B");
		}
		else if (a==7) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		//#5. if -> switch
		switch(a/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
		}
	}
}
