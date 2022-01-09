package p2021_12_31;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// math를 사용해 난수를 발견 반복문을 사용, 중복된 숫자는 1번만 --->배열사용해야함
		// 1~45사이의 숫자를 6개 추출하는 프로그램
		
		
		
		
		int array[] = new int[6];
		int du[] = new int[6];
		
		for(int i=0;i<array.length;i++) {
			int num = (int) (Math.random() * 45) + 1;			
			array[i]=num;
			for(int k=0;k<array.length-1;k++) {
			if(array[i]==array[k])
			
			
			System.out.print(array[i]+"\t");
		}
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<du.length;j++) {
				if(array[i]==du[j]) {
					System.out.println(du[j]);
				}
			}
		}
		
		
	}

}
