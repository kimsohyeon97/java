package ch06.sec14;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setspeed(-50);
		System.out.println("현재속도 : "+myCar.getspeed());
		
		myCar.setspeed(60);
		System.out.println("현재속도 : "+myCar.getspeed());
		
		if(!myCar.isstop()) {
			myCar.setstop(true);
		}
		System.out.println("현재속도 : "+myCar.getspeed());
	
	}

}
