package p2021_12_27;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//단 for문 1개와 if~else문으로 작성 하세요
		
		int odd=0,even=0;
		
		for(int i=0; i<=100;i++) {
			if(i%2==1) {
				odd +=i;
			}else if(i%2==0) {
				even +=i;
			}
		}
	System.out.println(even);
	System.out.println(odd);
	
	}

}
