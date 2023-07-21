//# 쓰레드의 속성2

class MyThread extends Thread{
	@Override
	public void run() {
		for(long i=0; i<10000000000L; i++) {} //시간지연
		System.out.println(this.getName()+": "+this.getPriority());
	}
}

public class Test {
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		for(int i=0; i<3; i++) {
			MyThread t = new MyThread();
			t.start();
		}
		
		try { Thread.sleep(1000);} catch (InterruptedException e) {} //1초지연
		
		for(int i=0; i<10; i++) {
			MyThread t = new MyThread();
			t.setName(i+"번째 쓰레드");
			
			if(i==9)
				t.setPriority(Thread.MAX_PRIORITY); //10
			else
				t.setPriority(Thread.MIN_PRIORITY); //1
			
			t.start();
		}
		
	}
}
