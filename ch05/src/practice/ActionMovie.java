package practice;

public class ActionMovie extends Movie{
	
	private int stuntScenes;

	public ActionMovie(String title, String director, int duration, double rating, int stuntScenes) {
		super(title, director, duration, rating);
		
		this.stuntScenes = stuntScenes;
		
	}
	
	public void show() {
		super.show();
		System.out.println("스턴트 장면의 수 : " + stuntScenes);
	}

}
