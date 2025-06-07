package ch10;

class SubThread extends Thread {
	
	@Override
	public void run() {

		for(int i=0; i<10; i++) {
			
			System.out.println(getName() + "스레드 실행 중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(getName() + "스레드 종료...");
	}
}

public class ThreadPt {
	public static void main(String[] args) {
		
		SubThread st1 = new SubThread();
		SubThread st2 = new SubThread();
		
		st1.setName("작업1");
		st2.setName("작업2");
		
		st1.start();
		st2.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("메인 스레드 실행 중...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("메인 스레드 종료...");
	}

}












