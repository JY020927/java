
public class Test {
	public static void main(String[] ar) {
		//비교연산자
		System.out.println(3>5); //f
		System.out.println(7>=7); //t
		System.out.println(7==7); //t
		System.out.println(7!=7); //f
		
		//논리연산자 (short circuit 적용)
		int a = 3;
		System.out.println(a==4); //f
		System.out.println(false && a++>3); //f, 빨간줄은 안 읽음
		System.out.println(a); //3
		
		//비교연산자를 이용한 논리연산 (short circuit 미적용)
		int b = 3;
		System.out.println(b==4); //f
		System.out.println(false && ++b>3); //f
		System.out.println(b); //3
	}

}
