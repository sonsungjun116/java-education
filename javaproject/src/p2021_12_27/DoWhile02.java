package p2021_12_27;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// do ~ while문으로 1~100까지 홀수,짝수의 합을 구하는 프로그램을 작성하세요?
		
		int odd=0,even=0;
		int i=0;
		
		do {
			if(i%2==1) {
				odd +=i;
			}else {
				even +=i;
			}
			
			
		}while(i<=100);
		System.out.println("1~100까지 홀수의 합"+odd);
		System.out.println("1~100까지 짝수의 합"+even);
		
		
		
	}

}
