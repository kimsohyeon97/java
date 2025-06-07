package test6.sub02;

public class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int price) {
		if(price >= 0) {
			this.price = price;
			System.out.println("키보드 가격 수정됨");
		}
	}
	
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.printf("키보드 %d개 재고 추가 됨\n", quantity);
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID : " + productId);
		System.out.println("상품이름 : " + productName);
		System.out.println("상품가격 : " + price);
		System.out.println("재고수량 : " + quantity);
	}
	
}
