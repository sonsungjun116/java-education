package p2021_12_27;

public class Mission01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 구구단(2~9단)을 출력하는 프로그램을 작성 하세요?
		
		for(int k=2;k<=9;k++) {
			System.out.print("["+k+"단]"+"\t");
			
		}		
		System.out.println();
		
		for(int i=1; i<=9;i++) {			
			for(int j=2;j<=9;j++) {
				
				
			System.out.print(j+"*"+i+"="+j*i+"\t");
		}
		
		System.out.println();
		}
		
		
		
		
		
		
	}

}
