package p2022_01_04;

import java.util.*;

class StringTest04 {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#");

//		System.out.println(str.nextToken());	//이순신
//		System.out.println(str.nextToken());	//을지문덕
//		System.out.println(str.nextToken());	//강감찬
//		System.out.println(str.nextToken());	//광개토대왕
//		System.out.println(str.nextToken());	// 예외발생
		
		// 파싱된 문자열이 모두 몇 개인지 되는지 알려줌
		int cnt = str.countTokens();
		System.out.println("파싱할 문자열의 총갯수-> " + cnt);

	//	System.out.println(str.nextToken());
		while (str.hasMoreTokens()) { // 토큰이 있으면
			System.out.print(str.nextToken()+"\t");// 차례대로 파싱된 문자열을 얻어온다.
		}

		
		
	} // main() end

}