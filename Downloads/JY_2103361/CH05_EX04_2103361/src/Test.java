
public class Test {
	public static void main(String[] args) {
		//2���� �迭�� ����
		int[][] a1;
		int a2[][];
		int[] a3[];
		
		//2���� �迭�� ��ü ���� (�����࿭) 4����
		//2 3 4
		//5 6 7
		//��� #1
		int[][] b1 = new int[2][3];
		System.out.println(b1[0][0]); //0
		System.out.println(b1[0][1]); //0 
		System.out.println(b1[0][2]); //0
		System.out.println(b1[1][0]); //0
		System.out.println(b1[1][1]); //0
		System.out.println(b1[1][2]); //0
		b1[0][0]=2;
		b1[0][1]=3;
		b1[0][2]=4;
		b1[1][0]=5;
		b1[1][1]=6;
		b1[1][2]=7;
		System.out.println(b1[0][0]); //2
		System.out.println(b1[0][1]); //3 
		System.out.println(b1[0][2]); //4
		System.out.println(b1[1][0]); //5
		System.out.println(b1[1][1]); //6
		System.out.println(b1[1][2]); //7
		
		//��� #2
		int[][] b2 = new int[2][];
		System.out.println(b2[0]); //null
		System.out.println(b2[1]); //null
		b2[0]=new int[] {2,3,4};
		b2[1]=new int[] {5,6,7};
		System.out.println(b2[0][0]); //2
		System.out.println(b2[0][1]); //3 
		System.out.println(b2[0][2]); //4
		System.out.println(b2[1][0]); //5
		System.out.println(b2[1][1]); //6
		System.out.println(b2[1][2]); //7
		
		//���#3
		int[][] b3 = new int[][] {{2,3,4},{5,6,7}};
		System.out.println(b3[0][0]); //2
		System.out.println(b3[0][1]); //3 
		System.out.println(b3[0][2]); //4
		System.out.println(b3[1][0]); //5
		System.out.println(b3[1][1]); //6
		System.out.println(b3[1][2]); //7
		
		//���#4
		int[][] b4 = {{2,3,4},{5,6,7}};
		System.out.println(b4[0][0]); //2
		System.out.println(b4[0][1]); //3 
		System.out.println(b4[0][2]); //4
		System.out.println(b4[1][0]); //5
		System.out.println(b4[1][1]); //6
		System.out.println(b4[1][2]); //7
		
		int [][] b5;
		//b5= {{2,3,4},{5,6,7}}; ���� �и��Ұ�
	}

}
