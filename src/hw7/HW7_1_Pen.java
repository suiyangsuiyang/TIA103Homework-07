package hw7;

public abstract class HW7_1_Pen {
	
	private String brand;
	private double price;
	
	public HW7_1_Pen() {}
	
	public HW7_1_Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void getBrand() {
		System.out.println(brand);
	}

	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	public abstract void write();
	
}
