//請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值
//並印出這10個亂數與平均值

package hw5;

public class HW5_2_RandAvg {
	
	public void randAvg() {
		int a = 0;
		int sum = 0;

		System.out.println("本次亂數結果：");

		for (int i = 0 ; i < 10 ; i++) {
			a = (int)(Math.random()*101);
			System.out.print(a + " ");
			sum+=a;
		}
		System.out.println();
		System.out.println();
		System.out.println("平均值為" + sum/10);
	}
	
	
	public static void main(String[] args) {
		HW5_2_RandAvg r = new HW5_2_RandAvg();
		r.randAvg();	
	}

}
