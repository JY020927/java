//# 쓰레드의 속성
public class Test {
	public static void main(String[] args) {
		Thread curThread = Thread.currentThread();
		System.out.println(curThread.getName());
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread();
			System.out.println(t.getName());
			t.start();
		}
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread();
			System.out.println(t.getName());
			t.start();
		}
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread();
			System.out.println(t.getName());
			t.start();
		}
		
		System.out.println(Thread.activeCount());
	}
}
