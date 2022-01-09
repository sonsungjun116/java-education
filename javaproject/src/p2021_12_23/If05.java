package p2021_12_23;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		90점 이상 -A학점
//		80점 이상 -B학점
//		70점 이상 -C학점
//		60점 이상 -D학점
//		60점 미만 -F학점
		
		System.out.println("0~100점 사이의 점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		if(s>=90) {
			System.out.println("A학점");
		}else if(s>=80) {
			System.out.println("B학점");
		}else if(s>=70) {
			System.out.println("C학점");
		}else if(s>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		
	}

}
