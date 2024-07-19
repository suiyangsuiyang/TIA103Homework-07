//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)

package hw2;

public class TimeResutlOneToTen2 {

	public static void main(String[] args) {
		int i = 1;
		int timeResult = 1;

		while (i < 10) {
			i++;
			timeResult *= i;

		}
		System.out.print(timeResult);

	}

}

//3628800