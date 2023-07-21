//# 동기화#1

class MyData{
	int data=3;
	void plusData() { //2초 뒤에 data 값을 1 증가시키는 메서드

		synchronized (this) { //블록동기화
		int tempData = data;
		try {Thread.sleep(2000);} catch(InterruptedException e) {} //2초 기다리기 (연산시간)
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
		myData.plusData(); //2초동안 수행되는 메서드
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
