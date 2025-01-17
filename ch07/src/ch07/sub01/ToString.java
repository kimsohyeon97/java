package ch07.sub01;

public class ToString {
	private String country;
	private int price;
	
	public ToString(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	

}
