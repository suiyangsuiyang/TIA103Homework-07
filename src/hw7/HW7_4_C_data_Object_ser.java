//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HW7_4_C_data_Object_ser implements Serializable {
	private static final long serialVersionUID = 2L;

	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		Object o1 = new HW7_4_Cat("cat1");
		Object o2 = new HW7_4_Cat("cat2");
		Object o3 = new HW7_4_Dog("dog1");
		Object o4 = new HW7_4_Dog("dog2");

		
		Object[] obj = new Object[4];
		obj[0] = o1;
		obj[1] = o2;
		obj[2] = o3;
		obj[3] = o4;

		FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < obj.length; i++) {
			oos.writeObject((Object) obj[i]);
		}

		oos.close();
		fos.close();
	}

}
