//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形，如圖示結果：
//(提示：Scanner，三角形成立條件，判斷式if else)
//(進階功能：加入直角三角形的判斷)

package hw3;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數：");

		if (sc.hasNextInt()) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();

			if ((i + j < k) || (i + k < j) || (j + k < i)) {
				System.out.println("不是三角形");
			}

			else if (i == j && j == k) {
				System.out.println("正三角形");
			}

			else if ((i == j) || (i == k) || (j == k)) {
				System.out.println("等腰三角形");
			}

			else if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)
					|| Math.pow(i, 2) + Math.pow(k, 2) == Math.pow(j, 2)
					|| Math.pow(j, 2) + Math.pow(k, 2) == Math.pow(i, 2)) {
				System.out.println("直角三角形");
			}

			else {
				System.out.println("其他三角形");

			}

		}
	}
}