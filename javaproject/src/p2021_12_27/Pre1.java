package p2021_12_27;

import java.util.Scanner;

public class Pre1 {

	public static void main(String[] args) {
		
//입력한 값의 팩토리얼을 구하여라
	int n1;
	int s=1;
	System.out.println("정수를 입력 하세요");
	Scanner sc = new Scanner(System.in);
	n1 = sc.nextInt();		// n=3		3! = 3 * 2 * 1
	
	
	for(int i = n1; i>0; i--) {
		s*=i;
//		s = s * i
//		3 = 1 * 3
//		6 = 3 * 2	
//		6 = 6 * 1		
//	
	
	}
	System.out.println(n1+"!="+s);

		
	}

}
