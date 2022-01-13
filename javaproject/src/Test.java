import java.util.Date;

//java.lang 패키지 안에 들어가있는 것들은 import를 안해도 됨
public class Test {
//접근제어자		사용자 정의 클래스
//main메소드는 가상머신이 맨처음 실행하는 메소드이다
	public     static void main(String[] args) {
//  접근제어자 	공유			main메소드		
		
		
		// TODO Auto-generated method stub
		 System.out.println("자바 출력 성공1"); 
		 System.out.println("자바 출력 성공2"); 
		 System.out.println("자바 출력 성공3"); 
	while(true) {
	Date d = new Date();
	System.out.println(d);
	}
	}

}
// 자바의 주석
// 1.단일행 주석 : //
// 2.다중행 주석 : /*		*/

// Eclipse 단축키
// 실행 : ctrl + F11
// 주석 처리 : ctrl + /
// 블럭 주석 처리 : ctrl + shift + /
// 블럭 주석 해제 : ctrl + shift + \
// 복사 : ctrl + Alt + 아래 방향
// 한줄 삭제 : ctrl + D
// 이동 : Alt + 방향키
// 자동 import : Ctrl + Shift + o