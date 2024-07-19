//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數

package hw3;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入1~9不想要的數字");
		int j = sc.nextInt();

		outer:

		while (j > 9 || j < 1) {
			System.out.println("您輸入的數字不在範圍內，請輸入1~9不想要的數字");
			j = sc.nextInt();
			continue outer;
		}

		if (j > 1 || j < 9) {
			
			int k = 0;

			for (int i = 1; i <= 49; i++) {
				if ((i / 10 != j) && (i % 10 != j)) {
					System.out.print(i + " ");

					if (i > 0) {
							k++;
							}
				}
			}
			
			System.out.println();
			System.out.println();

			System.out.print("總共" + k + "個數字可選");
		}
	}
}