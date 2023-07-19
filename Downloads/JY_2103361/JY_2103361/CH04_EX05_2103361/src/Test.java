
public class Test {
	public static void main(String[] args) {
		
		//while
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		//for->while
		int i =0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		//mission #1
		for(int a=10; a>0; a-=2) {
			System.out.println(a);
		}
		//for->while
		int a=10;
		while(a>0) {
			System.out.println(a);
			a-=2;
		}
		
		//mission #2
		int k=0;
		while(k<10) {
			k++;
			System.out.println(k);
		}
		//while->for
		for(int b=1; b<=10; b++) {
			System.out.println(b);
		}
		int c=1;
		while(c<=10) {
			System.out.println(c);
			c++;
		}
	}

}
