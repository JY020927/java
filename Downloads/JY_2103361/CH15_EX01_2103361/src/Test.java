class SMIThread extends Thread{
	@Override
	public void run() {
		// �ڸ��÷���
		String[] smi = new String[] {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(20);} catch (InterruptedException e) {}
		for(int i=0; i<smi.length; i++) {
			System.out.println("(�ڸ�):"+smi[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
public class Test {
	public static void main(String[] args) {
		SMIThread smi = new SMIThread();
		smi.start();
		
		//���� �÷���
		int[] video = new int[] {1, 2, 3, 4, 5};
		for(int i=0; i<video.length; i++) {
			System.out.print("(����):"+video[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}

}