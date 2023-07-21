//# �Ϲݽ����� vs. ���󽺷���

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+": "+isDaemon());
		
		for(int i=1; i<=6; i++) {
			try{Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println(i+"��");
		}
	}
}

public class Test {
	public static void  main(String[] args) {
		//#1. �Ϲݽ�����
		MyThread mt1 = new MyThread();
		mt1.setName("Thread1");
		mt1.setDaemon(false);
		mt1.start();
		
		//#2. ���󽺷���
		MyThread mt2 = new MyThread();
		mt2.setName("Thread2");
		mt2.setDaemon(false);
		mt2.start();
		
		//#3. 5�ʵ��� ����
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		
		System.out.println("���ν����� ����");
	}

}
