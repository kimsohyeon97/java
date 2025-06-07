package entity;

public class Order {
	
	private int oederNo;
	private String orderId;
	private int orderProduct;
	private int orderCount;
	private String orderDate;
	
	public Order(int oederNo, String orderId, int orderProduct, int orderCount, String orderDate) {
		super();
		this.oederNo = oederNo;
		this.orderId = orderId;
		this.orderProduct = orderProduct;
		this.orderCount = orderCount;
		this.orderDate = orderDate;
	}

	public int getOederNo() {
		return oederNo;
	}

	public void setOederNo(int oederNo) {
		this.oederNo = oederNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getOrderProduct() {
		return orderProduct;
	}

	public void setOrderProduct(int orderProduct) {
		this.orderProduct = orderProduct;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [oederNo=" + oederNo + ", orderId=" + orderId + ", orderProduct=" + orderProduct + ", orderCount="
				+ orderCount + ", orderDate=" + orderDate + "]";
	}
	
	
}