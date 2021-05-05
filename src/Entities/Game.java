package Entities;

public class Game extends Product{

	private int id;
	private int Code;
	private String name;
	private double productPrice;
	
	public Game(int id, String name, Double price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
	}
    
	

	public double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
