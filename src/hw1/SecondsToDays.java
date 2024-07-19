//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

package hw1;

public class SecondsToDays {
	public static void main (String[] args) {
		int initialsecond = 256559;
		int second = initialsecond % 60;
		int minute = ((initialsecond - second )/ 60) % 60;
		int hour = (((initialsecond - second - minute*60) / 60) / 60) % 24;
		int day = (((initialsecond - second - minute*60 - hour*60*60 ) / 60) / 60) / 24;
		
	
		
		System.out.println("256559秒為 "+day+"天 "+hour+"小時 "+minute+"分 "+second+"秒");

		
		
	}

}
