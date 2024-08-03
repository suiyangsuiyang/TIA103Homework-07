//有個字串陣列如下(八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示：字元比對，String方法)

package hw4;

public class HW4_3_8Planets {

	public static void main(String[] args) {

		String[] s = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sum = 0;

		for (int i = 0; i < s.length; i++) {
//		System.out.println(s[i]);
			for (int j = 0; j < s[i].length(); j++) {
				System.out.print(s[i].charAt(j));

				if (s[i].charAt(j) == ('a') || s[i].charAt(j) == ('e') || s[i].charAt(j) == ('i')
						|| s[i].charAt(j) == ('o') || s[i].charAt(j) == ('u')) {
					sum++;
				}

			}
		}
		System.out.println();
		System.out.print("共有"+sum+"個母音(a, e, i, o, u)");
	}
}
