package practice;

public class Documentary extends Movie{

	private String topic;
	
	public Documentary(String title, String director, int duration, double rating, String topic) {
		super(title, director, duration, rating);
		this.topic = topic;
	}
	
	public void show() {
		super.show();
		System.out.println("주제 : " + topic);
	}

}
