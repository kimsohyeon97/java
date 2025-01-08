package ch06.sec14;

public class Car {
	private int speed;
	private boolean stop;
	
	public int getspeed() {
		return speed;
	}
	public void setspeed(int speed) {
		if(speed<0)
			this.speed=0;
		else
			this.speed=speed;
	}
	
	public boolean isstop() {
		return stop;
	}
	public void setstop(boolean stop) {
		this.stop=stop;
		if(stop)this.speed=0;
	}

}
