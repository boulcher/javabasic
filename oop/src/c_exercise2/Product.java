package c_exercise2;

public class Product {

	private String productNo;
	private String productName;
	private int stock;
	
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void income(int count) {
		stock= stock+count;
	}
	
	public void sale(int count) {
		stock = stock-count;
	}
	
	public void output() {
		System.out.println("This is an Instance");
	}
}
