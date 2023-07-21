
public class Test {
	public static void main(String[] args) {
		//#if
		int a=3;
		if(a>2) {
			System.out.println("출력"); //0
		}
		if(a>0) {
			System.out.println("출력"); //0
		}
		
		//#if-else
		if(a>2) {
			System.out.println("출력1");
		}
		else {
			System.out.println("출력2");
		}
		
		//#if-else if-else
		if(a>2) {
			System.out.println("출력");
		}
		else if (a>0) {
			System.out.println("출력");
		}
		
		int s=85;
		if(s>=90) {
			System.out.println("A");
		}
		else if (s>=80) {
			System.out.println("B");
		}
		else if (s>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		
		s=92;
		if (s>=70) {
			System.out.println("C");
		}
		else if (s>=80) {
			System.out.println("B");
		}
		else if(s>=90) {
			System.out.println("A");
		}
		else {
			System.out.println("F");
		}
		
		s=92;
		if (s>=70 && s<80) {
			System.out.println("C");
		}
		else if (s>=80 && s<90) {
			System.out.println("B");
		}
		else if(s>=90) {
			System.out.println("A");
		}
		else {
			System.out.println("F");
		}
		
	}
}
