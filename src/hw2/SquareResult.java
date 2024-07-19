//請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100

package hw2;

public class SquareResult {
	
	public static void main (String[] args) {
		
		for (int i=1; i<=10;i++) {
			int squareResult = 1;
			squareResult = 	i*i;
			
			System.out.print(squareResult + " ");

		}

	}
	

}
