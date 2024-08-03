//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,其員工編號與身上現金列表如下：
//員工編號	25		32		8		19		27
//身上現金	2500	800		500		1000	1200
//
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的員工編號: 25 19 27 共3 人!」
//(提示：Scanner，二維陣列)

package hw4;

import java.util.Scanner;

public class HW4_4_BorrowMoney {

	public static void main(String[] args) {

		int[][] x = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入想借的金額");
		int a = sc.nextInt();

		outer:

		while (a < 0) {
			System.out.println("您輸入的數字不在範圍內，請輸入大於0的數字");
			a = sc.nextInt();
			continue outer;
		}

		System.out.println();
		System.out.print("有錢可借的員工編號:");

		int count = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; i == 1 && j < x[i].length; j++) {
				if (x[i][j] >= a) {
					count++;
					System.out.print(x[i - 1][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("共" + count + "人");

	}
}
