//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
//(請使用append功能讓每次執行結果都能被保存起來)

package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HW7_2_DataTxt {
	
	public static void main(String[] args) throws IOException {
		
		try {
		FileWriter fw = new FileWriter("C:\\TIA103_Workspace\\Homework-07\\hw7_2_Data.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		int k;
		for (int i = 0 ; i < 10 ; i++) {
			k = (int)(Math.random()*1000)+1;
			pw.print(k+"   ");

		}
		pw.println();
		pw.println("==========================================================");
		
		pw.close();
		bw.close();
		fw.close();

		}catch(IOException e){
			System.err.print(e);
		}
	}

}
