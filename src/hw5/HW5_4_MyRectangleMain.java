package hw5;

public class HW5_4_MyRectangleMain {
	
	public static void main (String[] args) {
		
		HW5_4_MyRectangle m = new HW5_4_MyRectangle();
		m.setWidth(10);
		m.setDepth(20);		
		System.out.println("長方形的面積為" + m.getArea());	
		
		HW5_4_MyRectangle n = new HW5_4_MyRectangle(10, 20);
		System.out.println("長方形的面積為" + n.getArea());	

		
	}
	

}
