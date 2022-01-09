package p2021_12_31;



// 220 ~ 221

class Computer{
	
	// 주소값 전달에 의한 메소드 호출(Call by Reference방식) 
	int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// vargus : 전달된 값은 배열로 받음
	int sum2(int ... values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		
		int[] values1 = {1, 2, 3};	//values1은 stack, 1,2,3은 heap에 저장
		//	values1은 주소값, values은 heap에 있는1,2,3 위치를 알려줌
		// 주소값 전달에 의한 메소드 호출이 더 실용적임 ---> 메모리를 적게 차지함, 효율성 좋음
		int result1 = com.sum1(values1);	// sum1()메소드 호출
		System.out.println("result1:"+ result1);
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2:"+ result2);
		
		int result3 = com.sum2(1,2,3);
		System.out.println("result3:"+ result3);
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println("result4:"+ result4);
	}

}
