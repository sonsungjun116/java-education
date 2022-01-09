package p2022_01_07;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		if((n1%4==0 && n1%100!=0)|| (n1%400==0))   {
			System.out.println("윤년입니다");
		}else {
			System.out.println("윤년이 아닙니다");
		}
	
	}

}
