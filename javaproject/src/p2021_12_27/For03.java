package p2021_12_27;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 1~100 홀수의 합과 짝수의 합을 구하는 프로그램을 작성하세요?
		int odd = 0;
		int	even = 0;
		
		for(int i=1;i<=100;i+=2) {
			odd +=i;
		}
		
		for(int i=0;i<=100;i+=2) {
			even +=i;
		}
		
		System.out.println("1~100 홀수의 합="+odd);
		System.out.println("1~100 짝수의 합="+even);
	}

}
