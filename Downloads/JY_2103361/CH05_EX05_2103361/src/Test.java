
public class Test {
	public static void main(String[] args) {
		//2���� ��� (�������� ���) 3����
		//1 2
		//3
		//4 5 6
		//���#1
		int[][] a = new int[3][];
		a[0]=new int[] {1,2};
		a[1]=new int[] {3};
		a[2]=new int[] {4,5,6};
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		System.out.println(a[2][2]);
		
		//���#2
		int[][] b = new int[][] {{1,2},{3},{4,5,6}};
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[2][0]);
		System.out.println(b[2][1]);
		System.out.println(b[2][2]);
		
		
		//���#3
		int[][] c = {{1,2},{3},{4,5,6}};
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
		System.out.println(c[1][0]);
		System.out.println(c[2][0]);
		System.out.println(c[2][1]);
		System.out.println(c[2][2]);
		
		//cf. ���3�� �и� �Ұ�
		
		//��¹�� 1
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
		//��¹�� 2
		for(int[] k: c) {
			for(int m: k) {
				System.out.println(m);
			}
		}
		
	}
}
