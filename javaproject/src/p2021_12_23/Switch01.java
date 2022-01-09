package p2021_12_23;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		90점 이상 -A학점
//		80점 이상 -B학점
//		70점 이상 -C학점
//		60점 이상 -D학점
//		60점 미만 -F학점
		
		
		System.out.println("0~100점 사이의 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		//int와 int로 나누기 연산을 수행하면 int형으로 처리
		
		switch(s/10) {
		case 10:
		case 9: System.out.println("A학점");
				break;
		case 8: System.out.println("B학점");
				break;
		case 7: System.out.println("C학점");
				break;
		case 6: System.out.println("D학점");
				break;
		default: System.out.println("F학점");
		}
		
	}
}
