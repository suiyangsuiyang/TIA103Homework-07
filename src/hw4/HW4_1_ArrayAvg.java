//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

package hw4;

public class HW4_1_ArrayAvg {

	public static void main(String[] args) {

		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			avg = sum / array.length;
		}

		System.out.println("此陣列的平均值為" + avg);

		System.out.print("大於平均值的有：");
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] > avg) {
				System.out.print(array[j] + " ");
			}

		}

	}

}
