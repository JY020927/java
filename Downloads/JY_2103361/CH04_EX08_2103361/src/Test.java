
public class Test {
	public static void main(String[] args) {
		//continue #1
		for(int i=0; i<5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i); //
		}
		//continue #2
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(i==1) {
					continue;
				}
				System.out.println("A"); //12
			}
		}
				//continue #3
				for(int i=0; i<5; i++) {
					for(int j=0; j<3; j++) {
						if(j==1) {
							continue;
						}
						System.out.println("A"); //10
					}
				}
				//continue #4
				for(int i=0; i<5; i++) {
					for(int j=0; j<3; j++) {
						if(i==2 && j==1) {
							continue;
						}
						System.out.println("A"); //14
					}
				}
				//continue #5
				for(int i=0; i<5; i++) {
					for(int j=0; j<3; j++) {
						if(i==2 && j==1) {
							i=100;
							continue;
						}
						System.out.println("A"); //8
					}
				}
				//continue #6
				abc: for(int i=0; i<5; i++) {
					for(int j=0; j<3; j++) {
						if(i==2 && j==1) {
							continue abc;
						}
						System.out.println("A"); //13
					}
				}
				//mission
				for(int i=0; i<10; i++) {
					if(i==9) {
						break;
					}
					if(i%2==1) {
						continue;
					}
					System.out.println(i);
				} //0,2,4,6,8
	}

}
