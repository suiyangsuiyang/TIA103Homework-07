//請從無到有試著完成一個方法名為copyFile，
//這個方法有兩個參數。呼叫此方法時，第一個參數所代表的檔案會複製到第二個參數代表的檔案

package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HW7_3_CopyFile {

	public void copyFile(File x, File y) throws IOException {

//			檔案間傳輸，用FileInputStream,FileOutputStream搭配byte陣列 (用Reader/Writer會失敗)
		try {
			FileInputStream fis = new FileInputStream(x.getAbsolutePath());
			BufferedInputStream bis = new BufferedInputStream(fis);
//			InputStreamReader isr = new InputStreamReader(fis);
//			BufferedReader br = new BufferedReader(isr);

			FileOutputStream fos = new FileOutputStream(y.getAbsolutePath());
			BufferedOutputStream bos = new BufferedOutputStream(fos);
//			OutputStreamWriter osw = new OutputStreamWriter(fos);
//			BufferedWriter bw = new BufferedWriter(osw);

//			 使用FileInputStream,FileOutputStream 時, 解決中文碼印出問題
			int c;
			int i = 0;
			byte ch[] = new byte[(int) x.length()];
			while ((c = bis.read()) != -1) {
				bos.write(c);
				ch[i++] = (byte) c;
			}
			System.out.print(new String(ch));
			bos.flush();

//			br.close();
//			isr.close();
			bis.close();
			fis.close();

//			bw.close();
//			osw.close();
			bos.close();
			fos.close();

		} catch (IOException f) {
			System.err.print(f);
		}

	}

	public static void main(String[] args) throws IOException {
		HW7_3_CopyFile c = new HW7_3_CopyFile();

		File f1 = new File("hw7_3_file1test.txt");
		File f2 = new File("hw7_3_zzzzz.txt");
		c.copyFile(f1, f2);
	}

}
