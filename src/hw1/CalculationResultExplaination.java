//請寫一隻程式,利用System.out.println()印出以下三個運算式結果，並請用註解各別說明答案的產生原因
//5 + 5
//5 + ‘5’
//5 + “5”


package hw1;

public class CalculationResultExplaination {
	public static void main (String[] args) {
		
		System.out.println(5 + 5);		//此為兩個一般數值加總，故執行運算後結果為10
		System.out.println(5 + '5');	//'5'資料型別為字元，轉換成char的值為53，故執行運算後結果為58
		System.out.println(5 + "5");	//此為一般數值加上字串5，故執行運算後結果為55

	}

}
