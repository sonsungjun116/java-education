package p2021_12_28;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//5개의 정수를 키보드로 입력받고 최대 최소값을 구하여라
		System.out.println("5개의 정수를 입력하세요");
		int[] data = new int[5];
		
		Scanner sc = new Scanner(System.in);
						
		for(int i =0; i <5; i++) {						
			data[i] = sc.nextInt();
			
		}
		int max=  data[0];
		int min= data[0];
			
			for (int j = 0; j <5; j++) {
			
				if(data[j] > max) {
				max = data[j];			
			}
			
			if(data[j] < min) {
				min = data[j];
			}			
			}
				
		
		System.out.println("max :" + max);
		System.out.println("min :" + min);

		
		
	}

}
