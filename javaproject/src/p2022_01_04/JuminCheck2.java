package p2022_01_04;

import java.util.Scanner;

public class JuminCheck2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("주민번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int answer[] = new int[12];		
		int x[] = {2,3,4,5,6,7}; //테스트 코드
		int x2[] = {8,9,2,3,4,5};
		
				System.out.println(s);
			String[] word;	
				word = s.split("");
				
		//		String[] jumin = s.split("-");
		//jumin[0] = 960116, jumin[1] = 1032818
		//스플릿으로 나누어서 두개의 배열을 만들어서 해결
		
		for(int i=0; i<word.length;i++) {
			System.out.println(word[i]);
			
//			answer[i] = x[i] * word[i];
		}
		
		
		
		
//		System.out.println(jumin);
//		String s2 = s.substring(0,1);
//		int num1 = Integer.parseInt(s2);
//		String s2 = s.substring(1,2);
//		int num1 = Integer.parseInt(s2);
//		String s2 = s.substring(2,3);
//		int num1 = Integer.parseInt(s2);
//		String s2 = s.substring3,4);
//		int num1 = Integer.parseInt(s2);
//		String s2 = s.substring(4,5);
//		int num1 = Integer.parseInt(s2);
//		String s2 = s.substring(5,6);
//		int num1 = Integer.parseInt(s2);
//		String s2 = s.substring(6,7);
//		int num1 = Integer.parseInt(s2);
//		String s2 = s.substring(7,8);
//		int num1 = Integer.parseInt(s2);
//		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(num1);
//		System.out.println(s2);
		
//		for(int i=0; i<12;i++) {
//		answer[i] = x[i]*	
//			
//		}
		
		
		
		
		
	}

}
