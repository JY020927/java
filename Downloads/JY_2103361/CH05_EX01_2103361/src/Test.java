
public class Test {
	public static void main(String[] args) {
		
		//배열의 선언방법 두가지
		int[] a1; //권고
		int a2[];
		
		//배열의 선언 및 초기화 방법 #1
		int[] b1 = new int[3];
		System.out.println(b1[0]); //0
		System.out.println(b1[1]); //0
		System.out.println(b1[2]); //0
		b1[0]=3;
		b1[1]=4;
		b1[2]=5;
		System.out.println(b1[0]); //3
		System.out.println(b1[1]); //4
		System.out.println(b1[2]); //5
		
		//배열의 선언 및 초기화 방법 #2
		int[] b2 = new int[] {3,4,5};
		System.out.println(b2[0]); //3
		System.out.println(b2[1]); //4
		System.out.println(b2[2]); //5
		
		//배열의 선언 및 초기화 방법 #3
		int[] b3 = {3,4,5};
		System.out.println(b3[0]); //3
		System.out.println(b3[1]); //4
		System.out.println(b3[2]); //5
		
		//세 가지 방법에 대한 선언과 객체 생성 분리
		//방법#1
		int[] c1=new int[3];
		int[] c2;
		c2=new int[3];
		
		//방법#2
		int[] c3=new int[] {3,4,5};
		int[] c4;
		c4=new int[] {3,4,5};
		
		//방법#3
		int[] c5= {3,4,5};
		int[] c6;
		//c6= {3,4,5}; //오류
		
	}

}
