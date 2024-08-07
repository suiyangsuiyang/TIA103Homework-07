package hwext;

public abstract class HWext__Pen {
	
	private String brand;
	private double price;
	
	public HWext__Pen() {}
	
	public HWext__Pen(String brand, double price) {
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
