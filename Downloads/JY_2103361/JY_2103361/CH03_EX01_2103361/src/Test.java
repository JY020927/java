//#������
public class Test {
	public static void main(String[] ar) {
		//#���������
		System.out.println(3+2); //5
		System.out.println(3-2); //1
		System.out.println(3*2); //6
		System.out.println(3/2); //1
		System.out.println(3%2); //1
		
		//#����������
		int a=3;
		int b=++a;
		System.out.println(a); //4
		System.out.println(b); //4
		
		int c=3;
		int d=c++;
		System.out.println(c); //4
		System.out.println(d); //3
		
		//��Ʈ������
		System.out.println(3&5); //1
		System.out.println(3|5); //7
		System.out.println(3^5); //6
		System.out.println(~3); //-4
		
		//�������Ʈ����
		System.out.println(7<<1); //14
		System.out.println(-7<<1); //-14
		System.out.println(7>>1); //3
		System.out.println(-7>>1); //-4
		System.out.println(-7<<2); //-28
		System.out.println(-7>>2); //-2
		
		//������Ʈ
		int setting = 0b00101010; //4��° network on/off
		System.out.println((setting>>>0)&1);
		System.out.println((setting>>>1)&1);
		System.out.println((setting>>>2)&1);
		System.out.println((setting>>>3)&1);
		System.out.println((setting>>>4)&1);
		System.out.println((setting>>>5)&1);
		System.out.println((setting>>>6)&1);
		System.out.println((setting>>>7)&1);
		
		
	}

}