package model;

public class CarVO {
	// num, name, price
	
	private String num;
	private String name;
	private int price;
	
	
	//생성자	
	public CarVO() {}

	public CarVO(String num, String name, int price) {
		this.num = num;
		this.name = name;
		this.price = price;
	}
	

	// getter / setter 	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
