package p2021_12_27;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//while문을 이용해서 구구단(2~9단)을 출력하는 프로그램을 작성하세요
		
		int i, dan=2;
		while(dan<10) {
			i=1;
			System.out.println("["+dan+"단]");
			while(i<10) {
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;	//i값이 10되어버리 while문이 멈춤				
			}
			System.out.println();
			dan++;
		}
	}

}
