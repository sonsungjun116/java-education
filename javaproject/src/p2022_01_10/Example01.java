package p2022_01_10;

import java.util.GregorianCalendar;
import java.util.Scanner;


public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		GregorianCalendar g = new GregorianCalendar();
		if(g.isLeapYear(n1)) {
			System.out.println(n1 + "윤년입니다");
		}else {
			System.out.println(n1 + "평년입니다");
		}
	
	}

}
