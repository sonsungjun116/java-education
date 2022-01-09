package p2021_12_31;



// p217 ~ 218

class Calculator{
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
		return;			// 생략가능
	}
	
	int plus(int x, int y) { // 지역변수 : x, y, result
		int result = x + y;
		return result;
//		System.out.println("test");
	}
	// return문: plus() 메소드를 호출한 곳에 값을 돌려주는 역할
	// return문은 메소드 가장 마지막 줄에 사용해야 한다.
	
	double divide(int x, int y) {
		double result = x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.powerOn();
		
		int result1 = cal.plus(5, 6);
		System.out.println("result1:"+ result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x, y);
		System.out.println("result2:"+ result2);
		
		cal.powerOff();
	}

}
