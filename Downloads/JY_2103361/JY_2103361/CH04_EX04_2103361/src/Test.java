
public class Test {
	public static void main(String[] args) {
		//for #1
		int a;
		for(a=0; a<10; a++) {
			System.out.println(a);
		}
		System.out.println(a); //10
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		//System.out.println(i); //오류
		
		for(int i=0; i<100; i++) {
			System.out.println(i);
		}
		
		//무한루프
		int b=3;
		for(int i=0; ; i++) {
			System.out.println("A");
			if(b>2) {
				break;
			}
		}
		
		System.out.println("안녕");
		
		for( ; ; ) {
			
		}
	}

}
