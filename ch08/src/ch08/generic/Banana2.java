package ch08.generic;

public class Banana2 {
	
	private String country;
	private int price;
	
	public Banana2(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}

}
