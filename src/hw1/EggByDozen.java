//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

package hw1;

public class EggByDozen {
	public static void main (String[] args) {
		int egg = 200;
		int dozen = egg/12;
		int eggs = egg%12;
		
		System.out.println ("200顆蛋共是 "+dozen+" 打 "+eggs+" 顆 ");
	}

}
