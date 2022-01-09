package p2022_01_03;

import java.util.Arrays;

class Lotto1 {

	public static void main(String[] args) {

		int num[] = new int[6];

		for (int i = 0; i < num.length; i++) {

			num[i] = (int) (Math.random() * 45) + 1;
//			num[0]=5, num[1]=5,
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--; // --를 함으로써 반복문을 빠져나가고 i를 가진 for문에서 한번의 반복을 수행한 것으로 간주하여 
					//다시 i값을 ++하는데 if문에 해당한다면 값이 중복이므로 결국 같은 인자의 배열을 
					//다시 난수를 구해 중복을 확인하게 된다.
					break;// break는 j를 가진 for문까지 나가짐,
				} // if end

			} // for end
		} // for end

		
		// 오름차순 정렬 : 버블정렬(자신의 옆자리에 있는 것과 비교)
		int temp = 0;
		for (int i = 0; i < num.length; i++){
			for (int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

//		Arrays.sort(num); // 오름차순 정렬

		for (int k : num) {
			System.out.print(k + "\t");
		}
	}
}

/*
 * 난수 발생 공식 난수 =(정수화) ((상한값-하한값+1)* Math.random()) + 하한값
 * 
 */