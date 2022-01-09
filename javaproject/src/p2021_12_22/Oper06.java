package p2021_12_22;

import java.util.Scanner;

public class Oper06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	/*
	 * 조건 연산자
	 * 
	 * 변수 = (조건식) ? 값1 : 값2; 
	 * 조건식이 참이면 값1을 변수에 할당하고, 
	 * 조건식이 거짓이면 값2를 변수에 할당한다.
	 */
//	키보드로 입력한 정수2개 중에서 최대값과 최소값을 구하는 프로그램을 조건 연산자로
//	작성하세요
		
		System.out.println("정수 2개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		
		int max = (n1 > n2) ? n1 : n2;	//최대값
		int min = (n1 < n2) ? n1 : n2;	//최소값
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}

}
