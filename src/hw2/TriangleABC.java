//請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF


package hw2;

public class TriangleABC {

	public static void main(String[] args) {
		char x = '\u0040';

		for (int i = 1; i <= 6; i++) {
			x++;
			for (int j = 1; j <= i; j++) {
				if (j <= i) {
					System.out.print(x);
				}
			}
			System.out.println();

		}
	}
}
