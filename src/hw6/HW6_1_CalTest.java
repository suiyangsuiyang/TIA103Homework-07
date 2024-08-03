package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW6_1_CalTest {

	public static void main(String[] args) throws InputMismatchException {

		int a;
		int b;
		int i = 0;

		while (i == 0) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值：");
				a = sc.nextInt();
				System.out.println("請輸入y的值：");
				b = sc.nextInt();

				HW6_1_Calculator c = new HW6_1_Calculator();
				c.powerXY(a, b);
				--i;
			} catch (InputMismatchException e2) {
				System.out.println("輸入格式不正確呀！");
			} catch (HW6_1_CalException e1) {
				System.out.println(e1.getMessage());
			}
		}
	}

}
