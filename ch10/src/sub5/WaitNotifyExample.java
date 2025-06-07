package sub5;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		Thread threadA = new Thread(workObject);
		Thread threadB = new Thread(workObject);
		
		threadA.start();
		threadB.start();
	}

} 
