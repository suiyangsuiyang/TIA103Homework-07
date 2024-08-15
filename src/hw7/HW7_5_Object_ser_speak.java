//承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何
//(請利用多型簡化本題的程式設計)

package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class HW7_5_Object_ser_speak {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\data\\Object.ser");

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下");
		System.out.println("---------------------------");

		try {

			while (true) {
				Object obj1 = ois.readObject();

				if (obj1 instanceof HW7_4_Dog) {
					((HW7_4_Dog) obj1).speak();
				} else if (obj1 instanceof HW7_4_Cat) {
					((HW7_4_Cat) obj1).speak();
				}
			}

		} catch (EOFException e1) {
			System.out.println("資料讀取完畢");
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		ois.close();
		fis.close();

	}
}
