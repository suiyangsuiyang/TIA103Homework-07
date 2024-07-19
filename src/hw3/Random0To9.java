//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

package hw3;

import java.util.Scanner;

public class Random0To9 {
	public static void main(String[] args) {
		int i = (int) (Math.random() * 10);
		// System.out.println(i);

		Scanner sc = new Scanner(System.in);
		System.out.println("請猜一個數字：");

			int j;
			j = sc.nextInt();
			
			outer:
			while (j != i) {
				System.out.println("錯錯錯");
				j = sc.nextInt();
				continue outer;
			}

			if (j == i) {
				System.out.println("答對囉!答案就是" + i);

			}

		}

	}
