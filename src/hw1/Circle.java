//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

package hw1;

public class Circle {
	public static void main (String[] args) {
		final double PI = 3.1415;
		double radius = 5.0;
		double circleArea = PI * Math.pow((radius),2);
		double circleLong = radius * 2 * PI;
		
		System.out.printf("半徑為5的圓面積 = %.2f%n", circleArea);
		System.out.printf("半徑為5的圓周長 = %.2f%n", circleLong);

		
	}
}