import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		//String 클래스의 메서드
		//#length()
		String str1 = "Hello";
		String str2 = "안녕하세요";
		System.out.println(str1.length()); //6
		System.out.println(str2.length()); //5
		
		//#2 indexOf(), lastIndexOf()
		String str3 = "abcdefgabc";
		String str4 = "가나다라가나다";
		System.out.println(str3.indexOf("c")); //2
		System.out.println(str3.indexOf("c",3)); //9
		System.out.println(str4.indexOf("다")); //2
		System.out.println(str4.indexOf("다",3)); //6
		System.out.println(str3.lastIndexOf("c")); //9
		System.out.println(str3.lastIndexOf("c",3)); //2
		System.out.println(str4.lastIndexOf("다")); //6
		System.out.println(str4.lastIndexOf("다",3)); //2
		
		//#3 charAt()
		System.out.println(str3.charAt(3));
		System.out.println(str4.charAt(3));
		
		//#4 subString()
		String str5 = "abcdefgabc";
		String str6 = "가나다라가나다";
		System.out.println(str5.substring(3));
		System.out.println(str5.substring(3,5));
		
		System.out.println(str6.substring(3));
		System.out.println(str6.substring(3,5));
		
		//#5 replace()
		String str7 = "Java 공부 재미없다";
		System.out.println(str7.replace("Java","자바"));
		
		//#6 getBytes(), toCharArray()
		String str8 = "Hello";
		String str9 = "방가";
		byte[] bArray1 = str8.getBytes();
		System.out.println(Arrays.toString(bArray1));
		byte[] bArray2 = str9.getBytes();
		System.out.println(Arrays.toString(bArray2));
		
		char[] cArray1 = str8.toCharArray();
		System.out.println(Arrays.toString(cArray1));
		char[] cArray2 = str9.toCharArray();
		System.out.println(Arrays.toString(cArray2));
		
		//미션
		String s1 = "abc.bmp";
		String s8 = "abc_bddd.2022.05.23.bmp";
		String s2 = "abc_bcd/cde";
		//미션1. s1에서 파일 이름만 뽑아내세요 (파일이름은 길이가 다양할 수 있습니다)
		System.out.println(s1.substring(0, s1.indexOf(".")));
		String result = s8.substring(0, s8.lastIndexOf("."));
		//미션2. s2에서 모든 데이터를 순서대로 출력하세요
		String[] ar = s2.split("_");
		for(String k : ar) {
			System.out.println(k);
		}
	}
}
