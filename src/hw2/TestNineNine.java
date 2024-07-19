/*
* 請建立一個TestNineNine.java程式，可輸出九九乘法表
* • 一：使用for迴圈+ while迴圈
* • 二：使用for迴圈+ do while迴圈
* • 三：使用while迴圈+ do while迴圈
*/

package hw2;

public class TestNineNine {

//一：使用for迴圈+ while迴圈
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			int j = 0;
			while (j < 9) {
				j++;
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			
			System.out.println();

		}

	}

}



//二：使用for迴圈+ do while迴圈
//	public static void main(String[] args) {
//
//		for (int i = 1; i <= 9; i++) {
//
//			int j = 0;
//			do {
//				j++;
//				System.out.print(i + " * " + j + " = " + i * j + "\t");
//			} while (j < 9);
//			
//			System.out.println();
//
//		}
//	}
//
//}
	
	
	
//	三：使用while迴圈+ do while迴圈
//	public static void main(String[] args) {
//
//		int i = 0;
//		while (i < 9) {
//			i++;
//
//			int j = 0;
//			do {
//				j++;
//				System.out.print(i + " * " + j + " = " + i * j + "\t");
//			} while (j < 9);
//
//			System.out.println();
//
//		}
//
//	}
//
//}
	
	