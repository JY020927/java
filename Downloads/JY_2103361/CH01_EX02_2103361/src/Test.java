
public class Test {
	public static void main(String[] ar) {
		//System.out.println()
		System.out.println("화면출력");
		System.out.println("화면"+"출력");
		System.out.println(3.8);
		System.out.println(5);
		System.out.println("화면"+3);
		System.out.println("화면"+3+5);
		System.out.println(3+"화면"+5);
		System.out.println(3+5+"화면");
		System.out.println(); //개행
		
		//System.out.print()
		System.out.print("화면");
		System.out.print("출력\n"); // \n은 개행하라는 특수문자
		//=System.out.println("출력");
		System.out.println("안녕하세요\n저는 이지윤입니다.");
		
		//System.out.printf()
		System.out.printf("평균은 %f입니다.\n", 5.8);
		System.out.printf("점수는 %d입니다.\n", 30);
		System.out.printf("이름은 %s입니다.\n", "이지윤");
		System.out.printf("%d와 %d의 평균은 %f입니다.\n", 10, 20, 15.0);
		
		System.out.printf("평균은 %f입니다.\n", 5.8273);
		System.out.printf("평균은 |%1.2f|입니다.\n", 5.8273);
		System.out.printf("평균은 |%2.2f|입니다.\n", 5.8273);
		System.out.printf("평균은 |%3.2f|입니다.\n", 5.8273);
		System.out.printf("평균은 |%4.2f|입니다.\n", 5.8273);
		System.out.printf("평균은 |%5.2f|입니다.\n", 5.8273);
		System.out.printf("평균은 |%6.2f|입니다.\n", 5.8273);
		
		System.out.printf("12의 8진수 = %o\n", 12);
		System.out.printf("12의 16진수 = %x\n", 12);
		System.out.printf("12의 10진수 = %d\n", 12);
		
		System.out.printf("10진수 = %d\n", 12);
		System.out.printf("10진수 = %d\n", 0xC);
		System.out.printf("10진수 = %d\n", 014);
		System.out.printf("10진수 = %d\n", 0b1100);
	}

}
