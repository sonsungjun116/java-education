package p2021_12_22;

import java.util.Scanner;

public class Pre01 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 
		
					
			System.out.println("정수 3개를 입력 하세요?");
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			
			int max = (n1 > n2) ? n1 : n2;	//최대값
			int max1 = (n3 > max)? n3 : max;
			int min = (n1 < n2) ? n1 : n2;	//최소값
			int min1 = (n3 < min)? n3 :min;
			
			System.out.println("max:"+max1);
			System.out.println("min:"+min1);
		}

	}
