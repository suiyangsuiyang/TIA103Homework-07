//請建立一個Collection物件並將以下資料加入：
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)

//印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//移除不是java.lang.Number相關的物件
//再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功

package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HW8_1_Collection {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<Object>();
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add((short) 100);
		list.add(5.1);
		list.add("Kitty");
		list.add(100);

		Object obj = new Object();
		list.add(obj);
		list.add("Snoopy");
		list.add(BigInteger("1000"));

		// 印出這個物件裡的所有元素

		// 使用Iterator
		System.out.println("使用Iterator");
		Iterator<Object> objs = list.iterator();
		while (objs.hasNext()) {
			System.out.print(objs.next() + " ");
		}
		System.out.println();

		// 使用傳統for
		System.out.println("====================================================================");
		System.out.println("使用傳統for");
		for (int i = 0; i < list.size(); i++) {
			Object o1 = list.get(i);
			System.out.print(o1 + " ");
		}

		// 使用foreach
		System.out.println("====================================================================");
		System.out.println("使用傳統foreach");
		for (Object c : list) {
			System.out.print(c + " ");
		}

		// 移除不是java.lang.Number相關的物件
		System.out.println("====================================================================");
		System.out.println("移除不是java.lang.Number相關的物件");
		for (int j = 0; j < list.size(); j++) {
			if (!(list.get(j) instanceof Number)) {
				list.remove(j);
				j--;
			} else {
				System.out.print(list.get(j) + " ");
			}
		}
	}

	private static Object BigInteger(String string) {
		return string;
	}
}
