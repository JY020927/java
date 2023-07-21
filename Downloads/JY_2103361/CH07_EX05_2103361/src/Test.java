import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3};
		System.out.println(Arrays.toString(a));
		abc(a);
		System.out.println(Arrays.toString(a));
	}
	
	static void abc(int[] a) {
		a[0]=4;
		a[1]=5;
		a[2]=6;
		System.out.println(Arrays.toString(a));
	}

}
