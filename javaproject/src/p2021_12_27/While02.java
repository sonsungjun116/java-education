package p2021_12_27;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// while문을 이용해서 1~100까지 홀수, 짝수의 합을 구하는 프로그램을 작성하세요?
// 단, while문 1개와 if~else문으로 작성하세요?
		int odd =0,even=0;
		int i = 1;
		while(i<=100) {
			if(i%2==1) {
				odd += i;
			}else {
				even += i;
			}
			i++;
			}
		
		System.out.println("1~100홀수의합"+odd);
		System.out.println("1~100짝수의합"+even);
		
	}

}
