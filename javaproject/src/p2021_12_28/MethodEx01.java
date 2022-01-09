package p2021_12_28;

public class MethodEx01 {

// 메소드 
//	1. 여러가지 코드를 모아 놓은것
//	2. 메소드를 사용하는 이유는 코드를 재사용하기 위해서 메소드를 사용한다.
	
	// 사용자 정의 메소드
	// 사용자 정의 메소드는 프로그래머가 직접 호출해야 한다.
	 static void check() {	// static : 정적 메소드
			System.out.println("메소드 호출 성공");			
		return;		//void 사용시엔 return생략가능
	 }
	 // 값 전달에 의한 메소드 호출(Call by Value 방식)
	 static void check(int a) {
		 System.out.println("전달된 값:"+a);	//매개변수(parameter) : int a=30
		 
	 }
	
	 static void check(int a,double d) {
		 double result = a + d ;
		 System.out.println("전달된 값의 합:"+ result);
	 }
	 static void check(char c) {		// char c = 'A'
		 System.out.println("전달된 값:" + c);
	 }
	 static void check(boolean b) {		// boolean b = ture
		 System.out.println("전달된 값:" + b);
	 }
	 // 주소값 전달에 의한 메소드 호출 방식(Call by Reference 방식)
	 static void check(String s) {			// String s = "자바"
		 System.out.println("전달된 값:"+ s);	// String s = new String("자바")
	 }
	 // return 문 : 메소드를 호출한 곳에 값을 돌려 주는 역할
	 // return 문은 메소드 가장 마지막 줄에 사용해야 한다.
	 static int check01() {
		 
		 return 50;
	 }
	 static double check02(int a,double d) {
		 double result = a + d ;
		 return result;
	 }
	 
	// main() 메소드는 자바가상머신(JVM: java.exe)에 의해서 호출되어서 실행된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx01.check();	//메소드 호출
		check(30);	//원래는 메소드 명 앞에 클래스가 붙어야 하지만 같은 클래스 안에 있는 경우는 생략 가능
		check(10,10.5);
		check('A');
		check(true);
		check("자바");
		check(new String("자바"));
		
		check01();	// return 문으로 돌려받은 값이 출력되지 않는다.
		int result = check01();
		System.out.println("돌려 받은 값1:"+ result);
		System.out.println("돌려 받은 값2:"+ check01());
		
		double result2 = check02(50,3.14);
		System.out.println("돌려 받은 값3:"+result2);
		System.out.println("돌려 받은 값3:"+check02(50,3.14));
	}

	
	
}
