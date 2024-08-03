package hw6;

import java.util.Scanner;

public class HW6_1_CalException extends Exception {

	public HW6_1_CalException() {
	}

	public HW6_1_CalException(String message) {
		super(message);
	}

	private int x = 0;
	private int y = 0;

	public void inputXY2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x的值：");
		x = sc.nextInt();

		System.out.println("請輸入y的值：");
		y = sc.nextInt();

		
		outer1:
			while ((x == 0 && y == 0) || (y < 0)) {
			if (x == 0 && y == 0) {
				System.out.println("0的0次方沒有意義!!");
				System.out.println("請輸入x的值：");
				x = sc.nextInt();

				System.out.println("請輸入y的值：");
				y = sc.nextInt();
			} else if (y < 0) {
				System.out.println("次方為負數，結果回傳不為整數！");
				System.out.println("請輸入x的值：");
				x = sc.nextInt();

				System.out.println("請輸入y的值：");
				y = sc.nextInt();
			} else {
				System.out.println("輸入格式不正確呀！！");
				System.out.println("請輸入x的值：");
				x = sc.nextInt();

				System.out.println("請輸入y的值：");
				y = sc.nextInt();				
			
				continue outer1;
			}
		}

		System.out.println(x + "的" + y + "次方等於 " + (int) Math.pow(x, y));

	}

}
