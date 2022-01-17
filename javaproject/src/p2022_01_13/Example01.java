package p2022_01_13;

import java.text.SimpleDateFormat;
import java.util.Date;

// simpledate
public class Example01 implements Runnable {

	public void run() {
		Date d = new Date();
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss EEE요일");
//		System.out.println(s1.format(d));
		try {	
		while(true) {
//				System.out.println(s1.format(d));
				
				// 현재 CPU를 점유한 Thread 출력
//			System.out.println(Thread.currentThread().getName() + " : " + s1.format(d));
//			System.out.println(s1.format(d));
			System.out.println(new Date());
			//			System.out.println(s1.format(d));
			
				// sleep() 메소드를 사용해 프로그래머가 강제로
				// block 상태로 만듦.
			// 1초 동안 thread을 block 상태에 빠트림
				Thread.sleep(1000); // (단위: 1/1000 초)
		}
		
		}catch (InterruptedException ie) {
				System.out.println(ie.toString());
			}
		 // for end
	// run() end
	}
	
	public static void main(String[] args) {
		Example01 ts = new Example01();
			ts.run();
		//		Date d = new Date();
//		SimpleDateFormat s1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss EEE요일");
		// 두 개의 Thread를 생성시켜 실행시킴
		// 2개의 Thread가 동일한 우선 순위로 실행됨.(5인 상태)
		Thread first = new Thread(ts, "times");
//		Thread second = new Thread(ts, "second1");
		first.start();
//		second.start();
	}
}

