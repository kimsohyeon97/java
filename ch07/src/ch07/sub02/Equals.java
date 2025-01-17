package ch07.sub02;

public class Equals {
	private String country;
	private int price;
	
	public Equals (String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Equals e) {
			if(country.equals(e.country) && price == e.price)
				return true;
		}
		return false;
	}

}
