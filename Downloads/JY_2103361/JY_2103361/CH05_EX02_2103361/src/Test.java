
public class Test {
	public static void main(String[] args) {
		
		//��(heap) �޸��� �����ʱ�ȭ
		boolean[] a1=new boolean[2];
		byte[] a2=new byte[2];
		short[] a3=new short[2];
		int[] a4=new int[2];
		long[] a5=new long[2];
		float[] a6=new float[2];
		double[] a7=new double[2];
		char[] a8=new char[2];
		
		System.out.println(a1[0]+", "+a1[1]);
		System.out.println(a2[0]+", "+a2[1]);
		System.out.println(a3[0]+", "+a3[1]);
		System.out.println(a4[0]+", "+a4[1]);
		System.out.println(a5[0]+", "+a5[1]);
		System.out.println(a6[0]+", "+a6[1]);
		System.out.println(a7[0]+", "+a7[1]);
		System.out.println((int)a8[0]+", "+(int)a8[1]);
		
		//#2. �����ڷ����� �����ʱ�ȭ
		String[] b1 = new String[2];
		System.out.println(b1[0]+", "+b1[1]);
		
		//cf. stack �޸𸮴� ���� ���Ե��� �ʾƵ� ���� �ʱ�ȭ �ȵ�
		int a=1;
		System.out.println(a);
		
		int[] b=null;
		System.out.println(b);
	}

}
