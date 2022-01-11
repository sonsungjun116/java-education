package p2022_01_11;

// 예외처리

//	1. try ~ catch 구문으로 예외처리
//		try{
//			예외가 발생할 가능성이 있는 문장;
//  	}catch(예외클래스명  매개변수){
//			예외 메시지;
//  }
//	2. 예외가 발생하지 않으면, try 구문 안에 있는 내용만 실행되고, catch구문은
//		실행되지 않는다.
//	3. 예외가 발생하면, 예외가 발생한 라인 아랫쪽 내용을 실행하지 않고
// 		catch 쪽으로 예외를 던지다.

public class DivideZeroExceptionHandling {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;

		// 두 수의 나눗셈 결과를 구한다

		try {
			c = b / a; // 예외발생
			int total = a + b; // 예외가 발생한 라인 아랫쪽 내용을 실행되지 않는다.
			int sub = b - a;

		} catch (ArithmeticException ae) {
			a = 2;
			c = b / a;
		}
		System.out.println(c);
	}
}
