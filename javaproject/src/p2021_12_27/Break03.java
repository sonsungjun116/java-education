package p2021_12_27;

public class Break03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 난수 발생: 0.0 <= Math.random() <1.0
		
		int i=1;
		while(true) {
			
			int num = (int) (Math.random() * 45) + 1; //난수 발생: 1~45
		System.out.println(num);
		
		if(num == 6) break;
		i++;
		}
		System.out.println("루프횟수"+ i);
		System.out.println("프로그램 종료");
		
	}

}
