//# ����ȭ#1

class MyData{
	int data=3;
	void plusData() { //2�� �ڿ� data ���� 1 ������Ű�� �޼���

		synchronized (this) { //��ϵ���ȭ
		int tempData = data;
		try {Thread.sleep(2000);} catch(InterruptedException e) {} //2�� ��ٸ��� (����ð�)
		data=tempData+1;
		}
	}
}

class MyThread extends Thread{
	MyData myData;
	MyThread(MyData myData){
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData(); //2�ʵ��� ����Ǵ� �޼���
		System.out.println(getName()+": "+myData.data);
	}
}

public class Test {
	public static void main(String args[]) {
		MyData myData = new MyData();
		
		MyThread mt1 = new MyThread(myData);
		mt1.setName("thread1");
		mt1.start();
		
		try {Thread.sleep(3000);} catch(InterruptedException e) {}
		
		MyThread mt2 = new MyThread(myData);
		mt2.setName("thread2");
		mt2.start();
	}
}
