import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		//�迭�� ���� �� ���
		
		//�迭�� ����
		int[] a = {2,3,4};
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//...
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//�迭�� ��� #1 for
		int[] b = {1,2,3,4,5,6};
		
		for(int i= 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		//�迭�� ��� #2 for-each
		int[] c = {1,2,3,4,5,6};
		
		for(int k:c) {
			System.out.println(k);
		}
		
		//�迭�� ��� #3 Arrays.toString()
		int[] d = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(d));
	}

}
