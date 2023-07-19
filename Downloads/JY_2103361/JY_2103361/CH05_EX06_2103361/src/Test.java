import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//main 메서드 입력 매개변수 확인하기
		
		System.out.println(args.length);
		
		System.out.println(args[0]+1);
		System.out.println(args[1]);
		System.out.println(args[2]+1); //31
		//참고 문자열 --> 숫자로 바꾸기
		System.out.println(Integer.parseInt(args[2])+1);
		System.out.println(Double.parseDouble(args[3])+1);
		
		System.out.println(Arrays.toString(args)); //자동임포트 단축키 ctrl+shift+알파벳O
	}

}
