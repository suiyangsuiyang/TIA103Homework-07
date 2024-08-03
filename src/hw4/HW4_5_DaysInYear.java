//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//(提示1：Scanner，陣列)
//(提示2：需將閏年條件加入)
//(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

package hw4;

import java.util.Scanner;

public class HW4_5_DaysInYear {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請輸入日期_西元年");
		int a = sc1.nextInt();
		
		//限制年份須為正數
		outer1: 
			while (a <0) {
			System.out.println("年份不可為負數，請重新輸入日期_西元年");
			a = sc1.nextInt();
			continue outer1;
		}
		
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("請輸入日期_月份");
		int b = sc2.nextInt();

		//限制月份須為0~12的正數
		outer2: 
			while (b < 0 || b > 12) {
			System.out.println("月份需介於1-12，請重新輸入日期_月份");
			b = sc1.nextInt();
			continue outer2;
		}
		
		
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("請輸入日期_日期");
		int c = sc3.nextInt();
		
		//限制2月天數
		outer3: 
			while ((a % 4 == 0 && b == 2 && c > 29) || (a % 4 != 0 && b == 2 && c > 28)) {
			System.out.println(a + "年" + b + "月 " + "沒有" + c + "號");
			System.out.println("請重新輸入日期_日期");
			c = sc3.nextInt();
			continue outer3;
		}
		
		//限制1、3、5、7、8、10、12月天數
		outer4: 
			while ((b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12) && c > 31) {
			System.out.println(a + "年" + b + "月 " + "沒有" + c + "號");
			System.out.println("請重新輸入日期_日期");
			c = sc3.nextInt();
			continue outer4;
		}

		//限制4、6、9、11月天數
		outer5: 
			while ((b == 4 || b == 6 || b == 9 || b == 11) && c > 30) {
			System.out.println(a + "年" + b + "月 " + "沒有" + c + "號");
			System.out.println("請重新輸入日期_日期");
			c = sc3.nextInt();
			continue outer5;
		}

		
		int[] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] d1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] d2 = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


		//找出月份對應的天數，並加總
		int sum = 0;
		if (a % 4 != 0) {						//非閏年天數加總
			for (int j = 0; j < b-1; j++) {
				sum += d1[j];
			}
//			System.out.println(sum + "天");
		} else if (a % 4 == 0) {				//閏年天數加總
			for (int j = 0; j < b-1; j++) {
				sum += d2[j];
			}
//			System.out.println(sum + "天");
		}

		System.out.println("----------------------------");				
		System.out.println(a + "/" + b + "/" + c + " 為該年第 " + (sum + c) + " 天");
	}
}
