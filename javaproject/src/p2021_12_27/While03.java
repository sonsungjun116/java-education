package p2021_12_27;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 키보드로 입력한 구구단1단을 while문을 이용해서 출력하는 프로그램을 작성 하세요?
		
		int i = 1;
		System.out.println("원하는 단을 입력하세요?");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		System.out.println("["+dan+"단]");
		while(i<=9) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
	}

}
