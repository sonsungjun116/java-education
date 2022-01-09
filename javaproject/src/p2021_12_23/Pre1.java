package p2021_12_23;

import java.util.Scanner;

public class Pre1 {

	public static void main(String[] args) {
		
//입력한 값의 팩토리얼을 구하여라
	int n1;
	int s=1;
	Scanner sc = new Scanner(System.in);
	n1 = sc.nextInt();
	
	
	for(int i = n1; i>0; i--) {
		s*=i;
	}
	System.out.println(n1+"!="+s);

		
	}

}
