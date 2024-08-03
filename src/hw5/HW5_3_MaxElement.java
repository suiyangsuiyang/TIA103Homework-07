//利用Overloading，
//設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，

package hw5;

import java.util.Arrays;

public class HW5_3_MaxElement {

	public static void main(String[] args) {

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.1, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		HW5_3_MaxElement h = new HW5_3_MaxElement();
		h.maxElement(intArray);
		h.maxElement(doubleArray);
		System.out.println(h.maxElement(intArray));
		System.out.println(h.maxElement(doubleArray));
	}

	
	public int maxElement(int[][] k) {

		int i = 0;
		int j = 0;

		int[] a = new int[k.length];

		for (i = 0; i < k.length; i++) {
			Arrays.sort(k[i]);

			for (j = 0; j < k[i].length; j++) {
			}

			a[i] = k[i][k[i].length - 1];

		}

		int m = 0;
		for (m = 0; m < a.length; m++) {
			Arrays.sort(a);
		}

		return a[m - 1];
	}

	
	public double maxElement(double[][] kk) {

		int i = 0;
		int j = 0;

		double[] b = new double[kk.length];

		for (i = 0; i < kk.length; i++) {
			Arrays.sort(kk[i]);

			for (j = 0; j < kk[i].length; j++) {
			}

			b[i] = kk[i][kk[i].length - 1];

		}

		int m = 0;
		for (m = 0; m < b.length; m++) {
			Arrays.sort(b);
		}

		return b[m - 1];
	}
}