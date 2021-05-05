package Entities;

public class Order {

	private int id;
	private int customerid;
	private double price;
	private Product product[];
	
	public Order() {
		
	}
	
	public Order(int customerid, double price, Product[] product) {
		this.customerid = customerid;
		this.price = price;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product[] getProduct() {
		return product;
	}

	public void setProduct(Product[] product) {
		this.product = product;
	}

}
