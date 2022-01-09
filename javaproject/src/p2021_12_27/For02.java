package p2021_12_27;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;		//지역 변수(local variable)
		for( int i=1;i<=3;i++) {	//지역 변수 : for문 안에서만 사용가능
			sum += i;
		
//		1 = 0 + 1
//		3 = 1 + 2
//		6 = 3 + 3
//		10 = 6 + 4
		
		System.out.println("1~"+i+"="+sum);
		}
	
	System.out.println("sum="+sum);
	
	
	}

}
