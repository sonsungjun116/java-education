package p2022_01_04;

import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
// 날짜 시간 관련 클래스 : Date, Timestamp
		
//	1. Date
		
		SimpleDateFormat sd0 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss EEE요일");
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss EEE요일");
	//	hh : 12시간제 시간
	//	HH : 24시간제 시간
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(sd0.format(d));
		System.out.println(sd1.format(d));
		
		
		
// 2. Timestamp
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		System.out.println(ts);
		System.out.println(sd1.format(ts));
		System.out.println(sf.format(ts));
		
		
	}

}
