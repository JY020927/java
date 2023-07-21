class SMIRunnable implements Runnable{
	@Override
	public void run() {
		//자막 플레이
		String[] smi = new String[] {"하나", "둘", "셋", "넷", "다섯"};
		try { Thread.sleep(20); } catch (InterruptedException e) { }
		for(int i=0; i<smi.length; i++) {
			System.out.println(" (자막):"+smi[i]);
			try { Thread.sleep(200); } catch (InterruptedException e) { }
		}
	}
}

public class Test {
	public static void main(String[] args) {
		SMIRunnable smi = new SMIRunnable();
		Thread th1 = new Thread(smi);
		th1.start();
		
		//비디오 플레이
		int[] video = new int[] {1,2,3,4,5};
		for(int i=0; i<video.length; i++) {
			System.out.print("(비디오):"+video[i]);
			try { Thread.sleep(200); } catch (InterruptedException e) { }
		}
		
	}
}
