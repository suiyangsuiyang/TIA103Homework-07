//(進階)
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)後，直接亂數印出6個號碼且不得重複

package hw3;

import java.util.Scanner;

public class LotteryAdvance {

	public int random() {
		int a = (int)(Math.random()*49);
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入1~9你不想要的數字");
		int j = sc.nextInt();

		outer: 
			while (j > 9 || j < 1) {
			System.out.println("別鬧了~~請輸入1~9你不想要的數字");
			j = sc.nextInt();
			continue outer;
		}

		
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != j && i / 10 != j) {
				for (int k = 1 ; i>0 ; k++) {
					
//					int x [] = new int[k];
				}
				
				}

			}

		}

	}


