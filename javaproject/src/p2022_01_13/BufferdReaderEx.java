package p2022_01_13;

import java.io.*;
public class BufferdReaderEx {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

// 키보드로 구구단 1개 단을 입력 받아서, 구구단 1개단을 출력하는 프로그램을 
// 작성하세요
		System.out.println("구구단입니다");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		try {
		String st = br.readLine();
		int num = Integer.parseInt(st);
				
		for(int i = 1; i<10; i++) {
			System.out.println("num"+ "*" + i + "=" + num * i );
//		}
//		}catch(Exception e) {
//			System.out.println("제대로 입력하세요");
//			e.printStackTrace();
		}
			
		
		
		
		
	}

}
