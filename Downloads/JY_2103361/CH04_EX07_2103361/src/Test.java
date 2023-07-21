
public class Test {
	public static void main(String[] args) {
		//break #1
		for(int i=0; i<10; i++) {
			if(i==3) {
				break;
			}
			System.out.println("A"); //3¹ø
		}
		//break #2
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(i==1) {
					break;
				}
				System.out.println("A"); //12
			}
		}
		//break #3
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(j==1) {
					break;
				}
				System.out.println("A"); //5
			}
		}
		//break #4
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(i==2 && j==1) {
					break;
				}
				System.out.println("A"); //13
			}
		}
		//break #5
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(i==2 && j==1) {
					i=100;
					break;
				}
				System.out.println("A"); //7
			}
		}
		//break #6
		abc: for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(i==2 && j==1) {
					break abc;
				}
				System.out.println("A"); //7
			}
		}
		
	}
}
