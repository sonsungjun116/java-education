package p2021_12_29;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// p167 ~ 168
// 배열 복사 : for문으로 배열 복사
		
		int[] oldArray = {10, 20, 30};
		int[] newArray = new int[5];
		
		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
			
		}
		
		for(int i : newArray) {
			System.out.print(i+"\t");
		}
	}

}
