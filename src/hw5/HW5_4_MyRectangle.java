package hw5;

public class HW5_4_MyRectangle {
	
	private double width;
	private double depth;
	
	public HW5_4_MyRectangle(){
		
	}
	
	
	public HW5_4_MyRectangle(double width, double depth) {
		setWidth(width);
		setDepth(depth);
	}
	
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public void setDepth(double depth) {
		this.depth = depth;		
	}
	
	
	public double getArea() {
		return width*depth;
	}
	
	

}
