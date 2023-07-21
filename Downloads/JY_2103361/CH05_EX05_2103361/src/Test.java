
public class Test {
	public static void main(String[] args) {
		//2瞒盔 青纺 (厚沥规屈 青纺) 3啊瘤
		//1 2
		//3
		//4 5 6
		//规过#1
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
		
		//规过#2
		int[][] b = new int[][] {{1,2},{3},{4,5,6}};
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[1][0]);
		System.out.println(b[2][0]);
		System.out.println(b[2][1]);
		System.out.println(b[2][2]);
		
		
		//规过#3
		int[][] c = {{1,2},{3},{4,5,6}};
		System.out.println(c[0][0]);
		System.out.println(c[0][1]);
		System.out.println(c[1][0]);
		System.out.println(c[2][0]);
		System.out.println(c[2][1]);
		System.out.println(c[2][2]);
		
		//cf. 规过3篮 盒府 阂啊
		
		//免仿规过 1
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
		//免仿规过 2
		for(int[] k: c) {
			for(int m: k) {
				System.out.println(m);
			}
		}
		
	}
}
