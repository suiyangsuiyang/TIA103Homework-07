//產生0～100亂數，每次猜就會提示你是大於還是小於正確答案

package hw3;

import java.util.Scanner;

public class Random0To100 {

	public static void main(String[] args) {
		int i = (int) (Math.random() * 101);

		Scanner sc = new Scanner(System.in);
		System.out.println("猜個0~100的數字吧!!" );

		int j;
		j = sc.nextInt();

		outer:

		while (j != i) {

			if (j > i) {
				System.out.println("大於正確答案唷");
				j = sc.nextInt();
			}

			if (j < i) {
				System.out.println("小於正確答案唷");
				j = sc.nextInt();
			}
			continue outer;

		}
		if (j == i) {
			System.out.println("答對囉");
		}

	}

}