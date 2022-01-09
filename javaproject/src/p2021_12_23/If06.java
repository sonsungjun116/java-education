package p2021_12_23;

public class If06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//난수 발생 공식
//난수 = (정수화) (Math.random() * (상한값-하한값+1) ) + 하한값;
		
// 난수 발생
//		0.0<= Math.random() < 1.0
		
		System.out.println(Math.E);			//E(자연로그)
		System.out.println(Math.PI);		//PI(원주율)
		System.out.println(Math.random());	// 난수 발생
		
// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int)(Math.random() * 6) +1;
		System.out.println("num="+num);
		
		if(num==1) {
			System.out.println("1번 주사위");
		}else if(num == 2) {
			System.out.println("2번 주사위");
		}else if(num == 3) {
			System.out.println("3번 주사위");
		}else if(num == 4) {
			System.out.println("4번 주사위");
		}else if(num == 5) {
			System.out.println("5번 주사위");
		}else{
			System.out.println("6번 주사위");
		}
	
	System.out.println("1~45사이의 난수 발생");
	int r = (int) (Math.random() * 45) + 1;
	System.out.println("난수 :"+r);
	
	
	
	
	
	
	}

}
