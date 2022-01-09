package p2022_01_05;

import java.util.Calendar;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR); 			// 2022
		int m = c.get(Calendar.MONTH) + 1;	 	// 월(0~11)
		int d = c.get(Calendar.DATE); 			// 일

		int h2 = c.get(Calendar.HOUR_OF_DAY);	//24시간
		int mm = c.get(Calendar.MINUTE);	// 분 
		int s = c.get(Calendar.SECOND);
		
		int dd = c.get(Calendar.DAY_OF_WEEK) ;
	     
	    String day = ""; 
	     
	    switch(dd){
	        case 1:
	            day = "일";
	            break ;
	        case 2:
	            day = "월";
	            break ;
	        case 3:
	            day = "화";
	            break ;
	        case 4:
	            day = "수";
	            break ;
	        case 5:
	            day = "목";
	            break ;
	        case 6:
	            day = "금";
	            break ;
	        case 7:
	            day = "토";
	            break ;
	             
	    }


	
		System.out.println(y + "-" + m + "-"+d+" "+ h2+":"+ mm+":"+s+" "+day+"요일");
	}

}
