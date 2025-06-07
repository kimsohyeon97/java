package ch05;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("파워온...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("파워오프...");
		
	}

	@Override
	public void chUp() {
		System.out.println("채널업...");
		
	}

	@Override
	public void chDown() {
		System.out.println("채널다운...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("사운드업...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("사운드다운...");
		
	}

}
