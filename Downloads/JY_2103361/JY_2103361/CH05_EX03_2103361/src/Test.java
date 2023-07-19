import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		//배열의 길이 및 출력
		
		//배열의 길이
		int[] a = {2,3,4};
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//...
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//배열의 출력 #1 for
		int[] b = {1,2,3,4,5,6};
		
		for(int i= 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		//배열의 출력 #2 for-each
		int[] c = {1,2,3,4,5,6};
		
		for(int k:c) {
			System.out.println(k);
		}
		
		//배열의 출력 #3 Arrays.toString()
		int[] d = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(d));
	}

}
