package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW6_1_Calculator {

	private int x = 0;
	private int y = 0;

	public void inputXY() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值：");
		x = sc.nextInt();

		System.out.println("請輸入y的值：");
		y = sc.nextInt();
	}

	
	public void powerXY(int x, int y) throws HW6_1_CalException {
			if (x == 0 && y == 0) {
				throw new HW6_1_CalException("0的0次方沒有意義!!");
			} else if (y < 0) {
				throw new HW6_1_CalException("次方為負數，結果回傳不為整數！");
			}
		
		System.out.println(x + "的" + y + "次方等於 " + (int) Math.pow(x, y));

	}
}
