
public class Test {
	public static void main(String[] args) {
		
		//�迭�� ������ �ΰ���
		int[] a1; //�ǰ�
		int a2[];
		
		//�迭�� ���� �� �ʱ�ȭ ��� #1
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
		
		//�迭�� ���� �� �ʱ�ȭ ��� #2
		int[] b2 = new int[] {3,4,5};
		System.out.println(b2[0]); //3
		System.out.println(b2[1]); //4
		System.out.println(b2[2]); //5
		
		//�迭�� ���� �� �ʱ�ȭ ��� #3
		int[] b3 = {3,4,5};
		System.out.println(b3[0]); //3
		System.out.println(b3[1]); //4
		System.out.println(b3[2]); //5
		
		//�� ���� ����� ���� ����� ��ü ���� �и�
		//���#1
		int[] c1=new int[3];
		int[] c2;
		c2=new int[3];
		
		//���#2
		int[] c3=new int[] {3,4,5};
		int[] c4;
		c4=new int[] {3,4,5};
		
		//���#3
		int[] c5= {3,4,5};
		int[] c6;
		//c6= {3,4,5}; //����
		
	}

}
