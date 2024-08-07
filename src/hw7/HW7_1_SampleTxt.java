//請自行建立一個文字檔Sample.txt
//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HW7_1_SampleTxt {

	public static void main(String[] args) throws IOException {
		int i;
		try {
			File f1 = new File("C:\\Users\\Tibame_T14\\Desktop\\緯育TIA103-JAVA技術養成班\\基礎JAVA(吳冠宏)\\作業\\Homework7附件\\\\Sample.txt");

			
			FileReader fr = new FileReader("C:\\Users\\Tibame_T14\\Desktop\\緯育TIA103-JAVA技術養成班\\基礎JAVA(吳冠宏)\\作業\\Homework7附件\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			String data;			
			int r = 0;
			int c = 0;
			
			
			while ((data = br.readLine()) != null) {
				r++;
				c+=data.replace(" ","").length();
//				c+=data.length();
				System.out.println(data);				
			}
			System.out.println();
			System.out.print("Sample.txt檔案共有"+f1.length()+" 個位元組，"+r + " 列資料，"+c + " 個字元(不含空白及換行)");
			
			br.close();
			fr.close();
		} catch (IOException e) {
		}
	}
}

		
//		p1("Sample.txt檔案 共有" + f1.length()+"個位元組，");

//		Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料


