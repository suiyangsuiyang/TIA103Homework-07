//(進階)
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)後，直接亂數印出6個號碼且不得重複

package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryAdvance {

	int inputvalue;
	int arraylength = 0;
	int arrayvalue;

	public int input() {
		System.out.println("請輸入1~9你不想要的數字");
		Scanner sc = new Scanner(System.in);
		inputvalue = sc.nextInt(); 					// inputvalue為輸入值

		outer: while (inputvalue > 9 || inputvalue < 1) {
			System.out.println("別鬧了~~請輸入1~9你不想要的數字");
			inputvalue = sc.nextInt();
			continue outer;
		}
		return inputvalue;
	}

	public int arrayLength() {
		int[] x = new int[arraylength]; 			// x陣列，長度為arraylength

		for (arrayvalue = 1 ; arrayvalue <= 49; arrayvalue++) {
			if (arrayvalue % 10 != inputvalue && arrayvalue / 10 != inputvalue) {
//			System.out.print("可選i " + i + " "); 	// 排掉討厭數字後，arrayvalue為可選號碼
				if (arrayvalue > 0) {
					arraylength++;
				}
			}		
		}
		return arraylength;
	}

	public static void main(String[] args) {

		LotteryAdvance lucky = new LotteryAdvance();
		lucky.input();
		lucky.arrayLength();
//
//			x[k] = i;
//			System.out.print(x[k - 1] + " ");

//			int newk = 0; // newk 為x陣列的亂數索引值
//			newk = (int) (Math.random() * k);
//
//			int[] newx = new int[6];
//			for (int m = 0; m < 6; m++) {
//				newx[m] = x[newk];
//				System.out.println();
//				System.out.println();
//				System.out.print(newx[m] + " ");
//			}
		System.out.println("陣列總數 " + lucky.arrayLength() + "個可選數字"); // k為陣列總數 (有幾個數字)

	}
}
