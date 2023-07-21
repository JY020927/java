public class Test {
	public static void main(String[] args) {

		Thread th1 = new Thread(new Runnable() {
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
		});
		th1.start();	

		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				//비디오 플레이
				int[] video = new int[] {1,2,3,4,5};
				for(int i=0; i<video.length; i++) {
					System.out.print("(비디오):"+video[i]);
					try { Thread.sleep(200); } catch (InterruptedException e) { }
				}		
			}
		});
		th2.start();

		Thread th3 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		th3.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
	}
}
