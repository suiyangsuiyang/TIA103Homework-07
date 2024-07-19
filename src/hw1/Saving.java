//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
//請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)

package hw1;

public class Saving {
	public static void main (String[] args) {
		int saving = 1_500_000;
		double interestRate = 0.02;
		int duration = 10;
		double finalsaving = saving * (Math.pow((1+interestRate),duration));
		
		System.out.println("10年後,本金加利息共有 "+(int)finalsaving+"元");
		
		
	}
	
	

}
