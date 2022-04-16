package p2022_01_03;

import java.util.Random;

public class RamdomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 난수 발생 방법: 1. Math.random()
//			  2. Ramdom 클래스
		
		Random r = new Random();
		
		int n1 = r.nextInt(10);		// 0 ~ 9
		System.out.println("n1="+n1);
		
		// 1 ~ 45 사이의 난수 발생
		int n2 = r.nextInt(45) + 1;
		System.out.println("n2="+n2);
		
		for(int i=1; i<=6;i++) {
			int n3 = r.nextInt(45) + 1;
			System.out.println(n3+"\t");
		}
		
		int n4 = (int)(Math.random() * 45) + 1;
		System.out.println("n4="+n4);
		
		int bookcount = 7;
		
		int array[] = new int[bookcount];
		for(int i=0; i < array.length; i++) {
			Random r1 = new Random();			
			int random = r1.nextInt(15);	// 0~15 사이의 랜덤값			
			random = array[i];
			
			System.out.println("random:"+ random);
		
		}
		
		
	}

}
