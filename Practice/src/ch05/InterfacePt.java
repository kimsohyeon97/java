package ch05;

public class InterfacePt {
	public static void main(String[] args) {
		RemoteControl lg = new RemoteLg();
		RemoteControl ss = new RemoteSamsung();
		
		lg.chDown();
		lg.chUp();
		
		ss.powerOff();
		ss.soundDown();
	}
}
