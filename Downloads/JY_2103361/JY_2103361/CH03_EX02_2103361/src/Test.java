
public class Test {
	public static void main(String[] ar) {
		//�񱳿�����
		System.out.println(3>5); //f
		System.out.println(7>=7); //t
		System.out.println(7==7); //t
		System.out.println(7!=7); //f
		
		//�������� (short circuit ����)
		int a = 3;
		System.out.println(a==4); //f
		System.out.println(false && a++>3); //f, �������� �� ����
		System.out.println(a); //3
		
		//�񱳿����ڸ� �̿��� ������ (short circuit ������)
		int b = 3;
		System.out.println(b==4); //f
		System.out.println(false && ++b>3); //f
		System.out.println(b); //3
	}

}
