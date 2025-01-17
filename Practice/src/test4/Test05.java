package test4;

class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country=country;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
}

class Banana {
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country=country;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
}

class Grape {
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country=country;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Grape [country=" + country + ", price=" + price + "]";
	}
}


public class Test05 {
	public static void main(String[] args) {
		Apple apple = new Apple("한국",3000);
		Banana banana = new Banana("미국",3000);
		Grape grape = new Grape("일본",3000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}
	
	public static void showInfo(Object fruit) {
		if(fruit instanceof Apple apple)
			System.out.println(apple);
		else if(fruit instanceof Banana banana)
			System.out.println(banana);
		else if(fruit instanceof Grape grape)
			System.out.println(grape);
	}
	

}
