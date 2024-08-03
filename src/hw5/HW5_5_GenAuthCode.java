//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
//請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，
//此驗證碼內容包含了英文大小寫與數字的亂數組合

package hw5;

public class HW5_5_GenAuthCode {

	public static void main(String[] args) {
		HW5_5_GenAuthCode g = new HW5_5_GenAuthCode();
		g.genAuthCode();
	}

	
	public void genAuthCode() {

		char[] x = new char[62];
		int j = 0;
		char i;

		for (i = '\u0030'; i < '\u007B'; i++) {
			if ((i < '\u003A') || (('\u0041' <= i) && (i <= '\u005A')) || (('\u0061' <= i) && (i <= '\u007A'))) {
				x[j++] = i;
			}
		}

		for (int k = 0; k < 8; k++) {
			System.out.print(x[(int) (Math.random() * 62)]);
		}

	}
}
