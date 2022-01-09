package p2021_12_22;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비교 연산자: >, <, >=, <=, ==(같다), !=(같지않다)
		// 비교 연산자의 결과가 참이면 true, 거짓이면 false값을 리턴한다.
	
	String str1 = "자바";
	String str2 = "자바"; //heap에 이미 자바 라는 공간을 차지하였기때문에 새로 만들지는 않는다
	String str3 = new String("자바"); //new로 하는 경우 heap에 동일한 값이 있더라도 새로운 주소를 만듬
	
	// 비교 연산자로 주소값을 비교
	if(str1 == str2) { //이미 str1에서 heap에 자바 주소를 할당하였기 때문 결과적으로 heap안의 같은 주소를 가르킴
		System.out.println("같은주소");
	}else {
		System.out.println("다른주소");
	}
	
	if(str1 == str3) { //같은 값을 가지지만 주소 값을 비교하기 때문에 서로 다른 주소로 나옴
		System.out.println("같은주소");
	}else {
		System.out.println("다른주소");
	}
	
	// 값을 비교
	System.out.println(str1.equals(str2));
	System.out.println(str1.equals(str3));
	
	
	}

}
