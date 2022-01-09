package p2022_01_04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 3. Calendar 클래스

//		Calendar c1 = new Calendar();	// 오류발생

		Calendar c2 = new GregorianCalendar();
		// 레퍼런스 형변환 : 업캐스팅--> 자식객체를 생성해서 부모에게 넘겨주는 것

		Calendar c = Calendar.getInstance(); 	// 가장많이 쓰는 형태
		System.out.println(c); 					// unix time
		System.out.println(Calendar.YEAR); 		// 1

		int y = c.get(Calendar.YEAR); 			// 2022
		int m = c.get(Calendar.MONTH) + 1;	 	// 월(0~11)
		int d = c.get(Calendar.DATE); 			// 일

		System.out.println(y + "-" + m + "-"+d);
		
		int h1 = c.get(Calendar.HOUR);			//12시간
		int h2 = c.get(Calendar.HOUR_OF_DAY);	//24시간
		
		int ap = c.get(Calendar.AM_PM);			//0:오전, 1:오후
		if(ap == 0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		
		int mm = c.get(Calendar.MINUTE);	// 분 
		int s = c.get(Calendar.SECOND);
		
		System.out.println(h1+":"+mm+":"+s);				// 12시간
		System.out.println(h2+":"+mm+":"+s);				// 24시간
	}

}
